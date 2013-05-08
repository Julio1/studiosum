package AccesoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MultiConector {
	
	
private  String usuario= "";	
private  String password= "";	
private  String conexion= "jdbc:sqlserver://localhost;databaseName=BDJaguar;integratedSecurity=true;";	
	

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;


public MultiConector () throws SQLException{
	
	conn = DriverManager.getConnection(conexion, usuario, password);
	stmt = conn.createStatement();
		
}



public void ejecutarSQL(String psentencia) throws SQLException{
	
	stmt.execute(psentencia);
	
}


public ResultSet ejecutarSQLDevuelve (String psentencia) throws SQLException ,Exception{
	
	rs=stmt.executeQuery(psentencia);
	
	return rs;
}



	
	
}

