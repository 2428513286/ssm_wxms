package com.lon.entity;

import java.util.Date;

public class PublicNumberFans {

	
	/**
	 * 编号id
		公众号pid
		新增粉丝数addFans
		减少粉丝数reduceFans
		统计日期countDate
	 */
	private String id;
	private int pid;
	private int addFans;
	private int reduceFans;
	private Date countDate;
	
	
	
	public PublicNumberFans() {
		super();
	}
	public PublicNumberFans(String id, int pid, int addFans, int reduceFans, Date countDate) {
		super();
		this.id = id;
		this.pid = pid;
		this.addFans = addFans;
		this.reduceFans = reduceFans;
		this.countDate = countDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getAddFans() {
		return addFans;
	}
	public void setAddFans(int addFans) {
		this.addFans = addFans;
	}
	public int getReduceFans() {
		return reduceFans;
	}
	public void setReduceFans(int reduceFans) {
		this.reduceFans = reduceFans;
	}
	public Date getCountDate() {
		return countDate;
	}
	public void setCountDate(Date countDate) {
		this.countDate = countDate;
	}

	@Override
	public String toString() {
		return "Public_Number_Fans [id=" + id + ", pid=" + pid + ", addFans=" + addFans + ", reduceFans=" + reduceFans
				+ ", countDate=" + countDate + "]";
	}
	
}
