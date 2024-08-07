package cl.praxis.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.praxis.modelo.dao.UsuariosDAO;
import cl.praxis.modelo.dao.UsuariosDAOImpl;
import cl.praxis.modelo.dto.Usuarios;
import cl.praxis.modelo.service.UsuarioServicios;

 
@WebServlet("/acceso")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
  
    public LoginController() {
        super();
     }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioEmail = request.getParameter("usuarioEmail"); 
		String clave = request.getParameter("clave");
		Usuarios us = null;
 	
		
		UsuariosDAO uDAO = new UsuariosDAOImpl();
 	
		
 		if(usuarioEmail == null && clave == null) {	
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		}else {
 			
			us = uDAO.validadorLogeo(usuarioEmail, clave);
 				
 			if (us == null) {
 				getServletContext().getRequestDispatcher("/login").forward(request, response);
 			}else {
 			String nick = us.getNick();
			System.out.println("paso!"+ us.getNick());
 			HttpSession session = request.getSession();
			session.setAttribute("isLogged", true);
			session.setAttribute("correo", usuarioEmail);
			session.setAttribute("nick", nick);
			getServletContext().getRequestDispatcher("/inicio").forward(request, response);
			}
		}
			 
	}
		 
		 
}


