package com.oodp.projectSupporter.dao;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Deletedao extends daoTemplate {
	DTO is;
	int r;
	public Deletedao(String check, DTO is) {
		super(check);
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	
	public void hookmethod1() {
		if(check.compareTo("taskPage") == 0) {
			sql = "DELETE FROM task WHERE project_id = ?;";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "DELETE FROM meeting WHERE project_id = ?;";
		}else if(check.compareTo("register") == 0) {
			sql = "DELETE FROM user WHERE project_id = ?;";
		}
	}
	public void hookmethod2() throws SQLException {
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
