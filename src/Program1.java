import java.util.Random;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No funciona el emoji en consola jeje xd
		System.out.println("I ♥ love Java");

		Ejercicios1 ej1= new Ejercicios1();
		Navidad ej2=new Navidad();
		EstructurasRepetitivas ej3=new EstructurasRepetitivas();
		Banderas ej4=new Banderas();
		
	// HACER MENU EJERCICIOS:
	//	ej1.secuenciasEscape();
	//	ej1.estoEsUnMain();
	//	ej1.ejercicioTipo();
	//	ej1.ejercicioCircular();
	//	ej1.ejercicioConstantes();
	//	ej1.ejercicioCalculoRango();
	//	ej1.ejercicioConcat();
	//	ej1.ejerciciosAritmeticos();		
	/*	int num=3;
		System.out.println(ej1.incrementar(num));
		System.out.println(ej1.decrementar(num)); */
		
		/*Define una variable numérica entera de tipo integer y asígnale un valor de 25.
		• 1. Utiliza e operador de suma combinada para sumar 5 al valor actual.
		2 Utiliza el operador de resta combinada para restar 15 al valor actual
		3. Utiliza el operador de producto combinado para multiplicar por 2 el valor actual
		4. Utiliza el operador de división combinada para dividir entre 2 el valor actual
		5. Utiliza el operador de resto combinado para saber el resto del valor actual dividido
		entre 3.
		
		int numero=25;
		numero= ej1.sumar(numero, 5);
		System.out.println(numero);
		numero= ej1.restar(numero, 15);
		System.out.println(numero);
		numero= ej1.multiplicar(numero, 2);
		System.out.println(numero);
		numero= ej1.dividir(numero, 2);
		System.out.println(numero);
		numero= ej1.modulo(numero, 3);
		System.out.println(numero); */
		
		/* Define 4 variables enteras num1, num2 y num3, num4 con los siguientes valores 1, 2, 3, 2
			Comprueba si el valor de num4 es igual al de num2
			Comprueba si el valor de num2 es igual al de num3
			Comprueba si el valor de num1 es distinto a num3
			Comprueba si el valor de num2 es distinto a num2
			Comprueba si el valor de num4 es menor que num3
			Comprueba si el valor de num3 es menor que num1
			Comprueba si el valor de num1 es mayor que num3
			Comprueba si el valor de num2 es mayor que num4
			Comprueba si el valor de num2 es mayor que num3
			Comprueba si el valor de num2 es igual o menor que num3
			Comprueba si el valor de num2 es igual o menor que num4
			Comprueba si el valor de num2 es igual o menor que num1
			Comprueba si el valor de num1 es mayor o igual que num2
			Comprueba si el valor de num2 es mayor o igual que num1
			Comprueba si el valor de num2 es igual o mayor que num2 
		
		int num1=1, num2=2, num3=3, num4=2;
		System.out.println(ej1.iguales(num4, num2));
		System.out.println(ej1.iguales(num2, num3));
		System.out.println(ej1.diferentes(num1, num3));
		System.out.println(ej1.diferentes(num2, num2));
		System.out.println(ej1.menor(num4, num3));
		System.out.println(ej1.menor(num3, num1));
		System.out.println(ej1.mayor(num1, num3));
		System.out.println(ej1.mayor(num2, num4));
		System.out.println(ej1.mayor(num2, num3));
		System.out.println(ej1.menorIgual(num2, num3));
		System.out.println(ej1.menorIgual(num2, num4));
		System.out.println(ej1.menorIgual(num2, num1));
		System.out.println(ej1.mayorIgual(num1, num2));
		System.out.println(ej1.mayorIgual(num2, num1));
		System.out.println(ej1.mayorIgual(num2, num2)); */
		
		/* Define 4 variables booleanas bool1, bool2 y bool3 con los valores true, false, false
		Compara si bool1 es igual al valor invertido de bool2
		Compara si bool2 es igual al valor invertido de bool3 
		
		boolean bool1= true;
		boolean bool2= false;
		boolean bool3=false;
		
		System.out.println(ej1.boolInventido(bool1, bool2));
		System.out.println(ej1.boolInventido(bool2, bool3));*/
		
		/*Calcula si un número es par o impar mediante al operador condicional. Y, finalmente, imprime
		"par" o "impar" por terminal en función del número introducido.
		Realiza un programa que nos imprima blanco o negro en función de un Math random mediante
		al operador booleano. 
		
		int num=2;
		System.out.println(ej1.parImpar(ej1.opCondicional(num)));
		
		Random rand = new Random();
        int numero = rand.nextInt(2);
        
        System.out.println(numero+" "+ej1.blancoNegro(ej1.opCondicional(numero)));*/
		
		/* 1. Realiza un programe que a partir de un número aleatorio (0 o 1)
		muestre un valor booleano true or false e imprima rojo o negro 
		Random rand = new Random();
        int numero = rand.nextInt(2);
        System.out.println(numero);
        System.out.println(ej1.rojoNegroIf(numero));
        System.out.println(ej1.rojoNegroElse(numero));
        System.out.println(ej1.rojoNegroTernario(numero)); */
		
		/* Realiza un programa que muestre la temperatura y la categoria de un clima en función de la temperatura que le pasemos

		float input=ej1.imputUserFloat("Introduce la temperatura:");
		ej1.temperaturasIf(input);
		ej1.temperaturasElse(input);  */
		
		/* Programa mediante un Switch case que cuando introduzcamos un valor del 1 al 9 en formatio numérico muestre dicho número en texto. 
		
		int input=ej1.imputUserIntBetween("Introduce un número del 1 al 9");
		
		ej1.numeroEscrito(input, 1, 9); */
		
		/* Transforma el código del siguiente if-elseif-else a un operador ternario:*/
		/* if (number>0){ ¡Es positivo! }else if (number<0){ ¡Es negativo! }else{ ¡Es cero, na de ná!} 
		double number=55;
		System.out.print(number>0?"¡Es positivo!":number<0?"¡Es negativo!":"¡Es cero, na de ná!"); */
		
		// ej2.ArbolDeNavidad();
	
		// int num= ej1.imputUserIntBetween("Escribe un numero entre 1 y 100 y te mostraré los divisibles por 2:", 1, 100);
		// ej3.divisiblesPorDos(num); 
		//int[] numeros= {3,5,6,9,12,13,22,33};
		//ej3.divisiblesPorTresFor(numeros);
		//ej3.divisiblesPorTresWhile(numeros);
		
		//int num= ej1.imputUserIntBetween("Escribe un numero entre 0 y 10 y te saludaré esas veces:", 0, 10);
		//String[] saludar= {"Buenaas!", "Buenos dias", "Hello!", "Holaaa", "Guenaaas!", "Dias, porque buenos lo seran pa ti", "Saludos cordiales", "Que pasa nen!", "Saludos terricolas"};
		//ej3.saludosFor(num, saludar);
		//ej3.saludosWhile(num, saludar);
		//ej3.saludosDoWhile(num, saludar);

		
		// ej3.abecedarioLoco();
		
		//ej3.saltandoFor();
		//ej3.saltandoWhile();
		//ej3.saltandoEnBucle();
		
		//System.out.println(ej3.javaOrNull(null));
		//System.out.println(ej3.javaOrNull("Klok"));
		//System.out.println(ej3.javaOrNull("java"));
		
		//System.out.println(ej3.login("admin","1234"));
		//System.out.println(ej3.login("admin","4567"));
		//System.out.println(ej3.login("root","1234"));
		//System.out.println(ej3.login("root","4567"));
		
		// System.out.println(ej3.isPar());
		
		final String RESET="\033[0m";
		final String RED_BG = "\033[48;5;160m";
		final String RED_TEXT= "\033[38;5;160m";
		final String BLUE_BG = "\033[48;5;33m";
		final String BLUE_TEXT= "\033[38;5;33m";
		final String BLACK_BG="\033[48;5;16m";
		final String BLACK_TEXT="\033[38;5;16m";
		final String GREEN_BG="\033[48;5;46m";
		final String GREEN_TEXT="\033[38;5;46m";
		final String YELLOW_BG="\033[48;5;226m";
		final String YELLOW_TEXT="\033[38;5;226m";
		final String WHITE_BG="\033[48;5;255m";
		final String WHITE_TEXT="\033[38;5;255m";
		final String BOLD="\033[1m";
		final String FAINT="\033[2m";
		final String ITALIC="\033[3m";
		final String UNDERLINED="\033[4m";
		final String INVERSE="\033[7m";
		final String STRIKETHROUGH="\033[9m";

		String[] coloresEspanya= {RED_BG, YELLOW_BG, RED_BG};
		String[] coloresAlemania= {BLACK_BG, RED_BG, YELLOW_BG};
		String[] coloresUcraina= {BLUE_BG, YELLOW_BG};
		String[] coloresCatalunya= {YELLOW_BG, RED_BG,YELLOW_BG, RED_BG,YELLOW_BG, RED_BG,YELLOW_BG, RED_BG,YELLOW_BG};
		String[] coloresFrancia= {BLUE_BG,WHITE_BG,RED_BG};
		String [] coloresGrecia= {BLUE_BG,WHITE_BG,BLUE_BG,WHITE_BG,BLUE_BG,WHITE_BG,BLUE_BG,WHITE_BG,BLUE_BG};
		ej4.verticalSameColor(9, 1, 30, 3, coloresEspanya, false, RESET);
		ej4.verticalSameColor(9, 1, 30, 3, coloresAlemania, false, RESET);
		ej4.verticalSameColor(8, 1, 30, 2, coloresUcraina, false, RESET);
		ej4.verticalSameColor(9, 1, 30, 9, coloresCatalunya, false, RESET);
		ej4.verticalSameColor(9, 3, 10, 3, coloresFrancia, true, RESET);
		ej4.verticalSameColor(9, 1, 30, 9, coloresGrecia, false, RESET);
		
		ej4.hacerBandera();
		


	}


}

