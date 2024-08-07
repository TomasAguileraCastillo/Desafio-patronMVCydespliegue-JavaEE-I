package cl.praxis.modelo.service;

import cl.praxis.modelo.dao.UsuariosDAO;
import cl.praxis.modelo.dao.UsuariosDAOImpl;
import cl.praxis.modelo.dto.*;

public class UsuarioServicios {
	
	private UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
	
	public void guarda(Usuarios u) {
		
		usuariosDAO.crear(u);
		
		
	}
	
	 
	
	
	public void validaracceso(String correo, String pass) {
		usuariosDAO.validadorLogeo(correo, pass);
	}
	
 
	public void validaCorreo(String correo) {
		usuariosDAO.validaCorreo(correo);
	}
	

}
