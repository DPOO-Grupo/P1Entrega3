package modelo;
import java.time.*;
public class Actividad {
	
	private String titulo;
	private String descripcion;
	private LocalDate fecha;
	private LocalTime horaInicio;
	private LocalTime horaFinal;
	private int tiempo;
	
	public Actividad(String elTitulo,String laDescripcion, LocalDate laFecha,String tipo,String nombrePar, String correo, LocalTime laHoraInicio,LocalTime laHoraFinal) {
		this.titulo = elTitulo;
		this.descripcion = laDescripcion;
		this.fecha = laFecha;
		this.horaInicio = laHoraInicio;
		this.horaFinal = laHoraFinal;
	}
	
	public String darTitulo() {
		return titulo;
	}
	public String darDescripcion() {
		return descripcion;
	}
	public LocalDate darFecha() {
		return fecha;
	}
	public LocalTime darHoraInicio() {
		return horaInicio;
	}
	public LocalTime darHoraFinal() {
		return horaFinal;
	}
	public int darTiempo() {
		return tiempo;
	}

}
