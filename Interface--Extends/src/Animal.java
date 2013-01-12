
/**
 * @(#)Ubicacion.java
 *
 *
 * @author Julio C. Moreira
 * @version 1.00 2012/9/3
 */



public abstract class  Animal {

	private String nombre;
	private String id;
	
	static int cantPerros=0;
	
	public Animal(String praza){
		setTipo(praza);
		setId();
	}


    public void  setTipo (String pnombre) { nombre=pnombre;}

    public String getTipo () {return nombre; }

    
    public void setId(){
    	cantPerros++;
    	id=cantPerros+"";
    }
    
    public String getId(){
    	return id;
    }


    public abstract void  setColor(String pcolor);

    public abstract String getColor () ;

   public String toString(){

    	String result;
    	
    	result = "*****Informacion del Animal****** " +  "\n";
    	result += "Animal #: " + getId() +  "\n";
    	result += "Tipo: " + getTipo() +  "\n";

    return result;

    }


}