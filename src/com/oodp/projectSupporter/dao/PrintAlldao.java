package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;

public class PrintAlldao implements function{
	String check;
	ArrayList<DTO> data;
	
	public PrintAlldao(String check) {
		this.check = check;
		// TODO Auto-generated constructor stub
	}
	public String sql() {
		String sql = null;
		if(check.compareTo("taskPage") == 0) {
			sql = "SELECT * FROM task;";
		}else if(check.compareTo("meetingPage") == 0) {
			sql = "SELECT * FROM meeting order by date DESC;";
		}
		return sql;
	}
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException {
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
