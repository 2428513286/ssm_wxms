package com.lon.entity;

public class PublicTemplate {

	
	/**
	 * 编号id
		公众号编号pid
		模板编号tid
	 */
	
	private String id;
	private String pid;
	private String tid;
	
	
	public PublicTemplate() {
		super();
	}
	public PublicTemplate(String id, String pid, String tid) {
		super();
		this.id = id;
		this.pid = pid;
		this.tid = tid;
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
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Public_Template [id=" + id + ", pid=" + pid + ", tid=" + tid + "]";
	}
	
	
	
	
}
