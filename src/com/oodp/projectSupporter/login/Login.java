package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dao.dao;
import com.oodp.projectSupporter.dao.logindao;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Login {
	public Boolean loginexe(userDTO ud) throws ClassNotFoundException, SQLException{
		logindao login = new logindao("login", ud);
		dao d = new dao(login);
		/*
		if(login.getResult()) {
			return true;
		}else {
			return false;
		}*/
		return true;
	}
}
