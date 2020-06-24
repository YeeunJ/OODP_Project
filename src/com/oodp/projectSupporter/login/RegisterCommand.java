package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.userDTO;

public class RegisterCommand implements Command{
	private Register theRegister;
	private userDTO ud;
	public RegisterCommand(userDTO ud) {
		this.theRegister= new Register();
		this.ud = ud;
		}
	// Command 인터페이스의 execute 메서드
	public Boolean execute() throws ClassNotFoundException, SQLException { theRegister.registerexe(ud); return true;}
	public userDTO getData() {
		return theRegister.getData();
	}
}
