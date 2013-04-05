


import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
	
	static BufferedReader in = new BufferedReader (new InputStreamReader (System.in) );
	static PrintStream out = System.out;
	
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
    	out.println("     MENU DE FECHAS     ");
    	out.println("*****************************");
    	
		out.println("1. Agregar Fecha");
		out.println("2. Comparar Fecha");
		out.println("3. Datos");
		out.println("4. Salir");

		
		out.println();
		
		
		
		
		
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
		
		Fecha Ejemplo =new Fecha();
		Amigo miAmigo =new Amigo();
		
				switch(opcion){
		

			case 1: //Introducir Fecha
				
			  	out.println("    Dame la fecha negro cabron :   " + "\n");
			  	Date fecha1 =formatFecha.parse(in.readLine());
			 
			 	out.println("    Dame la el nombre de tu amigo :  " + "\n");
			  	String nombreAmigo =in.readLine();
			  	
			  	
			     Ejemplo.setFecha1(fecha1);
			     miAmigo.setNombre(nombreAmigo);
			     
			     
			     out.print(Ejemplo.toString());
			     out.print(Ejemplo.getFecha1());
			     
			     
			     out.print(miAmigo.toString());
			     
				break;
				

			case 2: //Comparar Fecha
				
				
				break;
				
		
			case 3: //ToString
				
				out.print(Ejemplo.toString());
				out.print(Ejemplo.getFecha1());
				out.print(miAmigo.toString());
				
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
	
	
	
	
