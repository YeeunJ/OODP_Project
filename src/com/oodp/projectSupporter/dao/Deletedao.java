package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Deletedao implements function {
	String check;
	DTO is;
	int r;
	public Deletedao(String check, DTO is) {
		this.check = check;
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	
	public String sql() {
		String sql = null;
		if(check.compareTo("taskPage") == 0) {
			sql = "DELETE FROM task WHERE project_id = ?;";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "DELETE FROM meeting WHERE project_id = ?;";
		}else if(check.compareTo("register") == 0) {
			sql = "DELETE FROM user WHERE project_id = ?;";
		}
		return sql;
	}
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if(check.compareTo("taskPage") == 0) {
			taskDTO task = (taskDTO)is;
			pstmt.setLong(1, task.getProject_id());
		}else if(check.compareTo("meetingPage") == 0) {
			meetingDTO meeting = (meetingDTO)is;
			pstmt.setLong(1, meeting.getProject_id());
		}else if(check.compareTo("register") == 0) {
			userDTO user = (userDTO)is;
			pstmt.setString(1, user.getMail());
		}
		r = pstmt.executeUpdate();
	}
}
