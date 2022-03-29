package modelo;

public class Proyecto {
	
	private String nombre;
	private String descripcion;
	private String fechaInicio;
	private String fechaFinal;
	
	
	public Proyecto(String elNombre, String laDescripcion, String laFechaInicio, String laFechaFinal) {
		this.nombre = elNombre;
		this.descripcion = laDescripcion;
		this.fechaInicio = laFechaInicio;
		this.fechaFinal = laFechaFinal;
		
	}
	
	public String darNombre() {
		return nombre;
	}
	public String darDescripcion() {
		return descripcion;
	}
	public String darFechaInicio() {
		return fechaInicio;
	}
	public String darFechaFinal() {
		return fechaFinal;
	}
}
