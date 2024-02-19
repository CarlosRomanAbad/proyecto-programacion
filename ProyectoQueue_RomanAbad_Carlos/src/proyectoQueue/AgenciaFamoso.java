package proyectoQueue;


import java.util.Queue;

public class AgenciaFamoso {

	private Queue<Famoso> lista;
	private String nombre;

	public AgenciaFamoso(Queue<Famoso> lista, String nombre) {
		super();
		this.lista = lista;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "AgenciaFamoso [lista=" + lista + ", nombre=" + nombre + "]";
	}

	public void addFamosoALaCola(Famoso f) {

		lista.add(f);

	}

	public void mostrarFilaDeFamosos() {

		for (Famoso famoso : lista) {
			if (lista.peek() != null) {
				System.out.println(famoso);

			}
		}

	}

	public void mostrarPrimerClienteDeLaAgencia() {
		
			if (lista.element() != null) {
				System.out.println(lista.peek());
			}
		
	}

	public void borrarFamosoDeLaColaAtendido() {
		//si hasta el final de la lista, despues de recorrerla, no hay ningun nulo, borra al primer elemento de la cola
		if (lista.peek() != null) {
			lista.poll();
		}

	}
	
	public void borrarCola(){
		//si la cola no esta vacia, que elimine todos los elementos
		if(!lista.isEmpty()){
			lista.remove();
		}
	}

}
