package proyectoDeQue;

import java.util.Deque;

public class CrudAlumno {

	private Alumno a;
	private Deque<Alumno> lista;

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

	public void mostrarPrimerElementoCola() {

		System.out.println(lista.getFirst());

	}

	public void mostrarUltimoElementoCola() {

		System.out.println(lista.getLast());

	}

	public void mostrarElementosCola() {
		for (Alumno alumno : lista) {
			// imprime lista si el tamaño de la cola es mayor que 0
			if (lista.size() != 0) {
				System.out.println(alumno);
			}
		}
	}

<<<<<<< HEAD
	public void eleminarUltimoElementoCola(){

				lista.removeLast();
=======
	public void eleminarUltimoElementoCola() {
		lista.pollLast();
>>>>>>> 53ee002d5b3a4fc85b4bf41c671f971e90c9d09f
	}

}
