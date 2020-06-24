package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public String sql() {
		String sql = null;
		if(check.compareTo("login") == 0) {
			sql = "select * from user where mail = ?;";
		}
		return sql;
	}
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException {
		rs = pstmt.executeQuery();
		if(check.compareTo("login") == 0) {
			userDTO userInfo = (userDTO) is;
			pstmt.setString(1, userInfo.getMail());
			rs = pstmt.executeQuery();
			userDTO user = new userDTO();
			if(rs.next()) {
				if(rs.getString("password").compareTo(userInfo.getPassword())== 0) {
					result = true;
					user.setMail(rs.getString("mail"));
					user.setName(rs.getString("name"));
				}
		    }
		}
	}

}
