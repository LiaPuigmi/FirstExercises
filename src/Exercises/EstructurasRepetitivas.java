package Exercises;
import java.util.Random;

public class EstructurasRepetitivas {
	public void divisiblesPorDos(int num) {
		System.out.println("Los numeros divisibles por 2 son:");
		for(int i=1; i<=num;i++) {
			if(i%2==0 && i!=num) {
				System.out.print(i+", ");
			}else if(i%2==0 && i==num) {
				System.out.print(i+".");
			}
		}
	}
	
	
	public void divisiblesPorTresFor(int[] numeros) {
		System.out.println("Los numeros divisibles por 3 son:");
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]%3==0 && i!=numeros.length-1) {
				System.out.print(numeros[i]+", ");
			}else if(numeros[i]%3==0 && i==numeros.length-1) {
				System.out.print(numeros[i]+".");
			}
		}
		System.out.println();
	}
	
	public void divisiblesPorTresWhile(int[] numeros) {
		System.out.println("Los numeros divisibles por 3 son:");
		int i=0;
		while(i<numeros.length) {
			if(numeros[i]%3==0 && i!=numeros.length-1) {
				System.out.print(numeros[i]+", ");
			}else if(numeros[i]%3==0 && i==numeros.length-1) {
				System.out.print(numeros[i]+".");
			}
			i++;
		}
		System.out.println();
	}
	
	public void saludosFor(int num, String[] saludar) {
		System.out.println("Saludos terricolas!");
		for(int i=0; i<num;i++) {
			Random rn = new Random();
			int position = rn.nextInt(saludar.length-1) + 1;
			System.out.println(saludar[position]);
		}
		
	}
	
	public void saludosWhile(int num, String[] saludar) {
		System.out.println("Saludos terricolas!");
		
		int i=0;
		while(i<num) {
			Random rn = new Random();
			int position = rn.nextInt(saludar.length-1) + 1;
			System.out.println(saludar[position]);
			i++;
		}
	}
	
	public void saludosDoWhile(int num, String[] saludar) {
		System.out.println("Saludos terricolas!");
		int i=0;
		do {
			Random rn = new Random();
			int position = rn.nextInt(saludar.length-1) + 1;
			System.out.println(saludar[position]);
			i++;
		}while(i<num);
			
		
	}
	
	public void abecedarioLoco() {
		String abce= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ecba="";
		int num=abce.length();
		int count=0;
		while(count<10) {
			for (int i = 0; i < num; i++) {
				System.out.println(abce);
				ecba=ecba+abce.charAt(abce.length()-1);
				abce=abce.substring(0, abce.length() - 1);
			}
			for (int i = 0; i < num; i++) {
				abce=abce+ecba.charAt(ecba.length()-1);
				ecba= ecba.substring(0, ecba.length() - 1);
				System.out.println(abce);
			}
			count++;
		}
		
	}
	
	/* EJERCICIOS DE SALTO */
	
	public void saltandoFor() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			if(i==3) break;
		}
	}
	
	public void saltandoWhile() {
			int i=1;
			while(i<10) {
				System.out.println(i);
				if(i==3) break;
				i++;
			}
		}
	
	public void saltandoEnBucle() {
		int count=1;
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			while(count<10) {
				if(count==5) break;
				System.out.println("Iteración");
				count++;
			}
		}
	}
	
	/* EJERCICIOS DE FUNCIONES */
	public String javaOrNull(String name) {
		if(name=="java") {
			return "java";
		}else {
			return "null";
		}
	}

	
	public String login(String usuario, String password) {
		if(usuario=="admin" && password=="1234") {
			return "Login true";
		}else {
			return "Login false";
		}
	}
	
	public boolean isPar() {
		Random rn = new Random();
		int num = rn.nextInt(100) + 1;
		System.out.println(num);
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
