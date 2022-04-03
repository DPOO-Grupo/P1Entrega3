package modelo;

import java.time.*;
import java.util.List;
import java.util.Map;

public class Proyecto {
	
	private String nombre;
	private String descripcion;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	private String participante;
	private String correo;
	private Map<String,Actividad> actividades;
	
	
	public Proyecto(String elNombre, String laDescripcion, LocalDate laFechaInicio, LocalDate laFechaFinal, String elParticipante, String elCorreo, Map<String,Actividad> laActividad) {
		this.nombre = elNombre;
		this.descripcion = laDescripcion;
		this.fechaInicio = laFechaInicio;
		this.fechaFinal = laFechaFinal;
		this.participante = elParticipante;
		this.correo = elCorreo;
		this.actividades = laActividad;
	}
	public Map<String,Actividad> darActividades(){
		return actividades;
	}
	public String darNombre() {
		return nombre;
	}
	public String darDescripcion() {
		return descripcion;
	}
	public LocalDate darFechaInicio() {
		return fechaInicio;
	}
	public LocalDate darFechaFinal() {
		return fechaFinal;
	}
}
