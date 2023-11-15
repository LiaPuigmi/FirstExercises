package Exercises;

public class Empleado extends Persona {
	String tipoContrado;
	int sueldo;
	
	public void calcularSueldo() {
		
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public String toString() {
		return "Empleado [tipoContrado=" + tipoContrado + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", documento=" + documento + ", tipo=" + tipo + "]";
	}
	
	
}
