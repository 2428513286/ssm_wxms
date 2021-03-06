<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>


<script type="text/javascript">

//将表单数据转为json
function form2Json(id) {

    var arr = $("#" + id).serializeArray();
    var jsonStr = "";

   	jsonStr += '{';
    for (var i = 0; i < arr.length; i++) {
        jsonStr += '"' + arr[i].name + '":"' + arr[i].value + '",'
    }
    jsonStr = jsonStr.substring(0, (jsonStr.length - 1));
    jsonStr += '}'

    var json = JSON.parse(jsonStr);
    return json;
}

var url = "";
$(function(){
	
	$("#dg").datagrid({
		idField:"id",
		url:"infoContentCheck/queryAll",
		queryParams: form2Json("searchform"),//查询参数
		columns:[[
			{field:"",checkbox:true},
			{field:"id",title:"编号",width:100,align:"center"},
			{field:"pid",title:"公众号",width:100,align:"center"},
			{field:"content",title:"消息内容",width:100,align:"center"},
			{field:"user_id",title:"发布人",width:100,align:"center"},
			{field:"applyTime",title:"提交时间",width:100,align:"center"},
			{field:"state",title:"审核是否通过",width:100,align:"center"},
			{field:"advice",title:"审核意见",width:100,align:"center"},
			{field:"checkedTime",title:"审核时间",width:100,align:"center"}
		]],
		fitColumns:true,
		toolbar: [{
			text:"新增",
			iconCls: 'icon-add',
			handler: function(){
				add();
			}
		},'-',{
			text:"修改",
			iconCls: 'icon-edit',
			handler: function(){
				update();
			}
		},'-',{
			text:"删除",
			iconCls: 'icon-remove',
			handler: function(){
				remove();
			}
		}],
		pagination:true,
		pageSize:30
	});
	
	//点击搜索
	$("#search_btn").click(function() {
        $('#dg').datagrid({ 
        	queryParams: form2Json("searchform")
        });   
    });
	//点击导出
	$("#export_btn").click(function(){
		$.messager.confirm("确定信息","确定要下载student.xls文件吗？",function(r){
			if(r){
				location.href="StudentServlet?opType=downloadxls&fileName=student.xls"
			}
		});
	});
	//点击导入
	$("#upload").click(function(){
		$.messager.confirm("确定信息",$("#sc").val(),function(r){
			if(r){
				location.href="StudentServlet?opType=uploadxls&file="+$("#sc").val()
			}
		});
	});
	
	
});
//删除记录
function remove(){
	var array = $("#dg").datagrid("getSelections");
	if(array.length==0){
		$.messager.alert("提示","请选择要删除的记录","info");
		return;
	}
	$.messager.confirm("提示","你确定要删除这"+array.length+"条记录吗？",function(r){
		if(r){
			var ids = "";
			for(var i=0;i<array.length;i++){
				ids += array[i].id+",";
			}
			ids = ids.substring(0,ids.length-1);
			$.ajax({
				url:"infoContentCheck/deleteMore",
				type:"post",
				data:"ids="+ids,
				dataType:"json",
				success:function(result){
					if(result.state==0){
						//刷新页面
						$("#dg").datagrid("reload");
						$.messager.alert("提示",result.msg,"info");
					}else{
						$.messager.alert("提示",result.msg,"error");
					}
					//清除之前选择的所有行
					$("#dg").datagrid("clearSelections");
				}
			});
		}
	});
}
//打开弹出框
function openFormDialog(){
	$("#dd").dialog({
		buttons:[{
			text:'保存',
			iconCls:"icon-save",
			handler:function(){
				save();
			}
		},{
			text:'关闭',
			iconCls:"icon-cancel",
			handler:function(){
				$("#dd").dialog("close");
			}
		}]
	});
	//打开对话框
	$("#dd").dialog("open");
}
//新增记录
function add(){
	//重置表单内容
    $("#ff").form("reset");
	//新增记录的请求地址
	url = "infoContentCheck/add";
	//打开弹出框
	openFormDialog();
	//设置弹出框标题
	$("#dd").dialog("setTitle","新增信息");
}
//修改记录
function update(){
	var array = $("#dg").datagrid("getSelections");
	if(array.length==0){
		$.messager.alert("提示","请选择要修改的记录","info");
		return;
	}else if(array.length>1){
		$.messager.alert("提示","每次只能修改一条记录","info");
		return;
	}
	//重置表单内容
    $("#ff").form("reset");
  	//修改记录的请求地址
	url = "infoContentCheck/update?id="+array[0].id;
	//表单填充内容
    $("#ff").form("load",array[0]);
  	//打开弹出框
	openFormDialog();
	//设置弹出框标题
	$("#dd").dialog("setTitle","修改信息");
}
//保存或者更新数据
function save(){
	$("#ff").form("submit",{
		url:url,
		onSubmit:function(){
			//调用validate方法校验表单中所有的字段有效性，只有所有的字段有效才返回true
			return $(this).form("validate");
		},
		success:function(result){
			//接收服务器返回的json格式字符串数据转换成json对象
		 	var data = eval('(' + result + ')');   
	        if (data.state==0){    
	           	$.messager.alert("提示消息",data.msg,"info"); 
	           	//刷新列表
	           	$("#dg").datagrid("reload");
	        } else{
	        	$.messager.alert("提示消息",data.msg,"error");
	        }
	        //关闭弹出框
	        $("#dd").dialog("close");
		}
	});
}


</script>
<style type="text/css">

.right{
	text-align: right;
}
</style>

</head>
<body>
	<div style="height: 5%">
		<form name="searchform" method="post" id ="searchform">
			账号：<input type="text" name="qusername" class="easyui-textbox" >
			姓名：<input type="text" name="qname" class="easyui-textbox">
			
		        <a id="search_btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
		        
		        <input id="sc" class="easyui-filebox" data-options="buttonText:'选择文件'">
	  	</form>
  	</div>
  	<div style="height: 95%">
		<table id="dg" fit="true"></table>
	</div>
	<div id="dd" class="easyui-dialog" style="width: 400px;text-align: center;padding: 10px;" closed="true">
		<form id="ff" method="post">
			<table style="margin: 0 auto;">
				<tr>
					<td class="right">公众号：</td>
					<td><input type="text" name="pid" class="easyui-textbox" data-options="required:true"></td>
				</tr>
				<tr>
					<td class="right">消息内容：</td>
					<td><input type="text" name="content" class="easyui-textbox" data-options="required:true"></td>
				</tr>
				<tr>
					<td class="right">发布人：</td>
					<td><input type="text" name="user_id" class="easyui-textbox" data-options="required:true"></td>
				</tr>
				<tr>
					<td class="right">提交时间：</td>
					<td><input type="text" name="applyTime" class="easyui-textbox" data-options="required:true"></td>
				</tr>
				<tr>
					<td class="right">审核是否通过：</td>
					<td><input type="text" name="state" class="easyui-textbox" data-options="required:true"></td>
				</tr>
				<tr>
					<td class="right">审核意见：</td>
					<td><input type="text" name="advice" class="easyui-textbox" data-options="required:true"></td>
				</tr>
				<tr>
					<td class="right">审核时间：</td>
					<td>	<input type="Timestamp" name="checkedTime" class="easyui-datetimebox" data-options="required:true,editable:false">
					</td>
				</tr>
				
				<!-- <tr>
					<td class="right">创建时间：</td>
					<td><input type="Timestamp" name="createTime" class="easyui-datetimebox" data-options="required:true,editable:false"></td>
				</tr> -->
				
				
			</table>
		</form>
	</div>
</body>
</html>