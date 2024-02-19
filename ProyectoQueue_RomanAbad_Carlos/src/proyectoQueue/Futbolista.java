package proyectoQueue;

public class Futbolista extends Famoso {

	private int golesTotales;

	

	public Futbolista(double sueldoFijo, String nombre, String dni, String telefono, String rrss, 
			 int golesTotales) {
		super(sueldoFijo, nombre, dni, telefono, rrss );
		this.golesTotales = golesTotales;
	}

	public int getGolesTotales() {
		return golesTotales;
	}

	public void setGolesTotales(int golesTotales) {
		this.golesTotales = golesTotales;
	}


	
	public String toString(){
		return super.toString() +
		"\n Goles Totales: " + golesTotales;
	}

	
	
}
