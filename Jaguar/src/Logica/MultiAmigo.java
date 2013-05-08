package Logica;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import AccesoBD.Conector;
import AccesoBD.MultiConector;


public class MultiAmigo{
	static PrintStream out= System.out;
	
	public void crearAmigo (String pnombre, Date pfechaNascimiento){
	
		java.sql.Date pfechaNascimientoSql = new java.sql.Date(pfechaNascimiento.getTime()); 
		
		out.println("la fecha del nascimiento sin formatear: "+ pfechaNascimiento+"\n");
		
		out.println("la fecha del nascimiento con formato"+ pfechaNascimientoSql+"\n");
		
		
	 //String sql="INSERT INTO TAmigo (Nombre,FechaNac) VALUES ( '"+pnombre+"', #"+pfechaNascimiento+"#)";
		String sql="INSERT INTO [TAmigo] ([Nombre],[fechaNascimiento])  VALUES  ('"+pnombre+ "',' " +pfechaNascimientoSql+ "')";
		
	 try {
	//	Conector.getConector().ejecutarSQL(sql);
		 MultiConector  MiConector = new MultiConector();
		 MiConector.ejecutarSQL(sql);
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
//	 
//	public ArrayList<Amigo> getAmigos( ) throws java.sql.SQLException,Exception{
//		ArrayList<Amigo> paqs = new ArrayList<Amigo>();
//		java.sql.ResultSet rs;
//		String sql;
//		sql = "SELECT Id, Nombre, fechaNascimiento FROM  dbo.TAmigo";
//		MultiConector  MiConector = new MultiConector();
//		rs = MiConector.ejecutarSQLDevuelve(sql);
//		
//		while(rs.next()) {
//			
//			paqs.add(
//				new Amigo(
//					rs.getInt("id"),
//					rs.getString("nombre"),
//					rs.getDate("fechaNascimiento")));
//			
//		}
//		rs.close();
//		return paqs;
//	}
	
	
	public LinkedList< Amigo > getAmigos () throws Exception {
		
		 LinkedList< Amigo > listaAmigo = new LinkedList<Amigo>() ;
		 
		 java.sql.ResultSet rs;
		 String sentencia="SELECT Id, Nombre, fechaNascimiento FROM  dbo.TAmigo";
		 		
		 MultiConector MiConector = new MultiConector();
		 
		try {
			rs=MiConector.ejecutarSQLDevuelve(sentencia);
			
			while(rs.next()) {
			
				listaAmigo.add(new Amigo ( rs.getInt("id"),rs.getString("nombre"), rs.getDate("fechaNascimiento") ) );
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
		 return listaAmigo;
		  
	 }
	 
//	 
//	public LinkedList<Amigo> getAmigos( ) throws java.sql.SQLException,Exception{
//		LinkedList<Amigo> paqs = new LinkedList<Amigo>();
//		java.sql.ResultSet rs;
//		String sql;
//		sql = "SELECT Id, Nombre, fechaNascimiento FROM  dbo.TAmigo";
//		MultiConector  MiConector = new MultiConector();
//		rs = MiConector.ejecutarSQLDevuelve(sql);
//		
//		while(rs.next()) {
//			
//			paqs.add(
//				new Amigo(
//					rs.getInt("id"),
//					rs.getString("nombre"),
//					rs.getDate("fechaNascimiento")));
//			
//		}
//		rs.close();
//		return paqs;
//	}
//		
//	
//	
//	
//	
//	
	
	
	
	
}