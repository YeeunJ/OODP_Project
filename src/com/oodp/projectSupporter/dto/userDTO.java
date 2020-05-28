package com.oodp.projectSupporter.dto;

public class userDTO implements DTO {
	private String mail;
	private String password;
	private String name;
	
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
		return "userDTO [mail=" + mail + ", password=" + password + ", name=" + name + "]";
	}
}
