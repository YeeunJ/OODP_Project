package com.oodp.projectSupporter.login;

public class LogoutCommand implements Command{
	private Logout theLogout;
	public LogoutCommand(Logout theLogin) { this.theLogout = theLogin; }
	// Command 인터페이스의 execute 메서드
	public Boolean execute() { theLogout.logoutexe(); return true;}
}
