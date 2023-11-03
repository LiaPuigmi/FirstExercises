import java.math.BigInteger;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No funciona el emoji en consola jeje xd
		System.out.println("I ♥ love Java");
		System.out.println("Buenas tardes,\nmi nombre es Lia.");
		System.out.println("Buenas tardes,\tmi nombre es Lia.");
		System.out.println("Hola\\(o.o)/");
		System.out.println("\"Buenas\" tardes...");
		System.out.println("\'Malas\'? tardes");
		System.out.println("Buenas tardes,\rmi nombre es Lia.");
		System.out.println("Buenas tardes, ,\bmi nombre es Lia.");


		HelloWorld.main(args);
		HelloWorld.ejercicioTipo();
		HelloWorld.ejercicioCircular();
		HelloWorld.ejercicioConstantes();
		HelloWorld.ejercicioCalculoRango();
	}

	//Classe con nombre HelloWorld que imprime la suma de dos numeros integers
public class HelloWorld{
	//metodo main con parametro args que es un array de strings que no devuelve nada
	public static void main(String[] args) {
		//Variables integers
		int num1=10;
		int num2=20;
		int suma=num1+num2;
		//imprimir la suma
		System.out.println("EJERCICIO COMENTARIOS SUMA");
		System.out.println(suma);
	}
	
	/* EJERCICIO DEFINICIÓN PRIMITIVOS */
	public static void ejercicioTipo() {
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
	public static void ejercicioCircular() {
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
	public static void ejercicioConstantes() {
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
	
	public static void ejercicioCalculoRango() {
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
	
	
}

}

