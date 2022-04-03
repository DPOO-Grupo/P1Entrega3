package procesamiento;

import java.time.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Actividad;
import modelo.Proyecto;

public class LoaderData {
	
	
	
	
	public static Map<String,Proyecto> cargarInfoProyecto(String nombre,String descripcion,LocalDate fechaInicial,LocalDate fechaAprox,String nombrePar,String correo) throws FileNotFoundException, IOException{
		Map<String,Proyecto> proyectos = new HashMap<>();		
		Map<String,Actividad> actividades = new HashMap<>();
		
		Proyecto elProyecto = new Proyecto(nombre,descripcion,fechaInicial,fechaAprox,nombrePar,correo,actividades);
		proyectos.put(nombre,elProyecto);
		return proyectos;
	}
	public static void cargarInfoActividad(String titulo,String descripcion,String tipo,String nombrePar,String correo,LocalDate fechaInicial,LocalTime horaInicial,LocalTime horaFinal, Map<String,Proyecto> elProyecto, String nombreP){
		Proyecto proyecto1 = elProyecto.get(nombreP);
		Map<String,Actividad> actividades = proyecto1.darActividades();
		
		Actividad laActividad = new Actividad(titulo, descripcion,fechaInicial, tipo,nombrePar, correo, horaInicial, horaFinal);
		
		String nombre = laActividad.darTitulo();
		
		actividades.put(nombre, laActividad);
		
	}

}
