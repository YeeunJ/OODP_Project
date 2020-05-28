package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.userDTO;

public class LoginCommand implements Command {
	private Login theLogin;
	private userDTO ud;
	public LoginCommand(Login theLogin, userDTO ud) { 
		this.theLogin = theLogin; 
		this.ud = ud;
	}
	// Command 인터페이스의 execute 메서드
	public Boolean execute() throws ClassNotFoundException, SQLException { return theLogin.loginexe(ud); }
}
