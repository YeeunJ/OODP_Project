package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;

public class dao extends daoTemplate{
	Function c;
	public dao(Function c) {
		this.c = c;
		// TODO Auto-generated constructor stub
	}
	public void hookmethod1() {
		sql = c.sql();
	}
	public void hookmethod2() throws SQLException {
		c.setting(pstmt, rs);
	}
}
