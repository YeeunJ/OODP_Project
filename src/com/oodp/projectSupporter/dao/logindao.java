package com.oodp.projectSupporter.dao;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class logindao extends daoTemplate{
	DTO is;
	public logindao(String check, DTO is) {
		super(check);
		this.is = is;
		// TODO Auto-generated constructor stub
	}
	public void hookmethod1() {
		if(check.compareTo("login") == 0) {
			sql = "select * from user where mail = ?;";
		}
	}
	public void hookmethod2() throws SQLException {
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
