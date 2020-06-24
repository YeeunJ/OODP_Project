package com.oodp.projectSupporter.login;

import java.sql.SQLException;

import com.oodp.projectSupporter.dto.userDTO;

public interface Command { 
	public abstract Boolean execute() throws ClassNotFoundException, SQLException; 
	public userDTO getData();
}