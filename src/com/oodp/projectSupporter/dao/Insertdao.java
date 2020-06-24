package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Insertdao implements function{
	String check;
	DTO is;
	int r;
	public Insertdao(String check, DTO is) {
		this.check = check;
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	
	public String sql() {
		String sql = null;
		if(check.compareTo("taskPage") == 0) {
			sql = "INSERT INTO task (project_id, member_id, due_date, title, content, check) VALUES(?, ?, ?, ?, ?, 0);";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "INSERT INTO meeting (date, content, location, project_id, file) VALUES (?,?,?,?,?);";
		}else if(check.compareTo("register") == 0) {
			sql = "INSERT INTO user (mail, password, name) VALUES (?,?,?);";
		}
		return sql;
	}
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException {
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
		}else if(check.compareTo("register") == 0) {
			userDTO user = (userDTO)is;
			pstmt.setString(1, user.getMail());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
		}
		r = pstmt.executeUpdate();
	}
}
