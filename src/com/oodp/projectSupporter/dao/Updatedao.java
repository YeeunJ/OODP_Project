package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Updatedao implements Function {
	DTO is;
	int r;
	String check;
	public Updatedao(String check, DTO is) {
		this.check = check;
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	
	public String sql() {
		String sql = null;
		if(check.compareTo("taskPage") == 0) {
			sql = "UPDATE task SET member_id = ?, due_date = ?, title = ?, content = ?, check = ? WHERE project_id = ?;";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "UPDATE meeting SET date = ?, content = ?, location = ?, file = ? WHERE project_id = ?";
		}else if(check.compareTo("register") == 0) {
			sql = "UPDATE user SET mail = ?, password = ?, name = ? WHERE user_id = ?;";
		}
		return sql;
	}
	
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if(check.compareTo("taskPage") == 0) {
			taskDTO task = (taskDTO)is;
		    pstmt.setLong(1, task.getMember_id());
		    pstmt.setString(2, task.getDue_date().toString());
		    pstmt.setString(3, task.getTitle());
		    pstmt.setString(4, task.getContent());
		    pstmt.setLong(5, task.getProject_id());
		}else if(check.compareTo("meetingPage") == 0) {
			meetingDTO meeting = (meetingDTO)is;
			pstmt.setString(1, meeting.getDate().toString());
			pstmt.setString(2, meeting.getContent());
			pstmt.setString(3, meeting.getLocation());
		    pstmt.setString(4, meeting.getFile());
		    pstmt.setLong(5, meeting.getProject_id());
		}else if(check.compareTo("register") == 0) {
			userDTO user = (userDTO)is;
			pstmt.setString(1, user.getMail());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setInt(3, user.getUser_id());
		}
		r = pstmt.executeUpdate();
	}
}
