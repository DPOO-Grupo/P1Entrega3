package procesamiento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelo.Actividad;
import modelo.Participante;
import modelo.Proyecto;


public class CalculadoraProyecto {
		
	private List<Proyecto> proyectos;
	private List<Actividad> actividades;
	private List<Participante> participantes;
	
	public CalculadoraProyecto(Map<String,Proyecto> proyectos, Map<String,Actividad> actividades,Map<String,Participante> participantes) {
		this.proyectos = new ArrayList<Proyecto>( proyectos.values());
		this.actividades = new ArrayList<Actividad>(actividades.values());
		this.participantes = new ArrayList<Participante>(participantes.values());
	}
	


}
