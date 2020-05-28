package com.oodp.projectSupporter.login;

import java.sql.SQLException;

public interface Command { 
	public abstract Boolean execute() throws ClassNotFoundException, SQLException; 
}