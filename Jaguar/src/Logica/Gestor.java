package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;



/**
 * @author Julio
 *
 */
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
	
	
	
//	@SuppressWarnings("null")
//	public LinkedList <TreeMap> getListaAmigos () throws Exception{
//
//		LinkedList<Amigo> ListaAmigos= new LinkedList();
//		MultiAmigo objMultiAmigo= new MultiAmigo();
//		ListaAmigos=objMultiAmigo.getAmigos();
//
//		LinkedList<TreeMap<String,String> > Lista = new LinkedList<>();
//
//		Iterator<Amigo> iterator= ListaAmigos.iterator();		
//		while (iterator.hasNext()) {
//			
//			Lista.add(Lista.add( " "+( iterator.next().toString()));
//
//		}
//
//
//		return Lista;
//	}
//	
	
	@SuppressWarnings("null")
	public LinkedList <String> getListaAmigos () throws Exception{

		LinkedList<Amigo> ListaAmigos= new LinkedList();
		MultiAmigo objMultiAmigo= new MultiAmigo();
		ListaAmigos=objMultiAmigo.getAmigos();

		LinkedList <String> Lista = new LinkedList<>();

		Iterator<Amigo> iterator= ListaAmigos.iterator();		
		while (iterator.hasNext()) {
			
			
			String infoAmigo=iterator.next().toString();
			Lista.add(infoAmigo);

		}


		return Lista;
	}
	
	

	/*
	public ArrayList<Amigo> getListaAmigos () throws Exception{

		ArrayList<Amigo> ListaAmigos= new ArrayList<Amigo>();
		MultiAmigo objMultiAmigo= new MultiAmigo();
		ListaAmigos=objMultiAmigo.getAmigos();
		TreeMap<Object, Object> Lista=new TreeMap<>();
		

		Iterator<Amigo> iterator= ListaAmigos.iterator();		
		while (iterator.hasNext()) {
			
			Lista.put("Id", Integer.toString(iterator.next().getId()));
			Lista.put("Nombre",(iterator.next().getNombre()));
			Lista.put("Fecha de Nascimiento", ""+ (iterator.next().getFechaNascimiento()));
		}


		return ListaAmigos;
	}	
*/
	
	
	
}