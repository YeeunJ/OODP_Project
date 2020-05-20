package com.oodp.projectSupporter.meetingPage;

import java.sql.Date;

public class meetingDTO {
	private String when;
	private String title;
	private String content;
	
	
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
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
	
	@Override
	public String toString() {
		return "meetingDTO [when=" + when + ", title=" + title + ", content=" + content + "]";
	}
	
}
