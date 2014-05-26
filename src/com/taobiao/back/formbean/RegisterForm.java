package com.taobiao.back.formbean;

public class RegisterForm {
     private String id;
     private String password;
     private String confirmPassword;
     private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "RegisterForm [id=" + id + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", phone=" + phone
				+ "]";
	}
}
