package Exercises;

public class Alumnos {
		String nombre = "";
		String apellidos = "";
		String curso = "";
		String anyo="";

		

		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellidos() {
			return apellidos;
		}



		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}



		public String getCurso() {
			return curso;
		}



		public void setCurso(String curso) {
			this.curso = curso;
		}



		public String getAnyo() {
			return anyo;
		}



		public void setAnyo(String anyo) {
			this.anyo = anyo;
		}



		public Alumnos(String nombre, String apellidos, String curso, String anyo) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.curso = curso;
			this.anyo = anyo;
		}



		
	
}
