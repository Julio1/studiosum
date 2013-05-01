package AccesoBD;


public class Conector {
	
	
	private static AccesoBD conectorBD = null;
	
	
	
	
	public static AccesoBD getConector() throws 
	java.sql.SQLException,Exception{
		if (conectorBD == null){			
			conectorBD = new AccesoBD("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost;databaseName=Lluvioso;integratedSecurity=true;","","");
			
			//conectorBD = new AccesoBD("jdbc:sqlserver://JULIO-PC\\SQLEXPRESS","jdbc:odbc:Lluvioso","","");
			

		}
		return conectorBD;
	}	
	
	
}