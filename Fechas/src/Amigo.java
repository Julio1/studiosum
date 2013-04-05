
public class Amigo {

	private String Nombre;
		
		public Amigo (String pnombre){
			
			setNombre(pnombre);
			
		}		
			
		public Amigo ( ){}	
		
		public String getNombre() {
			return Nombre;
		}
	
	
		public void setNombre(String nombre) {
				Nombre = nombre;
		}

		
		public String toString (){
			
			String msj;
			
			msj="El nombre del amigo es :"+getNombre() + "\n";
			
			
			return msj;
		}
		
		
}
	
	