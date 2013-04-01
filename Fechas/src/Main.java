


import java.io.*;

public class Main {
	
	static BufferedReader in = new BufferedReader (new InputStreamReader (System.in) );
	static PrintStream out = System.out;
	
	public static void main (String [] args) throws IOException{
		
	
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
		out.println("3. Salir");

		
		out.println();
		
		
		
		
		
	}
	
	
	
	static public int leerOpcion () throws java.io.IOException{
		
		
		out.print("Seleccione su opcion: ");
		int opcion = Integer.parseInt(in.readLine());
		out.println();

		return opcion;
		
		
	}
	
	
	static boolean ejecutarAccion(int opcion) throws java.io.IOException{
		boolean noSalir = true;
			
				switch(opcion){
		

			case 1: //Introducir Fecha
				
				break;
				

			case 2: //Comparar Fecha
				
				
				break;
				
		
			case 3: //Salir
				
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
	
	
	
	
