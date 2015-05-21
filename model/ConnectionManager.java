package vn.globepoint.ojt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	Connection conn = null;
	
	public	Connection	getConnection() throws SQLException{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/GPV",
				"user",	
				"user");
		return conn;
	}
	public	void	closing(){
		if(conn != null )
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}



}
