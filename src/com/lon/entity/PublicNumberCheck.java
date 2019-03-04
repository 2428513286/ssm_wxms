package com.lon.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberCheck {

	
	/**
	 * 编号id
		公众号编号pid
		申请人编号user_id
		提交时间applyTime
		审核意见advice
		审核是否通过state
		审核时间checkedTime
	 */
	
	private String id;
	private String pid;
	private String user_id;
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;
	private String advice;
	private String state;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;
	
	public PublicNumberCheck() {
		super();
	}
	public PublicNumberCheck(String id, String pid, String user_id, Date applyTime, String advice, String state,
			Timestamp checkedTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.user_id = user_id;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
		return "Wxms_Public_Number_Check [id=" + id + ", pid=" + pid + ", user_id=" + user_id + ", applyTime="
				+ applyTime + ", advice=" + advice + ", state=" + state + ", checkedTime=" + checkedTime + "]";
	}
	
	
	
}
