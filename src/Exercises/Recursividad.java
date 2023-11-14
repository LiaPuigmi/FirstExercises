package Exercises;

import java.util.List;

public class Recursividad {
	// 1. Recorre el siguiente array de forma recursiva: String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "IS", "SQL", "Java"};

	public void recorrer(String[] tecnologies, int num) {
		if(num<tecnologies.length) {
			System.out.println(tecnologies[num]);
			recorrer(tecnologies,num+1);
		}else {
			System.out.println("FIN");
		}
	}
	
	// 2 Recorre el array anterior hasta llegar a "HTMM":
	public void recorrerConLimite(String[] tecnologies, int num) {
		if(num<tecnologies.length && tecnologies[num]!="HTML") {
			System.out.println(tecnologies[num]);
			recorrerConLimite(tecnologies,num+1);
		}else {
			System.out.println(tecnologies[num]);
		}
	}
	
	// 3. Fibonnacci de forma recursiva hasta que un número pasado por parámetro dentro de la función recursiva supere el siguiente número recursiva:
	//		Serie fibonacci: 11 2 3 5 813 21 34 55
	public List<Integer> fibonacci(List<Integer> fibo,int maxValue, int position) {
		if(maxValue>0) {			
			if(position==0 || position==1) {
				fibo.add(1);
				if(fibo.get(position)<=maxValue) {
					position++;
					fibonacci(fibo, maxValue, position);
				}
			}else{
				if(fibo.get(position-2)+fibo.get(position-1)<=maxValue) {
					fibo.add(fibo.get(position-2)+fibo.get(position-1));
					position++;
					fibonacci(fibo, maxValue, position);
				}
			}
			return fibo;
			}
			
		return null;
	}
	
	// 4. Invierte la palabra supercalifragilisticoespialidoso mediante a una función recursiva
	public String inversion(String palabra, String nuevaPalabra, int posicion) {
		if(posicion<palabra.length()) {
			nuevaPalabra=palabra.charAt(posicion)+nuevaPalabra;
			posicion++;
			nuevaPalabra=inversion(palabra, nuevaPalabra,posicion);
		}
		
		return nuevaPalabra;
	}

	
	// 5. Suma los números de un número pasado por parametros de forma recursiva.
	public int sumaLikeFact(Integer num, int position, int result) {
		if(position<num.toString().length()) {
			result=result+Character.getNumericValue(num.toString().charAt(position));
			position++;
			result= sumaLikeFact(num, position, result);
		}
		return result;

	}
}
