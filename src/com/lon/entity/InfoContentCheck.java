package com.lon.entity;

import java.sql.Timestamp;
import java.util.Date;

public class InfoContentCheck {

	/**
	 * 编号id
		公众号pid
		消息内容content
		发布人user_id
		提交时间applyTime
		审核是否通过state
		审核意见advice
		审核时间checkedTime
	 */
	
	private String id;
	private String pid;
	private String content;
	private String user_id;
	private Date applyTime;
	private String state;
	private String advice;
	private Timestamp checkedTime;
	
	
	
	
	
	public InfoContentCheck() {
		super();
	}
	public InfoContentCheck(String id, String pid, String content, String user_id, Date applyTime, String state,
			String advice, Timestamp checkedTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.content = content;
		this.user_id = user_id;
		this.applyTime = applyTime;
		this.state = state;
		this.advice = advice;
		this.checkedTime = checkedTime;
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public Timestamp getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(Timestamp checkedTime) {
		this.checkedTime = checkedTime;
	}
	@Override
	public String toString() {
		return "Info_Content_Check [id=" + id + ", pid=" + pid + ", content=" + content + ", user_id=" + user_id
				+ ", applyTime=" + applyTime + ", state=" + state + ", advice=" + advice + ", checkedTime="
				+ checkedTime + "]";
	}

	
	
}
