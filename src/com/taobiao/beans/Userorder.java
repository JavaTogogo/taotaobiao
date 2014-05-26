package com.taobiao.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Userorder entity. @author MyEclipse Persistence Tools
 */

public class Userorder implements java.io.Serializable {

	// Fields

	private String id;
	private TUser TUser;
	private Timestamp orderTime;
	private Float totalPrice;
	private String ispay;
	private String issend;
	private String isconfirm;
	public Userorder(com.taobiao.beans.TUser tUser, Timestamp orderTime,
			Float totalPrice, String ispay, String issend, String isconfirm,
			String status) {
		super();
		TUser = tUser;
		this.orderTime = orderTime;
		this.totalPrice = totalPrice;
		this.ispay = ispay;
		this.issend = issend;
		this.isconfirm = isconfirm;
		this.status = status;
	}

	private String status;
	private Set orderDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userorder() {
	}

	/** minimal constructor */
	public Userorder(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	/** full constructor */
	public Userorder(TUser TUser, Timestamp orderTime, Float totalPrice,
			String ispay, String issend, String isconfirm, String status,
			Set orderDetails) {
		this.TUser = TUser;
		this.orderTime = orderTime;
		this.totalPrice = totalPrice;
		this.ispay = ispay;
		this.issend = issend;
		this.isconfirm = isconfirm;
		this.status = status;
		this.orderDetails = orderDetails;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getIspay() {
		return this.ispay;
	}

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

	public String getIssend() {
		return this.issend;
	}

	public void setIssend(String issend) {
		this.issend = issend;
	}

	public String getIsconfirm() {
		return this.isconfirm;
	}

	public void setIsconfirm(String isconfirm) {
		this.isconfirm = isconfirm;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

}