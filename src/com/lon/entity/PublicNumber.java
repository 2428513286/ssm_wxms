package com.lon.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumber {

	/**
	 * 编号id
		公众号帐号public_id
		公众号昵称public_name
		公众号性质public_type(1订阅号、2服务号、3企业号)
		公众号注册人名称name
		公众号注册联系方式phone
		公众号联系地址address
		公众号logo图片logo
		公众号注册日期regDate
		创建时间createTime
	 */
	
	private String id;
	private String public_id;
	private String public_name;
	private String public_type;
	private String name;
	private String phone;
	private String address;
	private String logo;
	@JSONField(format="yyyy-MM-dd")
	private Date regDate;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;
	
	
	
	
	
	public PublicNumber() {
		super();
	}
	public PublicNumber(String id, String public_id, String public_name, String public_type, String name, String phone,
			String address, String logo, Date regDate, Timestamp createTime) {
		super();
		this.id = id;
		this.public_id = public_id;
		this.public_name = public_name;
		this.public_type = public_type;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.logo = logo;
		this.regDate = regDate;
		this.createTime = createTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublic_id() {
		return public_id;
	}
	public void setPublic_id(String public_id) {
		this.public_id = public_id;
	}
	public String getPublic_name() {
		return public_name;
	}
	public void setPublic_name(String public_name) {
		this.public_name = public_name;
	}
	public String getPublic_type() {
		return public_type;
	}
	public void setPublic_type(String public_type) {
		this.public_type = public_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "PublicNumber [id=" + id + ", public_id=" + public_id + ", public_name=" + public_name + ", public_type="
				+ public_type + ", name=" + name + ", phone=" + phone + ", address=" + address + ", logo=" + logo
				+ ", regDate=" + regDate + ", createTime=" + createTime + "]";
	}
	
	
	
}
