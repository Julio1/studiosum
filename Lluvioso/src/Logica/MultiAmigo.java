package Logica;

import java.io.PrintStream;
import java.util.Date;
import AccesoBD.Conector;


public class MultiAmigo{
	static PrintStream out= System.out;
	
	public void crearAmigo (String pnombre, Date pfechaNascimiento){
	
		java.sql.Date pfechaNascimientoSql = new java.sql.Date(pfechaNascimiento.getTime()); 
		
		out.println("la fecha del nascimiento sin formatear: "+ pfechaNascimiento+"\n");
		
		out.println("la fecha del nascimiento con formato"+ pfechaNascimientoSql+"\n");
		
		
	 //String sql="INSERT INTO TAmigo (Nombre,FechaNac) VALUES ( '"+pnombre+"', #"+pfechaNascimiento+"#)";
		String sql="INSERT INTO [TAmigo] ([Nombre],[FechaNac])  VALUES  ('"+pnombre+ "',' " +pfechaNascimientoSql+ "')";
		
	 try {
		Conector.getConector().ejecutarSQL(sql);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}
	
	
	
	
	
	
	
	
}