package Exercises;

public class Herbivoro extends Animal implements IRespiracion{

	@Override
	public void Alimentarse() {
		System.out.println(this.tipo+" come plantas");
		
	}

	@Override
	public int RespirarPorMinuto() {
		int numero=60;
		return numero;
	}

}
