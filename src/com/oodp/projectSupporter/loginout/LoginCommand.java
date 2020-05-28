package com.oodp.projectSupporter.loginout;

public class LoginCommand implements Command{

	private String mail;
	private String password;
	
	public LoginCommand(String mail, String password) {
		this.mail=mail;
		this.password=password;
	
	}
	
	
	//Override
	public void execute() {
		
		
	}
	
}
