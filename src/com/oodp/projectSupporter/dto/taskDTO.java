package com.oodp.projectSupporter.dto;

import java.sql.Date;

public class taskDTO implements DTO{
	private int id;
	private int project_id;
	private int member_id;
	private String title;
	private String content;
	private Date due_date;
	private int check;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int memeber_id) {
		this.member_id = memeber_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", project_id=" + project_id + ", member_id=" + member_id + ", title=" + title
				+ ", content=" + content + ", due_date=" + due_date + ", check=" + check + "]";
	}
	
	
}
