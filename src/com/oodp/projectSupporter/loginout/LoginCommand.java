package com.oodp.projectSupporter.loginout;

public class LoginCommand extends DB implements Command{

	private String mail;
	private String password;
	private DB db;
	
	public LoginCommand(String mail, String password) {
		this.mail=mail;
		this.password=password;
	
	}
	
	
	//Override
	public void execute() {
		
		db.login(mail, password);
		
	}
	
}
