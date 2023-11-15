package Exercises;

public class Tecnico extends Operario{
	String tecnico="Tecnico";

	@Override
	public String toString() {
		return "Tecnico [tecnico=" + tecnico + ", operador=" + operador + ", tipoContrado=" + tipoContrado + ", sueldo="
				+ sueldo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", documento=" + documento + ", tipo="
				+ tipo + "]";
	}
}
