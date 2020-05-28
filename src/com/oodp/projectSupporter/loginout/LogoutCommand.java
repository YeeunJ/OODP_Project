package com.oodp.projectSupporter.loginout;

public class LogoutCommand implements Command{
	private String mail;
	private DB db;
	
	public LogoutCommand(String mail) {
		this.mail=mail;
		
	}
	
	
	//Override
	public void execute() {
		
		db.logout(mail);
		
	}
}
