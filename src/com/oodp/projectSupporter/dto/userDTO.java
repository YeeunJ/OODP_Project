package com.oodp.projectSupporter.dto;

import java.util.ArrayList;

public class userDTO implements DTO {
	private int user_id = 0;
	private String mail;
	private String password;
	private String name;
	private ArrayList<String> project_name;
	private ArrayList<Integer> project_id;
	
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
	public ArrayList<String> getProject_name() {
		return project_name;
	}
	public void setProject_name(ArrayList<String> project_name) {
		this.project_name = project_name;
	}
	public ArrayList<Integer> getProject_id() {
		return project_id;
	}
	public void setProject_id(ArrayList<Integer> project_id) {
		this.project_id = project_id;
	}
	@Override
	public String toString() {
		return "userDTO [user_id=" + user_id + ", mail=" + mail + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
