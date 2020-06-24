package com.oodp.projectSupporter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface function {
	public String sql();
	public void setting(PreparedStatement pstmt, ResultSet rs) throws SQLException;

}
