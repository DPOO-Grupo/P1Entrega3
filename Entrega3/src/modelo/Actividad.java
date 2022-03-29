package modelo;

public class Actividad {
	
	private String titulo;
	private String descripcion;
	private String fecha;
	private String horaInicio;
	private String horaFinal;
	private int tiempo;
	
	public Actividad(String elTitulo,String laDescripcion, String laFecha, String laHoraInicio,String laHoraFinal, int elTiempo) {
		this.titulo = elTitulo;
		this.descripcion = laDescripcion;
		this.fecha = laFecha;
		this.horaInicio = laHoraInicio;
		this.horaFinal = laHoraFinal;
		this.tiempo = elTiempo;
	}
	
	public String darTitulo() {
		return titulo;
	}
	public String darDescripcion() {
		return descripcion;
	}
	public String darFecha() {
		return fecha;
	}
	public String darHoraInicio() {
		return horaInicio;
	}
	public String darHoraFinal() {
		return horaFinal;
	}
	public int darTiempo() {
		return tiempo;
	}

}
