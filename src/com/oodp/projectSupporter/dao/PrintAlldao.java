package com.oodp.projectSupporter.dao;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;

public class PrintAlldao extends daoTemplate{
	
	public PrintAlldao(String check) {
		super(check);
		// TODO Auto-generated constructor stub
	}
	public void hookmethod1() {
		if(check.compareTo("taskPage") == 0) {
			sql = "SELECT * FROM task;";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "SELECT * FROM meeting order by date DESC;";
		}
	}
	public void hookmethod2() throws SQLException {
		rs = pstmt.executeQuery();
		if(check.compareTo("taskPage") == 0) {
			taskDTO task;
			while(rs.next()) {
				task= new taskDTO();
			      task.setId(rs.getInt("id"));
			      task.setProject_id(rs.getInt("project_id"));
			      task.setMember_id(rs.getInt("member_id"));
			      task.setDue_date(rs.getDate("due_date"));
			      task.setTitle(rs.getString("title")); 
			      task.setContent(rs.getString("content"));
			      task.setCheck(rs.getInt("checked"));
			      data.add((DTO)task);
		    }
		}else if(check.compareTo("meetingPage") == 0) {
			meetingDTO meeting;
			while(rs.next()) {
			    meeting = new meetingDTO();
			    meeting.setId(rs.getInt("id"));
			    meeting.setDate(rs.getDate("date"));
			    meeting.setContent(rs.getString("content"));
			    meeting.setLocation(rs.getString("location"));
			    meeting.setProject_id(rs.getInt("project_id"));
			    meeting.setFile(rs.getString("file"));
			    data.add((DTO)meeting);
			    } 
		}
	}
}
