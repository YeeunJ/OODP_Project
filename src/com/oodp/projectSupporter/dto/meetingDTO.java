package com.oodp.projectSupporter.dto;

import java.sql.Date;

public class meetingDTO implements DTO{
	private int id;
	private Date date;
	private String location;
	private String content;
	private int project_id;
	private String file;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	@Override
	public String toString() {
		return "meetingDTO [id=" + id + ", date=" + date + ", location=" + location + ", content=" + content
				+ ", project_id=" + project_id + ", file=" + file + "]";
	}
	
}
