package Exercises;

public class Oficial extends Operario{
	
	String oficio="Oficial";

	@Override
	public String toString() {
		return "Oficial [oficio=" + oficio + ", operador=" + operador + ", tipoContrado=" + tipoContrado + ", sueldo="
				+ sueldo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", documento=" + documento + ", tipo="
				+ tipo + "]";
	}

}
