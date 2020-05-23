package com.oodp.projectSupporter.taskpage;

import java.sql.*;
import java.util.ArrayList;

import com.oodp.projectSupporter.dbconnection.connection;

public class taskDAO {
	private static taskDAO taskDAO;
	  private connection mysqlDB;
	   
	  Connection conn;
	  PreparedStatement pstmt;
	  ResultSet rs;
	  StringBuffer query;
	  
	  taskDTO task;
	  ArrayList<taskDTO> tasks;
	 
	  private taskDAO() {}
	   
	  public static taskDAO getInstance() {
	    if(taskDAO == null) {
	      taskDAO = new taskDAO();
	    }
	    return taskDAO;
	  }
	   //branch test!!
	  public synchronized int insertTask(taskDTO task) throws SQLException {
	    conn = mysqlDB.getConnection();
	    query = new StringBuffer();
	    query.append("INSERT INTO task (project_id, memeber_id, due_date, title, content, check)");
	    query.append("VALUES(?, ?, ?, ?, ?, 0);");
	    pstmt = conn.prepareStatement(query.toString());

	    pstmt.setLong(1, task.getProject_id());
	    pstmt.setLong(2, task.getMember_id());
	    pstmt.setString(3, task.getDue_date().toString());
	    pstmt.setString(4, task.getTitle());
	    pstmt.setString(5, task.getContent());
	     
	    int result = pstmt.executeUpdate();
	     
	    disconnect();
	     
	    return result;
	  }
	   
	  public ArrayList<taskDTO> selectAllTask() throws ClassNotFoundException, SQLException {
		mysqlDB = new connection();
		conn = mysqlDB.getConnection();
		
	    query = new StringBuffer();
	    query.append("SELECT * FROM task;");
	    pstmt = conn.prepareStatement(query.toString());
	    rs = pstmt.executeQuery();
	    
	    while(rs.next()) {
	      task = new taskDTO();
	      task.setId(rs.getInt("id"));
	      task.setProject_id(rs.getInt("project_id"));
	      task.setMember_id(rs.getInt("member_id"));
	      task.setDue_date(rs.getDate("due_date"));
	      task.setTitle(rs.getString("title")); 
	      task.setContent(rs.getString("content"));
	      task.setCheck(rs.getInt("checked"));
	      tasks.add(task);
	    } 
	     
	    disconnect();
	     
	   return tasks;
	  }
	   
	  public void disconnect() throws SQLException {
	    if(rs != null) {
	      rs.close();
	    }
	    pstmt.close();
	    conn.close();
	  }
}
