package com.shiro.pojo;

import java.util.List;

public class User {
	    
		private String id;//id
		private String username;//账号
		private String realname;//真实姓名
		private String password;//密码
		private Integer gender;//性别
		private String address;//地址
		private String phone;//手机
		private String email;//邮箱
		
		
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getRealname() {
			return realname;
		}
		public void setRealname(String realname) {
			this.realname = realname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Integer getGender() {
			return gender;
		}
		public void setGender(Integer gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", realname="
					+ realname + ", password=" + password + ", gender="
					+ gender + ", address=" + address + ", phone=" + phone
					+ ", email=" + email + "]";
		}
}
