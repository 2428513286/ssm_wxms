package com.lon.vo;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberCheckVo {

	private String id;
	private String pname;
	private String user_name;
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;
	private String advice;
	private String state;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;
	
	
	
	public PublicNumberCheckVo() {
		super();
	}
	public PublicNumberCheckVo(String id, String pname, String user_name, Date applyTime, String advice, String state,
			Timestamp checkedTime) {
		super();
		this.id = id;
		this.pname = pname;
		this.user_name = user_name;
		this.applyTime = applyTime;
		this.advice = advice;
		this.state = state;
		this.checkedTime = checkedTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Timestamp getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(Timestamp checkedTime) {
		this.checkedTime = checkedTime;
	}
	@Override
	public String toString() {
		return "PublicNumberCheckVo [id=" + id + ", pname=" + pname + ", user_name=" + user_name + ", applyTime="
				+ applyTime + ", advice=" + advice + ", state=" + state + ", checkedTime=" + checkedTime + "]";
	}
	
	
	
}
