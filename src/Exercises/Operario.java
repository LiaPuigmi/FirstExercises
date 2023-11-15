package Exercises;

public class Operario extends Empleado{

	String operador="Operario";
	
	@Override
	public String toString() {
		return "Operario [tipoContrado=" + tipoContrado + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", documento=" + documento + ", tipo=" + tipo  + ", operador=" + operador + "]";
	}

}
