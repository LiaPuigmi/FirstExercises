package Exercises;

public class Carnivoro extends Animal implements IRespiracion{

	@Override
	public void Alimentarse() {
		System.out.println(this.tipo+" come carne");
		
	}

	@Override
	public int RespirarPorMinuto() {
		int numero=100;
		return numero;
	}

}
