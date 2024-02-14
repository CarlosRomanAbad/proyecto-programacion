package proyectoQueue;

public  abstract class Famoso{

	private double sueldoFijo;
	private String nombre;
	private String dni;
	private String telefono;
	private String rrss;
	

	public Famoso(double sueldoFijo, String nombre, String dni, String telefono, String rrss) {
		this.sueldoFijo = sueldoFijo;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.rrss = rrss;
	
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRrss() {
		return rrss;
	}

	public void setRrss(String rrss) {
		this.rrss = rrss;
	}



	@Override
	public String toString() {
		return "Famoso [sueldoFijo=" + sueldoFijo + ", nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono
				+ ", rrss=" + rrss +  "]";
	}

	
	

		
	

}
