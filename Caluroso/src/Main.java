

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private static final String USERNAME = " ";
	private static final String PASSWORD = " ";
	private static final String CONN_STRING ="jdbc:sqlserver://localhost;databaseName=Lluvioso;integratedSecurity=true;";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			 stmt.executeQuery("INSERT INTO [TAmigo] ([Nombre],[FechaNac])  VALUES  ('Jayce the ace','3-30-1991')");
			System.out.println("Connected."); 

			
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
	}

}
