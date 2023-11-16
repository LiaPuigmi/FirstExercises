package Exercises;

public class Developer {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private Profesiones rolTecnologico;
	
	public Developer(String nombre, String apellidos, int edad, String dni, Profesiones rolTecnologico) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.rolTecnologico = rolTecnologico;
	}
	
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
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Profesiones getRolTecnologico() {
		return rolTecnologico;
	}
	
	public void setRolTecnologico(Profesiones rolTecnologico) {
		this.rolTecnologico = rolTecnologico;
	}
	
	
	public void comprobando() {
		switch(rolTecnologico) {
			case BACK_END_DEVELOPER, FULL_STACK_DEVELOPER:
				System.out.println("Viva el Back!");
				break;
			case FRONT_END_DEVELOPER:
				System.out.println("JS es una 💩 caca es mejor utilizar TypeScript!");
				break;
			default:
				System.out.println("Tu no eres developer!");
				break;
		}
	}
	
	@Override
	public String toString() {
		return "Developer [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni
				+ ", rolTecnologico=" + rolTecnologico + "]";
	}
	
}
