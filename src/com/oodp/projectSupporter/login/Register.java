package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dao.Function;
import com.oodp.projectSupporter.dao.Insertdao;
import com.oodp.projectSupporter.dao.dao;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Register {
	public void registerexe() throws ClassNotFoundException, SQLException{
		DTO is;
		is = new userDTO();
		dao regist = new dao(new Insertdao("register", is));
		regist.prepareDB();
	}
}
