package Presentacion;


import Logica.Gestor;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main  {
	
	//static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	//static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out= System.out;
	
	public static void main (String [] args) throws IOException, ParseException{
		
		
		int opc;
		boolean noSalir = true;
		
		do{
			mostrarMenu();
			opc = leerOpcion();
			noSalir = ejecutarAccion(opc);
		}while(noSalir);
	
		
	}
	
	static public void mostrarMenu (){
		
		out.println("*****************************");
    	out.println("     MENU DE AMIGO     ");
    	out.println("*****************************");
    	
		out.println("1. Agregar Amigo");
		out.println("2. Comparar Fecha");
		out.println("3. Datos");
		out.println("4. Salir");
		out.println("\n");
				
	}
	
	
	
	static public int leerOpcion () throws java.io.IOException{
		
		
		out.print("Seleccione su opcion: ");
		int opcion = Integer.parseInt(in.readLine());
		out.println();

		return opcion;
		
		
	}
	
	
	static boolean ejecutarAccion(int opcion) throws java.io.IOException, ParseException{
		boolean noSalir = true;
		
		SimpleDateFormat formatFecha = new SimpleDateFormat("dd-MM-yyyy");

		
		switch(opcion){
		

			case 1: //Introducir Fecha
				
			  	out.println("    Dame el nombre del amigo :   " + "\n");
			  	String nombreAmigo =in.readLine();
			  	
			  	out.println("    Dame la fecha de nascimiento :   " + "\n");
			  	Date fecha1 =formatFecha.parse(in.readLine());

			  	Gestor objGestor=  new	Gestor();
			  	    
			  	objGestor.registrarAmigo(nombreAmigo, fecha1);
			  	
				break;
				

			case 2: //Comparar Fecha
				
				//out.println(Ejemplo.compararFechas());
				
				break;
				
		
			case 3: //ToString
				
				//out.print(Ejemplo.toString());
				//out.print(miAmigo.toString());
				
				break;
				
			case 4: //Salir
				
				noSalir = false;
				out.println("Gracias");
				break;	
				
			default: //Cualquier otro valor dado por el usuario se considera invalido

				out.println("Opcion invalida");
				out.println();
				break;
			}
		
		
		return noSalir;
	}
	
	
	
	
	
	
}

