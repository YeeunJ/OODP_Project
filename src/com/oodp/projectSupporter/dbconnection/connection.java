package com.oodp.projectSupporter.dbconnection;
import java.sql.*;

public class connection {
    private Connection con;
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
 
    /**
     * 로드 연결을 위한 생성자
     * */
    
    public connection() {
        try {
            // 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 연결
            con = DriverManager
                    .getConnection("jdbc:mysql://db4free.net:3306/oodp_project?useSSL=false",
                            "oodp_b", "ece30012");
 
        } catch (ClassNotFoundException e) {
            System.out.println(e + "=> 로드 fail");
        } catch (SQLException e) {
            System.out.println(e + "=> 연결 fail");
        }
    }//생성자
    
    public Connection getConnection() {
    	return con;
    }
    
    public void dbClose() {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (ps != null)
				ps.close();
		} catch (Exception e) {
			System.out.println(e + "=> dbClose fail");
		}
	}
}
