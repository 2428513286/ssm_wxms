package com.lon.entity;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class Template {

	/**
	 * 编号id
		名称name
		内容content
		类型type(1图片、2文字、3图文混合)
		备注remark
		创建人user_id
		创建时间createTime
	 */
	
	private String id;
	private String name;
	private String content;
	private String type;
	private String remark;
	private String user_id;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;
	
	
	
	public Template() {
		super();
	}
	public Template(String id, String name, String content, String type, String remark, String user_id,
			Timestamp createTime) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.type = type;
		this.remark = remark;
		this.user_id = user_id;
		this.createTime = createTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Wxms_Template [id=" + id + ", name=" + name + ", content=" + content + ", type=" + type + ", remark="
				+ remark + ", user_id=" + user_id + ", createTime=" + createTime + "]";
	}
	
	
	
	
	
}
