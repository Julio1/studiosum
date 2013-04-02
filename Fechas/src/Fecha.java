import java.sql.Date;


public class Fecha {

	private Date fecha1;
	private Date fecha2;
	
	
	
	public Fecha (Date pfecha1, Date pfecha2){
		
		fecha1=pfecha1;
		fecha2=pfecha2;
						
	}
	
	
	
	public String toString (){
		
		String msj;
		
		msj="La fecha #1 es: "+fecha1 +"\n"; 
		msj="La fecha #1 es: "+fecha2 +"\n"; 
		
		
		return null;
		
		
		
	}
	
	
	
	
}
