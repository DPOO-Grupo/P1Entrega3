package consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import modelo.Actividad;
import modelo.Proyecto;
import procesamiento.LoaderData;
import java.time.*;


public class Consola {
	
	private Map<String,Proyecto> calculadora;
	
	public void ejecutarAplicacion() throws FileNotFoundException, IOException {
		
		boolean continuar = true;
		while (continuar) {
			mostrarMenu();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
			if (opcion_seleccionada==1)
				ejecutarCrearProyecto();
			else if (opcion_seleccionada == 2)
				ejecutarCrearActividad();
		}
	}
	
	public void mostrarMenu() {
		System.out.println("Opciones de la aplicacion");
		System.out.println("1. Crear un nuevo Proyecto");
		System.out.println("2. Crear una actividad");
		System.out.println("3. añadir nuevo participante");
	}
	
	
	
	private void ejecutarCrearProyecto() throws FileNotFoundException, IOException {
		String nombre = input("Digite el nombre del proyecto");
		String descripcion = input("Escriba la descripcion");
		LocalDate fechaInicial = LocalDate.parse(input("Digite la fecha de inicio"));
		LocalDate fechaAprox = LocalDate.parse(input("Digite la fecha aproximada de finalizacion"));
		System.out.println("Se necesita un participante inicial: ");
		String nombrePar = input("Escriba el nombre del participante inicial");
		String correo = input("Escriba el correo del participante inicial");
		calculadora = LoaderData.cargarInfoProyecto(nombre,descripcion,fechaInicial,fechaAprox, nombrePar,correo);
	}
	
	private void ejecutarCrearActividad() {
		
		String nombreP = input("Escriba el nombre del proyecto");
		LocalDate fechaInicial = null;
		LocalTime horaInicial = null;
		LocalTime horaFinal = null;
		String fecha = input("La actividad se realiza en la fecha actual o no");
		if (fecha == "si"){
			fechaInicial = LocalDate.now();
		}
		else {
			fechaInicial = LocalDate.parse(input("Escriba la fecha en el formato: ano-mes-dia"));
		}
		
		String iniciarCro = input("Desea empezar el cronometro");
		if (iniciarCro == "si") {
			horaInicial = LocalTime.now();
		}
		String titulo = input("Escriba el titulo de la actividad");
		String descripcion = input("Escriba la descripcion de la actividad");
		String tipo = input("Escriba el tipo de la actividad");
		String nombrePar = input("Escriba el nombre del participante");
		String correo = input("Escrba el correo del participante");
		String respuesta = input("Desea acabar la actividad?");
		if (respuesta == "si") {
			horaFinal = LocalTime.now();
			}
		LoaderData.cargarInfoActividad(titulo,descripcion,tipo,nombrePar,correo,fechaInicial,horaInicial,horaFinal,calculadora, nombreP);
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Consola consola = new Consola();
		consola.ejecutarAplicacion();
	}

}
