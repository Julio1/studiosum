package Logica;

import java.util.Date;



public class Gestor{
	
	
	
	public void registrarAmigo (String pnombre, Date pfechaNascimiento){
		
		MultiAmigo objMultiAmigo= new MultiAmigo();
		
		try {
			objMultiAmigo.crearAmigo(pnombre, pfechaNascimiento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
}