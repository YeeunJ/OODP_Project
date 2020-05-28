package com.oodp.projectSupporter.login;

import java.sql.SQLException;

public class LoginCommand implements Command {
	private Login theLogin;
	public LoginCommand(Login theLogin) { this.theLogin = theLogin; }
	// Command 인터페이스의 execute 메서드
	public void execute() throws ClassNotFoundException, SQLException { theLogin.loginexe(); }
}
