package proyectoQueue;

public class Influencer extends Famoso {

	private int numeroDeSeguidores;

	

	public Influencer(double sueldoFijo, String nombre, String dni, String telefono, String rrss,
			 int numeroDeSeguidores) {
		super(sueldoFijo, nombre, dni, telefono, rrss);
		this.numeroDeSeguidores = numeroDeSeguidores;
	}

	public int getNumeroDeSeguidores() {
		return numeroDeSeguidores;
	}

	public void setNumeroDeSeguidores(int numeroDeSeguidores) {
		this.numeroDeSeguidores = numeroDeSeguidores;
	}

	public String toString() {
        return super.toString() +
                "\nNumero de Seguidores: " + numeroDeSeguidores;
    }
	
	

	
}
