package modelo;

public class Participante {
	
	private String nombre;
	private String correo;
	private boolean dueño;
	
	
	public Participante(String elNombre, String elCorreo, boolean elDueño) {
			this.nombre = elNombre;
			this.correo = elCorreo;
			this.dueño = elDueño;
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public String darCorreo() {
		return correo;
	}
	public boolean darDueño() {
		return dueño;
	}
}
