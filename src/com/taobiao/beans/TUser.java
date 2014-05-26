package com.taobiao.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private String msn;
	private String qq;
	private String officePhone;
	private String homePhone;
	private String cellphone;
	private String email;
	private String passwordTip;
	private String passwordAnswer;
	private Timestamp lastLogintime;
	private Float balance;
	private Integer consume;
	private String level;
	private String status;
	private Set messages = new HashSet(0);
	private Set collects = new HashSet(0);
	private Set userorders = new HashSet(0);
	private Set consigneeAddresses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(Timestamp lastLogintime) {
		this.lastLogintime = lastLogintime;
	}

	/** full constructor */
	public TUser(String name, String password, String msn, String qq,
			String officePhone, String homePhone, String cellphone,
			String email, String passwordTip, String passwordAnswer,
			Timestamp lastLogintime, Float balance, Integer consume,
			String level, String status, Set messages, Set collects,
			Set userorders, Set consigneeAddresses) {
		this.name = name;
		this.password = password;
		this.msn = msn;
		this.qq = qq;
		this.officePhone = officePhone;
		this.homePhone = homePhone;
		this.cellphone = cellphone;
		this.email = email;
		this.passwordTip = passwordTip;
		this.passwordAnswer = passwordAnswer;
		this.lastLogintime = lastLogintime;
		this.balance = balance;
		this.consume = consume;
		this.level = level;
		this.status = status;
		this.messages = messages;
		this.collects = collects;
		this.userorders = userorders;
		this.consigneeAddresses = consigneeAddresses;
	}

	// Property accessors

	public TUser(String name, String password, String msn,
			String qq, String officePhone, String homePhone, String cellphone,
			String email, String passwordTip, String passwordAnswer,
			Timestamp lastLogintime, Float balance, Integer consume,
			String level, String status) {
		this.name = name;
		this.password = password;
		this.msn = msn;
		this.qq = qq;
		this.officePhone = officePhone;
		this.homePhone = homePhone;
		this.cellphone = cellphone;
		this.email = email;
		this.passwordTip = passwordTip;
		this.passwordAnswer = passwordAnswer;
		this.lastLogintime = lastLogintime;
		this.balance = balance;
		this.consume = consume;
		this.level = level;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordTip() {
		return this.passwordTip;
	}

	public void setPasswordTip(String passwordTip) {
		this.passwordTip = passwordTip;
	}

	public String getPasswordAnswer() {
		return this.passwordAnswer;
	}

	public void setPasswordAnswer(String passwordAnswer) {
		this.passwordAnswer = passwordAnswer;
	}

	public Timestamp getLastLogintime() {
		return this.lastLogintime;
	}

	public void setLastLogintime(Timestamp lastLogintime) {
		this.lastLogintime = lastLogintime;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public Integer getConsume() {
		return this.consume;
	}

	public void setConsume(Integer consume) {
		this.consume = consume;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getCollects() {
		return this.collects;
	}

	public void setCollects(Set collects) {
		this.collects = collects;
	}

	public Set getUserorders() {
		return this.userorders;
	}

	public void setUserorders(Set userorders) {
		this.userorders = userorders;
	}

	public Set getConsigneeAddresses() {
		return this.consigneeAddresses;
	}

	public void setConsigneeAddresses(Set consigneeAddresses) {
		this.consigneeAddresses = consigneeAddresses;
	}

}