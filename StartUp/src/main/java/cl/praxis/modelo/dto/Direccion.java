package cl.praxis.modelo.dto;

public class Direccion {
	//Atributos
	private int id;
	private String nombre;
	private int numeracion;
	private int usuarioId;
	
	
	
	
	//constructor Vacio
	public Direccion() {
		super();
	}





	//constructor Completo
	public Direccion(int id, String nombre, int numeracion, int usuarioId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeracion = numeracion;
		this.usuarioId = usuarioId;
	}


	//geters and setters



	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getNumeracion() {
		return numeracion;
	}





	public void setNumeracion(int numeracion) {
		this.numeracion = numeracion;
	}





	public int getUsuarioId() {
		return usuarioId;
	}





	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	
	
	
	
	
	
	

}
