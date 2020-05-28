package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dao.logindao;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.userDTO;

public class Login {
	public void loginexe() throws ClassNotFoundException, SQLException{
		DTO is;
		is = new userDTO();
		logindao login = new logindao("login", is);
		login.prepareDB();
		if(login.getResult()) {
			System.out.println("login success!!");
		}else {
			System.out.println("login fail!!");
		}
	}
}
