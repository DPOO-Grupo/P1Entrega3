package modelo;

public class Participante {
	
	private String nombre;
	private String correo;
	private boolean due�o;
	
	
	public Participante(String elNombre, String elCorreo, boolean elDue�o) {
			this.nombre = elNombre;
			this.correo = elCorreo;
			this.due�o = elDue�o;
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public String darCorreo() {
		return correo;
	}
	public boolean darDue�o() {
		return due�o;
	}
}
