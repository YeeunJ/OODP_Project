package com.oodp.projectSupporter.login;

public class LoginCommand implements Command {
	private Login theLogin;
	public LoginCommand(Login theLogin) { this.theLogin = theLogin; }
	// Command 인터페이스의 execute 메서드
	public void execute() { theLogin.loginexe(); }
}
