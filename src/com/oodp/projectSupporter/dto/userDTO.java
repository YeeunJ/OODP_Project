package com.oodp.projectSupporter.dto;

public class userDTO implements DTO {
	private int user_id = 0;
	private String mail;
	private String password;
	private String name;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "userDTO [user_id=" + user_id + ", mail=" + mail + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
