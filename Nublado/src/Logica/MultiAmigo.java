package Logica;

import java.util.Date;
import AccesoBD.Conector;


public class MultiAmigo{
	
	
	public void crearAmigo (String pnombre, Date pfechaNascimiento){
	
	
	 String sql="INSERT INTO TAmigo (Nombre,FechaNac) VALUES ( '"+pnombre+"', #"+pfechaNascimiento+"#);";
		
		
	 try {
		Conector.getConector().ejecutarSQL(sql);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}
	
	
	
	
	
	
	
	
}