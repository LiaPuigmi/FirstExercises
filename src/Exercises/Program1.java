package Exercises;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import HolaYAdios.HolaMundo;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No funciona el emoji en consola jeje xd
		System.out.println("I ♥ love Java");

		Ejercicios1 ej1= new Ejercicios1();
		Navidad ej2=new Navidad();
		EstructurasRepetitivas ej3=new EstructurasRepetitivas();
		Banderas ej4=new Banderas();
		Printf ej5 = new Printf();
		Recursividad ej7 = new Recursividad();
		
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
		
		/*
		final String RESET="\033[0m";
		final String RED_BG = "\033[48;5;160m";
		final String RED_TEXT= "\033[38;5;160m";
		final String BLUE_BG = "\033[48;5;33m";
		final String BLUE_TEXT= "\033[38;5;33m";
		final String BLACK_BG="\033[48;5;16m";
		final String BROWN_BG="\033[48;5;88m";
		final String GREENLIGHT_BG="\033[48;5;78m";
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
		   
		String[] backgroundColors= {RED_BG,BLACK_BG,BLUE_BG,GREEN_BG,YELLOW_BG,WHITE_BG};
		String[] textColors= {RED_TEXT,BLACK_TEXT,BLUE_TEXT,GREEN_TEXT,YELLOW_TEXT,WHITE_TEXT};
		String[] formatColors= {BOLD,FAINT,ITALIC,UNDERLINED,STRIKETHROUGH};
		String[] frases= {
				"  Felicidad en cada amanecer  ",
				"  La belleza de un atardecer  ",
				"   El canto de los pajaros    ",
				"   El aroma de las flores     ",
				"     La risa de un niño       ",
				"     El abrazo de un amigo    ",
				"   El amor en cada mirada     ",
				"  La paz en la naturaleza     ",
				"   El susurro del viento      ",
				"   El brillo de las estrellas "};

		BanderaInfo bandera=new BanderaInfo();
		*/

		//String[] coloresEspanya= {RED_BG, YELLOW_BG, RED_BG};
		//String[] coloresAlemania= {BLACK_BG, RED_BG, YELLOW_BG};
		//String[] coloresUcraina= {BLUE_BG, YELLOW_BG};
		//String[] coloresCatalunya= {YELLOW_BG, RED_BG,YELLOW_BG, RED_BG,YELLOW_BG, RED_BG,YELLOW_BG, RED_BG,YELLOW_BG};
		//String[] coloresFrancia= {BLUE_BG,WHITE_BG,RED_BG};
		//ej4.verticalSameColor(9, 1, 30, 3, coloresEspanya, false, RESET);
		//ej4.verticalSameColor(9, 1, 30, 3, coloresAlemania, false, RESET);
		//ej4.verticalSameColor(8, 1, 30, 2, coloresUcraina, false, RESET);
		//ej4.verticalSameColor(9, 1, 30, 9, coloresCatalunya, false, RESET);
		//ej4.verticalSameColor(9, 3, 10, 3, coloresFrancia, true, RESET);
		//ej4.verticalSameColor(9, 1, 30, 9, coloresGrecia, false, RESET);
		
		//ej4.hacerBandera(UNDERLINED,BOLD,GREEN_TEXT,RESET);
		//String text=ej4.changeFormat(BLUE_BG, RED_TEXT, ITALIC, "HELLOOWW");
		//System.out.println(text);
		//System.out.println(ej4.reseteFormat("LaVirgen"));
		
		//System.out.println(ej4.banderaArcoiris(backgroundColors, textColors, formatColors, frases, bandera));
		
		// ej2.ArbolDeNavidad(BLUE_BG, GREEN_BG, GREENLIGHT_BG, BROWN_BG, RED_BG);
		//System.out.println(ej4.changeFormat(WHITE_BG, BLACK_TEXT, BOLD, "----------------------------------------------------------------------------"));
		//System.out.println(ej4.changeFormat(BLUE_BG, YELLOW_TEXT, BOLD, "Rango byte    desde:                  -128    hasta:                     127"));
		//System.out.println(ej4.changeFormat(BLACK_BG, WHITE_TEXT, BOLD, "----------------------------------------------------------------------------"));
		//System.out.println(ej4.changeFormat(YELLOW_BG, BLUE_TEXT, ITALIC, "Rango short   desde:                -32768    hasta:                   32767"));
		//System.out.println(ej4.changeFormat(BLACK_BG, WHITE_TEXT, BOLD, "----------------------------------------------------------------------------"));
		//System.out.println(ej4.changeFormat(RED_BG, GREEN_TEXT, FAINT, "Rango int     desde:           -2147483648    hasta:              2147405042"));
		//System.out.println(ej4.changeFormat(BLACK_BG, WHITE_TEXT, BOLD, "----------------------------------------------------------------------------"));
		//System.out.println(ej4.changeFormat(GREEN_BG, RED_TEXT, BOLD, "Rango long    desde:  -9223372036854775808    hasta:     9223372036854775807"));
		//System.out.println(ej4.changeFormat(BLACK_BG, WHITE_TEXT, BOLD, "----------------------------------------------------------------------------"));
		//System.out.println(ej4.changeFormat(BLUE_BG, GREEN_TEXT, ITALIC, "Rango float   desde:               1.4E-45    hasta:                3.402823"));
		//System.out.println(ej4.changeFormat(BLACK_BG, WHITE_TEXT, BOLD, "----------------------------------------------------------------------------"));		
		//System.out.println(ej4.changeFormat(RED_BG, YELLOW_TEXT, FAINT, "Rango double  desde:              4.9E-324    hasta:  1.7976931348623157E308"));
		//System.out.println(ej4.changeFormat(WHITE_BG, BLACK_TEXT, BOLD, "----------------------------------------------------------------------------"));

		
		/*Ejercicio de tipos de datos
• ¿Puedes obtener la clase a la que pertenecen todas ellas? maneras de resolver esto:
	- Castear para identificar a Wrapper debería de pertenecer
	- Envolver el valor con un Whapper de alguna de las maneras para posteriormente acceder a su valor
Ejercicio 2
Haz un programa que en un función del tipo de dato que le pasemos por parámetros (String, int,
Long, etc.) identifique a que Wapper pertenece o bien si es un tipo de dato primitivo a que Wrapper
pertenecería cuando se realice la conversión (casteo) a Object. */
		
	/*	Long longuito=123212321321l;
		byte bitito=3;
		short shortitio=12;
		Integer integuito=123;
		Byte biti= Byte.valueOf(bitito);
		Short shorti=Short.valueOf(shortitio);
		
		System.out.println(longuito.getClass().getSimpleName());
		System.out.println(integuito.getClass().getSimpleName());
		System.out.println(biti.getClass().getSimpleName());
		System.out.println(shorti.getClass().getSimpleName());
		System.out.println(((Object)bitito).getClass().getSimpleName());
		System.out.println(((Object)shortitio).getClass().getSimpleName()); 
		ej4.wrapers(bitito);
		ej4.wrapers(longuito);*/

		/* Ejercicio de conversiones
			1. Declara un tipo de dato double y ves haciendo una escalera de conversiones dato
			primitivo a dato primitivo hasta llegar a byte.
			
			double numero=1.444;
			long longui=(long)numero;
			int intiti=(int)longui;
			short shorti=(short) intiti;
			byte biti=(byte) shorti;
			System.out.println(biti);
		
			2. Declara un tipo de dato byte y ves realizando conversiones ascendentes de dato
			primitivo a dato primitivo hasta llegar a double.
			
			byte biti2=5;
			short shorti2=(short) biti2;
			int intiti2=(int)shorti2;
			float flotador2=(float) intiti2;
			double numero2=(double) flotador2;
			System.out.println(numero2);
		
			3. Declara un tipo de dato byte e inicializa la variable a 100. Modifica el valor de la variable
			multiplicando su valor x 2 ¿Qué está pasando? ¿Cómo lo arreglarías? 
			
			byte bit=100;
			//bit=bit*2; //Obvio se pasa del rango. casetar a int
			int num=bit*2;
			System.out.println(num);*/
		
		// ej5.EjerciciosVariosf();
		// ej5.ejTabla();
		
		/* Situándonos en Main, haz un import individual de HblaMundo ¿Qué esta pasando? ¿Funciona?
		¿Qué pasa si intentamos llamar a HastaNunqui sin importar el fichero? Explica las dos
		maneras distintas mediante a las cuales poderos solucionar esta.
		
		HolaMundo ej6 = new HolaMundo();
		// Tengo que importar el package
		
		HolaYAdios.HastaNunqui ej6b=new HolaYAdios.HastaNunqui();
		// O puedo instanciarlo todo dentro  */
		
		// String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "IS", "SQL", "Java"};
		// ej7.recorrer(tecnologies, 0);
		// ej7.recorrerConLimite(tecnologies, 0);
		// List<Integer> miArrayList = new ArrayList<Integer>();
		// ej7.fibonacci(miArrayList, 56, 0);
		// for (Integer integer : miArrayList) {
		// 	System.out.print(integer+" ");
		// }
		// System.out.println(ej7.inversion("supercalifragilisticoespialidoso", "", 0));
		// System.out.println(ej7.sumaLikeFact(123456789, 0, 0));
		
		/*
		Car cotxe1= new Car();
		Car cotxe2= new Car("C3","Citroen",Color.gray, 50);
		Car cotxe3= new Car("1076","Peugeot",Color.blue, 100);
		
		System.out.println(cotxe1.getMarca());
		System.out.println(cotxe2.getFuel());
		System.out.println(cotxe3.getModel());
		System.out.println(cotxe3.getColor());
		cotxe2.setColor(Color.BLACK);
		cotxe2.setFuel(60);
		cotxe2.setMarca("Tesla");
		cotxe2.setModel("123");
		System.out.println(cotxe2.toString());
		System.out.println(cotxe2.driveFuel());
		*/
		
		// Card tarjeta1=new Card("111222333444", "Pepito Palotes", "1234");
		// tarjeta1.Menu();
		
		/*
		Planta plantita=new Planta();
		plantita.tipo="Plantita";
		plantita.Alimentarse();
		
		Carnivoro carniv=new Carnivoro();
		carniv.Alimentarse();
		
		Herbivoro herbi= new Herbivoro();
		herbi.Alimentarse(); 
		System.out.println(carniv.RespirarPorMinuto());
		System.out.println(herbi.RespirarPorMinuto()); */
		
		// TresEnRalla tresEnRalla= new TresEnRalla();
		//tresEnRalla.Menu();
	
		/*
		Developer dev1=new Developer("David", "Virgen de los Santos", 28, "12345678A", Profesiones.BACK_END_DEVELOPER);
		Developer dev2=new Developer("Jose", "Mota", 45, "87654321T", Profesiones.FRONT_END_DEVELOPER);
		Developer dev3=new Developer("Agustin", "Magno", 36, "45546776B", Profesiones.FULL_STACK_DEVELOPER);
		dev1.comprobando();
		dev2.comprobando();
		dev3.comprobando();
		*/
		
		// JDBC bbdd= new JDBC();
		// bbdd.conecxion();
		
		EjerciciosSwing es =new EjerciciosSwing();
		es.panelOption();


	}


}

