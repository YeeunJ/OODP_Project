package com.oodp.projectSupporter.dao;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;

public class Insertdao extends daoTemplate{
	DTO is;
	int result;
	public Insertdao(String check, DTO is) {
		super(check);
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	
	public void hookmethod1() {
		if(check.compareTo("taskPage") == 0) {
			sql = "INSERT INTO task (project_id, memeber_id, due_date, title, content, check) VALUES(?, ?, ?, ?, ?, 0);";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "INSERT INTO task (date, content, location, project_id, file) VALUES (?,?,?,?,?);";
		}
	}
	public void hookmethod2() throws SQLException {
		if(check.compareTo("taskPage") == 0) {
			taskDTO task = (taskDTO)is;
			pstmt.setLong(1, task.getProject_id());
		    pstmt.setLong(2, task.getMember_id());
		    pstmt.setString(3, task.getDue_date().toString());
		    pstmt.setString(4, task.getTitle());
		    pstmt.setString(5, task.getContent());
		}else if(check.compareTo("meetingPage") == 0) {
			meetingDTO meeting = (meetingDTO)is;
			pstmt.setString(1, meeting.getDate().toString());
			pstmt.setString(2, meeting.getContent());
			pstmt.setString(3, meeting.getLocation());
			pstmt.setLong(4, meeting.getProject_id());
		    pstmt.setString(5, meeting.getFile());
		}
		result = pstmt.executeUpdate();
	}
}
