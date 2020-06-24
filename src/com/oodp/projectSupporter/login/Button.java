package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.userDTO;

public class Button {
	private Command theCommand;
	// 생성자에서 버튼을 눌렀을 때 필요한 기능을 인지로 받는다.
	public Button() {}
	public Button(Command theCommand) { setCommand(theCommand); }
	public void setCommand(Command newCommand) { this.theCommand = newCommand; }
	// 버튼이 눌리면 주어진 Command의 execute 메서드를 호출한다.
	public Boolean pressed() throws ClassNotFoundException, SQLException { return theCommand.execute();}
	
	public userDTO getData() {
		return theCommand.getData();
	}
}
