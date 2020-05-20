package com.oodp.projectSupporter.meetingPage;

import java.sql.*;
import java.util.ArrayList;

import com.oodp.projectSupporter.dbconnection.connection;




public class meetingDAO {
	private static meetingDAO meetingDAO;
	  private connection mysqlDB = new connection();
	   
	  Connection conn;
	  PreparedStatement pstmt;
	  ResultSet rs;
	  StringBuffer query;
	
	  meetingDTO meeting;
	  ArrayList<meetingDTO> meetings;
	  
	  private meetingDAO() {}
	  
	  public static meetingDAO getInstance() {
		    if(meetingDAO == null) {
		    	meetingDAO = new meetingDAO();
		    }
		    return meetingDAO;
		  }
	  
	  
	  public synchronized int insertTask(meetingDTO meeting) throws ClassNotFoundException, SQLException {
		    conn = mysqlDB.getConnection();
		    query = new StringBuffer();
		    query.append("INSERT INTO task (when, title, content )");
		    query.append("VALUES(?, ?, ?);");
		    pstmt = conn.prepareStatement(query.toString());
		    // parameterIndex�뒗 荑쇰━臾몄쓽 ? �닚�꽌��濡� �쟻�뼱二쇰ŉ, 1遺��꽣 �떆�옉�븳�떎.
		    pstmt.setString(1, meeting.getWhen());
		    pstmt.setString(2, meeting.getTitle());
		    pstmt.setString(3, meeting.getContent().toString());
		  
		    int result = pstmt.executeUpdate();
		     
		    disconnect();
		     
		    return result;
		  }
	
	  
	  public ArrayList<taskDTO> selectAllTask() throws ClassNotFoundException, SQLException {
		    conn = mysqlDB.getConnection();
		    query = new StringBuffer();
		    query.append("SELECT * FROM meeting");
		    pstmt = conn.prepareStatement(query.toString());
		    rs = pstmt.executeQuery();
		     
		    while(rs.next()) {
		    meeting = new meetingDTO();
		    meeting.setWhen(rs.getString("when"));
		    meeting.setTitle(rs.getString("title"));
		    meeting.setContent(rs.getString("content"));
		    
		    meetings.add(meeting);
		    } 
		     
		    disconnect();
		     
		    return meetings;
		  }
	  
	  
	  public void disconnect() throws SQLException {
		    if(rs != null) {
		      rs.close();
		    }
		    pstmt.close();
		    conn.close();
		  }
	
}
