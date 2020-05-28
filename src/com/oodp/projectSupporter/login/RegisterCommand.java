package com.oodp.projectSupporter.login;

import java.sql.SQLException;

public class RegisterCommand {
	private Register theRegister;
	public RegisterCommand(Register theRegister) { this.theRegister = theRegister; }
	// Command 인터페이스의 execute 메서드
	public void execute() throws ClassNotFoundException, SQLException { theRegister.registerexe(); }
}
