package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dao.Insertdao;
import com.oodp.projectSupporter.dao.dao;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Register {
	DTO is;
	public void registerexe(userDTO user) throws ClassNotFoundException, SQLException{
		is = user;
		Insertdao regist = new Insertdao("register", is);
		dao d = new dao(regist);
		d.prepareDB();
	}
	public userDTO getData() {
		return (userDTO) is;
	}
}
