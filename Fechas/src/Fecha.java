import java.text.SimpleDateFormat;
import java.util.Date;




public class Fecha {

	private Date fecha1;
	//private Date fecha2;
	
	public Fecha ( ){
		
	
						
	}
	
	public Fecha (Date pfecha1/*, Date pfecha2*/){
		
		
		setFecha1(pfecha1);
	
						
	}
	
	public Date getFecha1() {
		return fecha1;
	}

	public void setFecha1(Date pfecha1) {
		this.fecha1 = pfecha1;
	}
	
	/*
	public Date getFecha2() {
		return fecha2;
	}


	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}
*/
	
	public String toString (){
		
		String msj;
		
		msj="La fecha #1 es: "+getFecha1() +"\n"; 
//		msj+="La fecha #2 es: "+fecha2 +"\n"; 
		
		
		return msj;
		
		
		
	}
	
	
	
	
}
