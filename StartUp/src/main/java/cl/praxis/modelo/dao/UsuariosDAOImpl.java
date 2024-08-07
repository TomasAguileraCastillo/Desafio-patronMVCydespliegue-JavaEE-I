package cl.praxis.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cl.praxis.modelo.db.Conn;
import cl.praxis.modelo.dto.Usuarios;

public class UsuariosDAOImpl implements UsuariosDAO {

	 
	public void crear(Usuarios u) {
		 
			String querySql = "INSERT INTO usuarios (correo, create_at, nick, nombre, password, peso, updated_at) VALUES('"+u.getCorreo()+"', '"+u.getfCreacion()+"', '"+u.getNick()+"', '"+u.getNombre()+"', '"+u.getPassword()+"', '"+u.getPeso()+"', '"+u.getfActualizacion()+"')";
			 
			try {
				
				Connection conex = Conn.getConn();
				Statement st = conex.createStatement();
				st.execute(querySql);
				
			}catch(SQLException e) {
				System.out.println("Error: en el metodo crear()");
				e.printStackTrace();
				
			}
			
			
		}
	
 
	 
	public Usuarios validadorLogeo(String correo, String clave) {
		
		 Usuarios u =null; 
		try {
			Connection conectar = Conn.getConn();
			Statement s = conectar.createStatement();
			String querySql = "SELECT nick FROM usuarios WHERE correo = '"+correo+"' and password = '"+clave+"'";
 			ResultSet rs = s.executeQuery(querySql);
			if (rs.next()) {
				u = new Usuarios();
				u.setNick(rs.getString("nick"));
			}else { 
				System.out.println("no existe concordancia ");
			} 
		}catch(SQLException e) {
			System.out.println("Error en el metodo validadorLogeo()");
			e.printStackTrace();		
		}
		
		
		
		return u; 
	}
	
	
	public Usuarios validaCorreo (String correo) {
		
		 Usuarios u =null; 
		try {
			Connection conectar = Conn.getConn();
			Statement s = conectar.createStatement();
			String querySql = "SELECT correo FROM usuarios WHERE correo = '"+correo+"'";
			ResultSet rs = s.executeQuery(querySql);
			if (rs.next()) {
				u = new Usuarios();
				u.setCorreo(rs.getString("correo"));
			} 
		}catch(SQLException e) {
			System.out.println("Error en el metodo valida correo()");
			e.printStackTrace();		
		}
		return u; 
	}
	
  
	
	 
	
	
	
	
	
	
	
	


	}


