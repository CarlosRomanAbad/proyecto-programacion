package proyectoQueue;

public class Streamer extends Famoso {

	private double mediaVisualizaciones;
	private int numeroSeguidores;

	public Streamer(double sueldoFijo, String nombre, String dni, String telefono, String rrss, 
			 double mediaVisualizaciones, int numeroSeguidores) {
		super(sueldoFijo, nombre, dni, telefono, rrss );
		this.mediaVisualizaciones = mediaVisualizaciones;
		this.numeroSeguidores = numeroSeguidores;
	}

	public double getMediaVisualizaciones() {
		return mediaVisualizaciones;
	}

	public void setMediaVisualizaciones(double mediaVisualizaciones) {
		this.mediaVisualizaciones = mediaVisualizaciones;
	}

	public int getNumeroSeguidores() {
		return numeroSeguidores;
	}

	public void setNumeroSeguidores(int numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
	}

	public String toString() {
        return super.toString() +
                "\nMedia Visualizaciones: " + mediaVisualizaciones +
                "\nNumero Seguidores: " + numeroSeguidores;
    }

	
	
}
