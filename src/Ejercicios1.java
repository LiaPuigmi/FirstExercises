import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicios1 {

	/* EJERCICIO SECUENCIAS ESCAPE */
	public void secuenciasEscape() {
		System.out.println("Buenas tardes,\nmi nombre es Lia.");
		System.out.println("Buenas tardes,\tmi nombre es Lia.");
		System.out.println("Hola\\(o.o)/");
		System.out.println("\"Buenas\" tardes...");
		System.out.println("\'Malas\'? tardes");
		System.out.println("Buenas tardes,\rmi nombre es Lia.");
		System.out.println("Buenas tardes, ,\bmi nombre es Lia.");
	}
	
	/* EJERCICIO COMENTAR */
	//metodo main con parametro args que es un array de strings que no devuelve nada
	public void estoEsUnMain(/*String[] args*/) {
		//Variables integers
		int num1=10;
		int num2=20;
		int suma=num1+num2;
		//imprimir la suma
		System.out.println("EJERCICIO COMENTARIOS SUMA");
		System.out.println(suma);
	}
	
	/* EJERCICIO DEFINICIÓN PRIMITIVOS */
	public void ejercicioTipo() {
		System.out.println("EJERCICIO DEFINICIÓN PRIMITIVOS");
		//Lógicos
		boolean interruptor=false;
		System.out.println("Boolean: "+interruptor);
		//Carácter
		char letra='A';
		System.out.println("Char: "+letra);
		//Numéricos enteros
		byte numerito=29;
		System.out.println("Byte: "+numerito);
		short numeritoMayor=32000;
		System.out.println("Short: "+numeritoMayor);
		int numeroStandar=320000;
		System.out.println("Int: "+numeroStandar);
		long numeroMayor=3200000000L;
		System.out.println("Long: "+numeroMayor);
		//Numéricos reales
		float numRealChikito=22.333f;
		System.out.println("Float: "+numRealChikito);
		double numRealMayor=22.33333333333;
		System.out.println("Double: "+numRealMayor);
		//Constantes
		final char LETRA_CONSTANTE='L';
		/* LETRA_CONSTANTE='S'; Obvio no se puede cambiar */
		System.out.println("CONSTANTE_CHAR: "+LETRA_CONSTANTE);
	}
	
	/* EJERCICIO RANGO CIRCULAR */
	public void ejercicioCircular() {
		//En el caso de byte, el número deberá de desbordar 5 posiciones
		byte numByte=(byte) (Byte.MAX_VALUE+5);
		System.out.println("Byte Circular 5 posiciones: " + numByte);
		//En el caso de short, el número deberá de desbordar 25 posiciones
		short numShort=(short) (Short.MAX_VALUE+25);
		System.out.println("Short Circular 25 posiciones: " + numShort);
		//En el caso de int, el número deberá de desbordar 10000 posiciones
		int numInt=(int)(Integer.MAX_VALUE+10000);
		System.out.println("Int Circular 10000 posiciones: " + numInt);
		//En el caso de long, el número deberá de desbordar 20000 posiciones
		long numLong=(long)(Long.MAX_VALUE+20000);
		System.out.println("Long Circular 20000 posiciones: " + numLong);
	}
	
	/* EJERCICIO TRANSFORMAR A CONSTANTES PRIMITIVOS */
	public void ejercicioConstantes() {
		System.out.println("EJERCICIO TRANSFORMACIÓN PRIMITIVOS A CONSTANTES");
		//Lógicos CONSTANTES
		final boolean INTERRUPTOR=false;
		System.out.println("Boolean: "+INTERRUPTOR);
		//Carácter CONSTANTES
		final char LETRA='A';
		System.out.println("Char: "+LETRA);
		//Numéricos enteros CONSTANTES
		final byte NUMERITO=29;
		System.out.println("Byte: "+NUMERITO);
		final short NUMERITO_MAYOR=32000;
		System.out.println("Short: "+NUMERITO_MAYOR);
		final int NUMERO_STANDAR=320000;
		System.out.println("Int: "+NUMERO_STANDAR);
		final long NUMERO_MAYOR=3200000000L;
		System.out.println("Long: "+NUMERO_MAYOR);
		//Numéricos reales CONSTANTES
		final float NUM_REAL_CHIKITO=22.333f;
		System.out.println("Float: "+NUM_REAL_CHIKITO);
		final double NUM_REAL_MAYOR=22.33333333333;
		System.out.println("Double: "+NUM_REAL_MAYOR);
		
	}
	
	/* EJERCICIO CALCULAR RANGOS PRIMITIVOS */
	/* Calcula el rango de todos los tipos de datos primitivos.
		Veras que tanto char y boolean tienen solamente positivos. Y los números (al
		tener necesidades distintas), se subdividen en valores positivos y negativos.
		-> 2(base binaria)^X(bits)=Y(total del rango)
		• Y(total del rango)/2=Z(valores para positivos y negativos)*/
	
	public void ejercicioCalculoRango() {
		int numBool= (int) Math.pow(2, 1);
		System.out.println("Total rango boolean: "+numBool);
		System.out.println("Valores negativos boolean: "+ numBool/2 +" y positivos: "+numBool/2);
		
		int numChar=(int) Math.pow(2, 16);
		System.out.println("Total rango char: "+numChar);
		System.out.println("Valores negativos boolean: 0 y positivos: "+(numChar-1));
		
		int numByte=(int) Math.pow(2, 8);
		System.out.println("Total rango byte: "+numByte);
		System.out.println("Valores negativos byte: "+-numByte/2 +" y positivos: "+(numByte/2-1));
		
		int numShort=(int) Math.pow(2, 16);
		System.out.println("Total rango short: "+numShort);
		System.out.println("Valores negativos short: "+ -numShort/2 +" y positivos: "+(numShort/2-1));
		
		long numInt=(long) Math.pow(2, 32);
		System.out.println("Total rango int: "+numInt);
		System.out.println("Valores negativos int: "+ -numInt/2 +" y positivos: "+(numInt/2-1));
		
        BigInteger numLong = new BigInteger("2").pow(64);
		System.out.println("Total rango long: "+numLong);
		System.out.println("Valores negativos long: "+ Long.MIN_VALUE +" y positivos: "+Long.MAX_VALUE);
		
		long numFloat=(long) Math.pow(2, 32);
		System.out.println("Total rango float: "+numFloat);
		System.out.println("Valores negativos float: "+ Float.MIN_VALUE +" y positivos: "+Float.MAX_VALUE);
		
        BigInteger numDouble = new BigInteger("2").pow(64);
		System.out.println("Total rango double: "+numDouble);
		System.out.println("Valores negativos double: "+ Double.MIN_VALUE +" y positivos: "+ Double.MAX_VALUE);
	}
	
	/* EJERCICIO CONCATENAR CADENAS */
	// Define las siguientes variables nombre, apellido, calle, municipio, código postal, sexo (tipo
	// char), correo electrónico y concaténalas haciendo saltos de líneas, tabulaciones...  en un solo sysout.
	public static void ejercicioConcat() {
		String nombre="Lia";
		String apellido="Puigmitjà";
		String calle="Calle Bailén 161";
		String municipio="Barcelona";
		char sexo='Z';
		String email="liapuigmi@gmail.com";
		System.out.println(nombre+"\t"+apellido+"\n"+calle+"\t"+municipio+"\n"+sexo+"\t"+email); 
		
	}	
	
	/* EJERCICIO OPERADORES ARITMÉTICOS */
	public void ejerciciosAritmeticos() {
		// Réstale a 10 5
		System.out.println(10-5); 
		// Haz una suma de 55 y 45
		System.out.println(55+45);
		// Pon el número 3 en negativo
		System.out.println(-3);
		// Multiplica 5 por 5
		System.out.println(5*5);
		// Haz una división de 25 entre 7 haciendo que el resultado sea un número entero
		System.out.println(Math.round(25/7));
		// Haz una división de 25 entre 7 haciendo que el resultado sea un número real
		 double num=(double)25/7; 
		 System.out.println(num); 
		// Calcula el resto de dividir 25 entre 4
		 System.out.println(25%4); 
	}
	
	/*	Define una variable global de tipo entero llamada numero inicializada con un valor de 0
	Haz una función que cada vez que llamemos a la función incrementar, incremente en un
	valor de la variable numero en 1 número en la misma instrucción
	Haz otra función llamada decrementar que reduzca el valor de un variable en 2 números
	en la siguiente instrucción */
	
	/* EJERCICIO OPERADORES ARITMÉTICOS INCREMENTALES INCREMENTAR */
	public int incrementar(int numero) {
		return ++numero;

		
	}
	/* EJERCICIO OPERADORES ARITMÉTICOS INCREMENTALES DECREMENTAR */
	public int decrementar(int numero) {
		return numero-=2;
		
	}

	/* EJERCICIOS OPERADORES ARITMÉTICOS COMBINADOS */

	public int sumar(int num, int sum) {
		return num+sum;
	}
	
	public int restar(int num, int rest) {
		return num-rest;
	}
	
	public int multiplicar(int num, int mult) {
		return num*mult;
	}
	
	public int dividir(int num, int div) {
		return num/div;
	}
	public int modulo(int num, int mod) {
		return num%mod;
	}
	
	/* EJERCICIOS OPERADORES DE RELACION */
	
	public boolean iguales(int num1, int num2) {
		return(num1==num2);
	}
	
	public boolean diferentes(int num1, int num2) {
		return(num1!=num2);
	}
	
	public boolean menor(int num1, int num2) {
		return(num1<num2);
	}
	
	public boolean mayor(int num1, int num2) {
		return(num1>num2);
	}
	
	public boolean menorIgual(int num1, int num2) {
		return(num1<=num2);
	}
	
	public boolean mayorIgual(int num1, int num2) {
		return(num1>=num2);
	}
	
	/* EJERCICIOS OPERADORES LÓGICOS/BOOLEANOS */
	public boolean boolInventido(boolean bool1, boolean bool2) {
		return (bool1==!bool2);
	}
	
	/* EJERCICIOS OPERADORES LÓGICOS/BOOLEANOS  OPERADOR CONDICIONAL*/
	public boolean opCondicional(int num) {
		return num%2==0?true:false;
	}
	
	public String parImpar(boolean bool) {
		if(bool) {
			return "par";
		}else {
			return "impar";
		}
	}
	
	public String blancoNegro(boolean bool) {
		if(bool) {
			return "blanco";
		}else {
			return "negro";
		}
	}
	
	/* EJERCICIOS ESTRUCTURAS CONDICIONALES */
	public String rojoNegroIf(int num) {
		String solucion="";
		if(num==0){
			solucion= "ROJO"; 
		}

		if(num==1){
			solucion= "NEGRO"; 
		}
		return solucion;		
	}
	
	public String rojoNegroElse(int num) {
		if(num==0){
			return("ROJO"); 
		}
		else{
			return("NEGRO"); 
		}
	}
	
	public String rojoNegroTernario(int num) {
		return(num==0?"ROJO":"NEGRO"); 
	}
	
	
	public float imputUserFloat(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
	    float temp = sc.nextFloat();
	    sc.close();
	    return temp; 
	}
	
	public int imputUserIntBetween(String message, int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		boolean firstRun = true;
		int num;
	    do {
	    	if (!firstRun) {
	            System.out.println("That number is invalid.");
	         }
	    	System.out.println(message);
	    	num = sc.nextInt();
	    	firstRun = false;
		}while(num<num1 || num>num2);
		
	    sc.close();
	    return num; 
	}
	
	public void temperaturasIf(float temp) {
		if(temp<10){
			System.out.println("Climas fríos");
			if(temp<5){
				System.out.println("Tipo Polar");
			}
			if(temp>=5){
				System.out.println("Tipo Alta montaña");
			}

		}
		if(temp>=10 && temp<20){
			System.out.println("Climas templados");
			if(temp<13.5){
				System.out.println("Tipo Oceánico");
			}
			if(temp>=13.5 && temp<16.5){
				System.out.println("Tipo Mediterráneo");
			}
			if(temp>=16.5){
				System.out.println("Tipo Continental");
			}

		}
		if(temp>=20){
			System.out.println("Climas cálidos");
			if(temp<23.5){
				System.out.println("Tipo Ecuatorial");
			}
			if(temp>=23.5 && temp<26.5){
				System.out.println("Tipo Tropical");
			}
			if(temp>=26.5){
				System.out.println("Tipo Desértico");
			}
		}
	}
	
	public void temperaturasElse(float temp) {
		if(temp<10){
			System.out.println("Climas fríos");
			if(temp<5){
				System.out.println("Tipo Polar");
			}else{
				System.out.println("Tipo Alta montaña");
			}
		}else if(temp>=10 && temp<20){
			System.out.println("Climas templados");
			if(temp<13.5){
				System.out.println("Tipo Oceánico");
			}else if(temp>=13.5 && temp<16.5){
				System.out.println("Tipo Mediterráneo");
			}else{
				System.out.println("Tipo Continental");
			}
		}else{
			System.out.println("Climas cálidos");
			if(temp<23.5){
				System.out.println("Tipo Ecuatorial");
			}else if (temp>=23.5 && temp<26.5){
				System.out.println("Tipo Tropical");
			}else{
				System.out.println("Tipo Desértico");
			}
		}
	}

	public void numeroEscrito(int num) {
		switch(num){
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
		}
	}
}
