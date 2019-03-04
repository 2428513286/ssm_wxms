package com.lon.vo;

public class UserPublicNumberVo {

	private String id;
	private String user_name;
	private String pname;
	
	
	
	
	
	public UserPublicNumberVo() {
		super();
	}
	public UserPublicNumberVo(String id, String user_name, String pname) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.pname = pname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "UserPublicNumberVo [id=" + id + ", user_name=" + user_name + ", pname=" + pname + "]";
	}
	
	
}
