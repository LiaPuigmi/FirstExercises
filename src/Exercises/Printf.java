package Exercises;

import java.util.ArrayList;

public class Printf {
	
	public void EjerciciosVariosf() {
		/* Ejercicio 1: Haz que la siguiente instrucción: Systemout. printf ("", "NOMBRE", "APELLIDO!", "APELLIDO2"); Devuelva el
		contenido en el siguiente farmato (can tabulaciones) NOMBRE		APELLIDOI	APELLIDO2 */
		System.out.printf("%s\t\t%s\t%s%n", "NOMBRE", "APELLIDO1", "APELLIDO2");
		/* Ejercicio 2 Haz que la siguiente instrucción: Systemout printf("", "NOMERE", "apellidol", "apellido2"); Devuelva el
		contenido en el siguiente formato (sin espacios) NOMERE apellidol apellido2 */
		System.out.printf("%s%s%s%n","NOMERE", "apellidol", "apellido2");
		/* Ejercicio 3: Haz que la siguiente instrucción: Systemout. printf("", "Nombre", "apellido1", "apellido2"); Devuelva el
		contenido en el siguiente formato (con espacios) apellido2, apellidol, Nombre */
		System.out.printf("%3$s, %2$s, %1$s%n","Nombre", "apellido1", "apellido2");
		/*Ejercicio 4 Haz que la siguiente instrucción: Systemout printf("","22"); Devuelva el contenido en el siguiente formato
		(dejar espacios) "    22"*/
		System.out.printf("%10s%n","22");
		/* Ejercicio 5: Haz que la siguiente instrucción: Systemout. printf("", 22); Devuelva el contenido en el siguiente formato
		(dejar ceros): 0000000022"*/
		System.out.printf("%010d%n",22);
		/* Ejercicio 6: Haz que la siguiente instrucción: Systemout. printf("", 17.1829327"); Devuelva el contenida (dejar ceros):
		"000017.18"*/
		System.out.printf("%09.2f%n",17.1829327);
		/* Ejercicio 7: Haz que la siguiente instrucción: Systemaut.printf("", " Hola", "Mundo"); Devuelva el contenida "HolaMundo
		(utiliza retornos de carros) */
		System.out.printf("algo\r%1$s%2$s%n", "Hola", "Mundo");
	}
	
	public void ejTabla() {
		ArrayList<Alumnos> alumnosList = new ArrayList<Alumnos>();
		// Añadiendo peliculas al arrayList
		alumnosList.add(new Alumnos("Pepito","de los Palotes", "sexto", "2005"));
		alumnosList.add(new Alumnos("Agustin","Santos", "cuarto", "2015"));
		alumnosList.add(new Alumnos("Eustaquia","Sin Silla", "quinto", "2022"));

		System.out.printf("%n%20s%20s%20s%20s%n", "Nombre ", "Apellidos", "Curso","Año");
		System.out.println("\t-----------------------------------------------------------");
		for (Alumnos alumno : alumnosList) {
			System.out.printf("%20s%20s%20s%20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.anyo);
		}

		System.out.printf("%n%-20s%-20s%-20s%-20s%n", "Nombre ", "Apellidos", "Curso", "Año");
		System.out.println("-----------------------------------------------------------");
		for (Alumnos alumno : alumnosList) {
			System.out.printf("%-20s%-20s%-20s%-20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.anyo);
		}
	}
	
}


