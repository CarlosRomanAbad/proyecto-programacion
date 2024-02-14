package proyectoQueue;

import java.util.LinkedList;
import java.util.Queue;

public class AgenciaFamoso {

	private Queue <Famoso> lista = new LinkedList<>();
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
	
	public void mostrarFilaDeFamosos( int mediaVisualizacionesParaVerificado) {
		
				for (Famoso famoso : lista) {
					if(lista.peek()!=null) {
						System.out.println(famoso);
						
						if(lista.element() instanceof Streamer) {
							((Streamer)lista.element()).mostrarAvisoAgencia(mediaVisualizacionesParaVerificado);
						}
					}
				}
			
		}
		
	
	public void mostrarPrimerClienteDeLaAgencia() {
		for (Famoso famoso : lista) {
			if(lista.peek()!=null) {
				System.out.println(lista.peek());
			}
		}
	}
	public void borrarFamosoDeLaColaAtendido(){
		
		if(lista.peek()!=null) {
			lista.poll();
		}
		
	}
	
}
