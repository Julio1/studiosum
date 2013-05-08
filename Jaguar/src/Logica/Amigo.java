package Logica;
import java.util.Date;


public class Amigo {
	
private String nombre;
private Date fechaNascimiento;
private int id;

public Amigo (){};

public Amigo (String pnombre, Date pfechaNascimiento){
	
	setNombre( pnombre);
	setFechaNascimiento(pfechaNascimiento);
	
	
}

public Amigo (int pid, String pnombre, Date pfechaNascimiento){
	
	setNombre( pnombre);
	setFechaNascimiento(pfechaNascimiento);
	setId(pid);
	
}

public Amigo (int pid, String pnombre){
	
	setNombre( pnombre);
	
	setId(pid);
	
}

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public Date getFechaNascimiento() {
	return fechaNascimiento;
}


public void setFechaNascimiento(Date fechaNascimiento) {
	this.fechaNascimiento = fechaNascimiento;
}
	
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String toString (){	
	
	String msj;
	msj="La fecha de nascimiento de "+getNombre() + "es "+ getFechaNascimiento()+"\n";
	
	
	return msj;
}
	
	

}