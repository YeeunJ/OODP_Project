package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class logindao implements function {
	DTO is;
	String check;
	Boolean result = false;
	public logindao(String check, DTO is) {
		this.check = check;
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	
	public logindao(String check) {
		this.check = check;
		// TODO Auto-generated constructor stub
	}
	public String sql() {
		String sql = null;
		if(check.compareTo("login") == 0) {
			sql = "select * from user left join participation on user.id = participation.user_id where mail = ?;";
		}else if(check.compareTo("check") == 0) {
			sql = "show tables";
		}
		return sql;
	}
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException {
		ArrayList<Integer> p_id = new ArrayList<Integer>();
		if(check.compareTo("login") == 0) {
			userDTO userInfo = (userDTO) is;
			pstmt.setString(1, userInfo.getMail());
			rs = pstmt.executeQuery();
			userDTO user = new userDTO();
			if(rs.next()) {
				if(rs.getString("password").compareTo(userInfo.getPassword())== 0) {
					result = true;
					user.setUser_id(rs.getInt("id"));
					user.setMail(rs.getString("mail"));
					user.setName(rs.getString("name"));
					p_id.add(rs.getInt("project_id"));
				}
		    }
			user.setProject_id(p_id);
			is = user;
		}else if(check.compareTo("check") == 0) {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("Tables_in_oodp_project"));
			}
		}
	}
	public Boolean getResult() {
		return result;
	}
	
	public DTO getData() {
		return is;
	}
}
