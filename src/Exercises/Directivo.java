package Exercises;

public class Directivo extends Empleado{

	@Override
	public String toString() {
		return "Operario [tipoContrado=" + tipoContrado + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", documento=" + documento + ", tipo=" + tipo + "]";
	}
}
