package proyectoQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Principal {
    public static void main(String[] args) {
        Queue <Famoso> lista = new LinkedList <>();
        int boton;
		int boton2;
        int cero = 0;
        double sueldoFijo;
		String nombreFamoso;
		String dni;
		String telefonoContactoFamoso;
		String redesSocialesFamoso;
		double golesTotales;
		int numeroDeSeguidores;
		double mediaVisualizaciones;


		

        int mediaVisualizacionesParaVerificado=15000;
        String nombreAgencia= "Agencias Roman";
        
        AgenciaFamoso a = new AgenciaFamoso(lista, "Agencias Roman");
       



		System.out.println("");
       
        
        System.out.println("Bienvenidos a la inscripcion para pertenecer a la companhia de famosos"+nombreAgencia+" por favor, espere pacientemente su turno, sera atendido");
        System.out.println("");
        
        do {
        	
        	System.out.println("""
        			Por favor, pulse:
        			
        			1.Para agregar un famoso
        			2.Para mostrar los famosos de la agencia
        			3.Para mostrar el primer cliente de la cola
        			4.Para borrar al cliente una vez atendido
        			""");
        	boton=Leer.datoInt();
        	
        	switch(boton) {
        	
        	case 1:

				System.out.println("Por favor, pulse 1 si su famoso es un futbolista, 2 si es influencer , 3 si es streamer");
				boton2=Leer.datoInt();

				switch (boton2) {
					case 1:
					System.out.println("Por favor, introduzca el sueldo fijo que va a tener el Famoso que se va a unir a la Agencia");
					sueldoFijo=Leer.datoDouble();
					System.out.println("¿Cuál es el nombre del titular?");
					nombreFamoso=Leer.dato();
					System.out.println("¿Cúal es su dni?");
					dni=Leer.dato();
					System.out.println("Ponga el numero de telefono  del futbolista para poder ponernos en contacto con su persona");
					telefonoContactoFamoso=Leer.dato();
					System.out.println("Introduzca el usuario en redes sociales del famoso");
					redesSocialesFamoso=Leer.dato();
					System.err.println("¿Cuántos goles metio la temporada pasada?");
					golesTotales=Leer.datoDouble();

					a.addFamosoALaCola(new Futbolista(sueldoFijo, nombreFamoso, dni, telefonoContactoFamoso, nombreAgencia, mediaVisualizacionesParaVerificado));

				
						break;

						case 2:
					System.out.println("Por favor, introduzca el sueldo fijo que va a tener el Famoso que se va a unir a la Agencia");
					sueldoFijo=Leer.datoDouble();
					System.out.println("¿Cuál es el nombre del titular?");
					nombreFamoso=Leer.dato();
					System.out.println("¿Cúal es su dni?");
					dni=Leer.dato();
					System.out.println("Ponga el numero de telefono de el/la influencer para poder ponernos en contacto con su persona");
					telefonoContactoFamoso=Leer.dato();
					System.out.println("Introduzca el usuario en redes sociales del famoso");
					redesSocialesFamoso=Leer.dato();
					System.out.println("Introduzca la cantidad de seguidores que tiene el/la influencer");
					numeroDeSeguidores=Leer.datoInt();
					a.addFamosoALaCola( new Influencer(sueldoFijo, nombreFamoso, dni, telefonoContactoFamoso, nombreAgencia, numeroDeSeguidores));

					break;


					case 3:
					System.out.println("Por favor, introduzca el sueldo fijo que va a tener el Famoso que se va a unir a la Agencia");
					sueldoFijo=Leer.datoDouble();
					System.out.println("¿Cuál es el nombre del titular?");
					nombreFamoso=Leer.dato();
					System.out.println("¿Cúal es su dni?");
					dni=Leer.dato();
					System.out.println("Ponga el numero de telefono de el/la streamer para poder ponernos en contacto con su persona");
					telefonoContactoFamoso=Leer.dato();
					System.out.println("Introduzca el usuario en redes sociales del famoso");
					redesSocialesFamoso=Leer.dato();
					System.out.println("¿Cuál es la media de visualizaciones que tiene el/la streamer?");
					mediaVisualizaciones=Leer.datoDouble();
					System.out.println("¿Y cuántos seguidores?");
					numeroDeSeguidores=Leer.datoInt();

					a.addFamosoALaCola(new Streamer(sueldoFijo, nombreFamoso, dni, telefonoContactoFamoso, nombreAgencia, mediaVisualizacionesParaVerificado, numeroDeSeguidores));
					break;
				}

        	
        	case 2:
        		
        		a.mostrarFilaDeFamosos(mediaVisualizacionesParaVerificado);
        		break;
        		
        	case 3:
        		
        		a.mostrarPrimerClienteDeLaAgencia();
        		break;
        		
        	case 4:
        		
        		a.borrarFamosoDeLaColaAtendido();
        		
        	}
        	
        }while (boton!=cero);
      
        
       
        
    }
}
