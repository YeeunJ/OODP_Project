package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.userDTO;

public class Button {
	private LoginCommand lCommand;
	private RegisterCommand rCommand;
	// 생성자에서 버튼을 눌렀을 때 필요한 기능을 인지로 받는다.
	public Button() {}
	public Button(LoginCommand theCommand) { setCommand(lCommand); this.rCommand = null;}
	public Button(RegisterCommand theCommand) { setCommand(rCommand); this.lCommand = null;}
	public void setCommand(LoginCommand newCommand) { this.lCommand = newCommand; }
	public void setCommand(RegisterCommand newCommand) { this.rCommand = newCommand; }
	// 버튼이 눌리면 주어진 Command의 execute 메서드를 호출한다.
	public Boolean pressed() throws ClassNotFoundException, SQLException { 
		if( rCommand != null)return rCommand.execute();
		else if ( lCommand != null)return lCommand.execute();
		else
			return false;
			}
	
	public userDTO getData() {
		if( rCommand != null)return rCommand.getData();
		else if ( lCommand != null)return lCommand.getData();
		else
			return null;
	}
}
