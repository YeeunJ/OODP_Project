package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dao.dao;
import com.oodp.projectSupporter.dao.logindao;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Login {
	logindao login;
	public Boolean loginexe(userDTO ud) throws ClassNotFoundException, SQLException{
		login = new logindao("login", ud);
		
		dao d = new dao(login);
		d.prepareDB();
		
		if(login.getResult()) {
			return true;
		}else {
			return false;
		}
	}
	
	public userDTO getData() {
		return (userDTO) login.getData();
	}
}
