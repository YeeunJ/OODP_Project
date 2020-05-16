package com.oodp.projectSupporter.dbconnection;
import java.sql.*;

public class connection {
    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
 
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
    
    public void readData() {
		try {
			// 쿼리문을 db에 넘김, 온전한 문자열 대입
			st = con.createStatement();

			String sql = "select * from user;";
			//rs:ResultSet은 실행한 쿼리문의 결과 값을 받아들이다.
			rs = st.executeQuery(sql);
			System.out.println(rs);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String mail = rs.getString("mail");
				String password = rs.getString("password");
				System.out.println(id + ", " + mail + ", " + password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	}
}
