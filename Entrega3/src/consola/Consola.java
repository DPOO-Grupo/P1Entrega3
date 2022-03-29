package consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;


public class Consola {
	
	public void ejecutarAplicacion() {
		
		boolean continuar = true;
		while (continuar) {
			mostrarMenu();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
			if (opcion_seleccionada==1);
		}
	}
	
	public void mostrarMenu() {
		System.out.println("Opciones de la aplicacion");
		System.out.println("1. Crear un nuevo Proyecto");
		System.out.println("2. Crear una actividad");
		System.out.println("3. añadir nuevo participante");
		System.out.println("4. Iniciar cronometro");
		System.out.println("5. Pausar cronometro");
		System.out.println("6. Parar cronometro");
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
	public static void main(String[] args)
	{
		Consola consola = new Consola();
		consola.ejecutarAplicacion();
	}

}
