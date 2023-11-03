
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
	
}

}

