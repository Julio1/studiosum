import java.text.SimpleDateFormat;
import java.util.Date;




public class Fecha {

	private Date fecha1;
	private Date fecha2;
	
	public Fecha ( ){}
	
	public Fecha (Date pfecha1, Date pfecha2){
				
		setFecha1(pfecha1);
		setFecha2(pfecha2);
						
	}
	
	public Date getFecha1() {
		return fecha1;
	}

	public void setFecha1(Date pfecha1) {
		this.fecha1 = pfecha1;
	}
	
	
	public Date getFecha2() {
		return fecha2;
	}


	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}

	public String toString (){
		
		String msj;
		
		msj="La fecha #1 es: "+ getFecha1() +"\n"; 
		msj+="La fecha #2 es: "+ getFecha2() +"\n"; 
		msj+="Comparacion: " + compararFechas ()+"\n";
		msj+="\n";
		
		return msj;
				
		
	}
	
	
	
	public String  compararFechas (){
		
		String msj="";
		
		//try{
			 
    		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        	Date date1 = getFecha1();
        	Date date2 = getFecha2();
 
        	if(date1.after(date2)){
        		msj="Fecha #1 se ubica despues de Fecha #2";
        	}
 
        	if(date1.before(date2)){
        		msj="Fecha #1 se ubica antes de Fecha #2";
        	}
 
        	if(date1.equals(date2)){
        		msj="Fecha #1 se igual a Fecha #2";
        	}
 
    //	}catch(ParseException ex){
   // 		ex.printStackTrace();
   // 	}
		
		
		
		
	return msj;
	}
	
	
	
}
