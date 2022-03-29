package modelo;

public class Reporte {
	private int tiempoTotal;
	private int tiempoPromedio;
	private int tiempoPorDia;
	
	public Reporte(int elTiempoTotal, int elTiempoPromedio, int elTiempoPorDia) {
		this.tiempoTotal = elTiempoTotal;
		this.tiempoPromedio = elTiempoPromedio;
		this.tiempoPorDia = elTiempoPorDia;
	}
	
	public int darTiempoTotal() {
		return tiempoTotal;
	}
	public int darTiempoPromedio() {
		return tiempoPromedio;
	}
	public int darTiempoPorDia() {
		return tiempoPorDia;
	}
}
