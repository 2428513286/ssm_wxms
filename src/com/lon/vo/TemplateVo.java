package com.lon.vo;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class TemplateVo {

	private String id;
	private String name;
	private String content;
	private String type;
	private String remark;
	private String user_name;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;
	
	
	
	
	
	
	public TemplateVo() {
		super();
	}
	public TemplateVo(String id, String name, String content, String type, String remark, String user_name,
			Timestamp createTime) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.type = type;
		this.remark = remark;
		this.user_name = user_name;
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
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "TemplateVo [id=" + id + ", name=" + name + ", content=" + content + ", type=" + type + ", remark="
				+ remark + ", user_name=" + user_name + ", createTime=" + createTime + "]";
	}
	
	
}
