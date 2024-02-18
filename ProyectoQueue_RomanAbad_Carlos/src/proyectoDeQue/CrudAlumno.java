package proyectoDeQue;

import java.util.Deque;

public class CrudAlumno {

	private Alumno a;
	private Deque <Alumno> lista;
	
	public CrudAlumno(Alumno a, Deque<Alumno> lista) {
		super();
		this.a = a;
		this.lista = lista;
	}

	
	
	public CrudAlumno(Deque<Alumno> lista) {
		this.lista = lista;
	}



	public Alumno getA() {
		return a;
	}

	public void setA(Alumno a) {
		this.a = a;
	}

	public Deque<Alumno> getLista() {
		return lista;
	}

	public void setLista(Deque<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudAlumno [a=" + a + ", lista=" + lista + "]";
	}

	public void anhadirInicioCola(Alumno a) {
		lista.addFirst(a);
	}
	
	public void anhadirFinalCola(Alumno a) {
		lista.addLast(a);
	}
	
	//probar si funciona el metodo contains que es parecido a un findbyid
	
	public void mostrarPrimerElementoCola() {
		for (Alumno alumno : lista) {
			System.out.println(lista.getFirst());
		}
		
	}
	
	public void mostrarUltimoElementoCola() {
		for (Alumno alumno : lista) {
			System.out.println(lista.getLast());
		}
		
	}

	public void mostrarElementosCola(){
		for (Alumno alumno : lista) {
			if(!lista.isEmpty()){
				System.out.println(alumno);
			}
		}
	}

	public void eleminarUltimoElementoCola(){

		for (Alumno alumno : lista) {
			
				lista.removeLast();
			
		}

	}
	
}
