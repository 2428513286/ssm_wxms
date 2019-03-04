package com.lon.entity;

import java.sql.Timestamp;

public class InfoContent {

	
	/**
	 * 编号id
		公众号pid
		内容content
		内容模版tid
		发布人user_id
		发布时间createTime
	 */
	
	private String id;
	private String pid;
	private String content;
	private String tid;
	private String user_id;
	private Timestamp createTime;
	
	
	public InfoContent() {
		super();
	}
	public InfoContent(String id, String pid, String content, String tid, String user_id, Timestamp createTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.content = content;
		this.tid = tid;
		this.user_id = user_id;
		this.createTime = createTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
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
		return "Info_Content [id=" + id + ", pid=" + pid + ", content=" + content + ", tid=" + tid + ", user_id="
				+ user_id + ", createTime=" + createTime + "]";
	}
	
	
}
