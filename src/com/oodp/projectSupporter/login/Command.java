package com.oodp.projectSupporter.login;

import java.sql.SQLException;

public interface Command { 
	public abstract void execute() throws ClassNotFoundException, SQLException; 
}