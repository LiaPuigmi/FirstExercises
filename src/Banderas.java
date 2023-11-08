import java.util.Iterator;
import java.util.Scanner;

public class Banderas {
	public String pintar(int numEspacios, String color, String reset) {
		String fila="";
		for (int i = 0; i < numEspacios; i++) {
			fila=fila+(color+" "+reset);
		}
		return fila;
	}
	
	public void saltoLinea() {
		System.out.println();
	}
	
	public void verticalSameColor(int filas,int numColumnas, int numEspacios, int separacion, String[] colors, boolean vertical, String reset) {
		int change= filas/separacion;
		int changeColor=-1;
		for (int i = 0; i < filas; i++) {
			if(i%change==0) {
				changeColor++;
			}
			if(!vertical) {
				System.out.println(horizontalChangeColor(numColumnas, numEspacios, colors[changeColor], reset));

			}else {
				System.out.println(horizontalChangeColor2(numColumnas, numEspacios, colors, reset));

			}
			
		}
		System.out.println("");
		
	}
	
	public String horizontalChangeColor(int columnas,int numEspacios, String color, String reset) {
		String fila="";
		for (int i = 0; i < columnas; i++) {
			fila=fila+pintar(numEspacios, color, reset);
		}
		return fila;
	}
	public String horizontalChangeColor2(int columnas,int numEspacios, String[] color, String reset) {
		String fila="";
		for (int i = 0; i < columnas; i++) {
			fila=fila+pintar(numEspacios, color[i], reset);
		}
		return fila;
	}
	
	public String pintarFila() {
		final String RESET="\033[0m";
		final String RED_BG = "\033[48;5;160m";
		final String BLUE_BG = "\033[48;5;33m";
		final String BLACK_BG="\033[48;5;16m";
		final String GREEN_BG="\033[48;5;46m";
		final String YELLOW_BG="\033[48;5;226m";
		final String WHITE_BG="\033[48;5;255m";
		String colorin;
		String descripcion="Pulsa un numero para elegir el color que quieres?\n1.ROJO\n2.AZUL\n3.VERDE\n4.AMARILLO\n5.NEGRO\n6.BLANCO";
		String fila="";
		int col=imputUserIntBetween("Numero de columnas?", 1, 100);
		for (int i = 0; i < col; i++) {
			String descColumn="Numero de espacios de la columna "+(i+1)+"?";
			
			int espacios=imputUserIntBetween(descColumn, 1, 100);
			int color=imputUserIntBetween(descripcion, 1, 100);
			switch (color) {
			case 1: 
				colorin=RED_BG;
				break;
			case 2:
				colorin=BLUE_BG;
				break;
			case 3:
				colorin=GREEN_BG;
				break;
			case 4:
				colorin=YELLOW_BG;
				break;
			case 5:
				colorin=BLACK_BG;
				break;
			case 6:
				colorin=WHITE_BG;
				break;
			default:
				colorin=RESET;
				break;
					
			}
			fila=fila+pintar(espacios, colorin, RESET);
		}
		return fila;
		
	}
	
	public void hacerBandera() {
		String banderaFinal="";
		int filas= imputUserIntBetween("De cuantas filas la bandera?", 1, 100);
		for (int i = 0; i < filas; i++) {
			banderaFinal=banderaFinal+"\n"+pintarFila();	
		}
		
		System.out.println(banderaFinal);
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
		
	    return num; 
	}
}
