package proyectoDeQue;

import java.util.Deque;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        Deque<Alumno> lista = new LinkedList<>();
        int boton1;
        int boton2;
        int boton3;
        int cero = 0;
        String nombre;
        String apellidos;
        int edad;
        int codAlumno;
        String telefono;

        CrudAlumno c = new CrudAlumno(lista);
        System.out.println("Bienvenidos al programa de la gestión de una cola de alumnos");
        System.out.println("");

        do {
            System.out.println("""
                    Por favor, pulse: 

                    ->1. Para añadir a un alumno a la cola
                    ->2. Para mostrar los alumnos añadidos a la cola
                    ->3. Para eliminar el ultimo elemento de la cola
                    """);

            boton1 = Leer.datoInt();
            switch (boton1) {
                case 1:
                    System.out.println("""
                            Ha elegido la opción de añadir a un alumno, por favor, pulse:


                            ->1. Si quiere añadirlo al comienzo de la cola
                            ->2. Si quiere añadirlo al final de la cola

                            """);
                    boton2 = Leer.datoInt();

                    switch (boton2) {
                        case 1:
                            System.out.println("Indique el nombre del alumno");
                            nombre = Leer.dato();
                            System.out.println("Sus apellidos también");
                            apellidos = Leer.dato();
                            System.out.println("Ahora su edad");
                            edad = Leer.datoInt();
                            System.out.println("¿Cuál es su código de alumno?");
                            codAlumno = Leer.datoInt();
                            System.out.println("Y para terminar, su número de teléfono por favor");
                            telefono = Leer.dato();

                            c.anhadirInicioCola(new Alumno(nombre, apellidos, edad, codAlumno, telefono));

                            break;
                        case 2:
                            System.out.println("Indique el nombre del alumno");
                            nombre = Leer.dato();
                            System.out.println("Sus apellidos también");
                            apellidos = Leer.dato();
                            System.out.println("Ahora su edad");
                            edad = Leer.datoInt();
                            System.out.println("¿Cuál es su código de alumno?");
                            codAlumno = Leer.datoInt();
                            System.out.println("Y para terminar, su número de teléfono por favor");
                            telefono = Leer.dato();

                            c.anhadirFinalCola(new Alumno(nombre, apellidos, edad, codAlumno, telefono));
                            break;
                    }
                    break;

                case 2:
                    System.out.println("""
                            Le podemos proporcionar tres maneras diferentes de mostrarle los alumnos añadidos y para ello deber pulsar:

                            ->1. Para mostrar únicamente al primer alumno de la cola
                            ->2. Para mostrar la lista de alumnos completas
                            ->3. Para mostrar únicamente al último alumno de la cola
                            """);
                    boton3 = Leer.datoInt();

                    switch (boton3) {
                        case 1:
                            c.mostrarPrimerElementoCola();
                            break;
                        case 2:
                            c.mostrarElementosCola();
                            break;
                        case 3:
                            c.mostrarUltimoElementoCola();
                            break;
                    }
                    break;

                case 3:
                    
                        c.eleminarUltimoElementoCola();//
                   
                    break;
            }

        } while (boton1 != cero);
    }
}