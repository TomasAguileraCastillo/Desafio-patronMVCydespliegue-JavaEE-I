package cl.praxis.modelo.dao;

import cl.praxis.modelo.dto.Usuarios;

public interface UsuariosDAO {
	
	void crear(Usuarios u); // crea Usuarios
 	Usuarios validadorLogeo(String correo, String clave); // valida si fue logeado el usuario
 	Usuarios validaCorreo (String correo);
 }
