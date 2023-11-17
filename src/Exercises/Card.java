package Exercises;

import java.util.Scanner;

public class Card {
	private String numero;
	private String titular;
	private String pin;
	private int saldo;
	private boolean operativa;
	
	public Card(String numero, String titular, String pin) {
		this.numero=numero;
		this.titular=titular;
		this.pin=pin;
		this.saldo=1000;
		this.operativa=true;
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getPin() {
		return pin;
	}

	public void setPin() {
		String pin=ponerPin("Pon nuevo pin de 4 digitos:");	
		this.pin = pin;
	}

	public int getSaldo() {
		return saldo;
	}

	public void Ingresar(int ingreso) {
		this.saldo += ingreso;
	}

	public boolean isOperativa() {
		return operativa;
	}

	public void Activar() {
		String pin= ponerPin("Introduce el pin:");
		if(this.pin.equals(pin)) {
			this.operativa = true;
			System.out.println("\u001B[32m Tarjeta activada correctamente. \u001B[0m");
		}else {
			System.out.println("\u001B[31m Su pin no es correcto, no se puede activar, ponte en contacto con su oficina. \u001B[0m");
		}
	}
	
	public void Desactivar() {
		String pin= ponerPin("Introduce el pin:");
		if(this.pin.equals(pin)) {
			this.operativa = false;
			System.out.println("\u001B[32m Tarjeta desactivada correctamente. \u001B[0m");
		}else {
			System.out.println("\u001B[31m Su pin no es correcto, no se puede desactivar, ponte en contacto con su oficina. \u001B[0m");
		}
	}
	
	public void Pagar(int factura) {
		String pin= ponerPin("Introduce el pin:");
		if(this.pin.equals(pin)) {
			if(this.operativa) {
				if(this.saldo>=factura) {
					this.saldo-=factura;
					System.out.println("\u001B[32m Tu saldo es de: "+getSaldo()+"€ \u001B[0m");
				}else {
					System.out.println("\u001B[31m No tienes suficiente saldo. \u001B[0m");
				}
			}else {
				System.out.println("\u001B[31m Para usar la tarjeta debe activarla. \u001B[0m");
			}
		}else {
			System.out.println("\u001B[31mNumero de pin incorrecto. \u001B[0m");
		}

	}
	
	public String ponerPin(String message) {
		Scanner sc = new Scanner(System.in);
		String pin = null;
		boolean firstRun=true;

		do {
	    	if (!firstRun) {
	            System.out.println("\u001B[31m That pin is invalid. \u001B[0m");
	         }
	    	 try {
	 	    	System.out.print(message+" ");
	 	    	pin = sc.next();
	 	    	firstRun = false;
	 		}catch(Exception e) {
	 			System.out.println("\u001B[31m Error de Scanner"+e+" \u001B[0m");
	 		};
	    	
		}while(pin.length() != 4 || !pin.matches("\\d{4}"));
		
	    return pin; 
	}
	
	public void Menu() {
		String mensaje= "\u001B[36m"+"Escoja que quiere hacer:\n"
				+ "1-Ingresar\n"
				+ "2-Pagar\n"
				+ "3-Activar Tarjeta\n"
				+ "4-Desactivar Tarjeta\n"
				+ "5-CambiarPin\n"
				+ "6-Ver Informacion\n"
				+ "7-Ver Titular\n"
				+ "8-Ver Saldo\n"
				+ "9-Ver Numero\n"
				+ "10-Cambiar titular\n"
				+ "11-Ver Pin\n"
				+ "12-Ver si esta operativa\n"
				+ "13-Salir del menú\n"+"\u001B[0m";
		int opcion= 0;
		do {
			opcion= imputUserIntBetween(mensaje, 1, 13);
			
				switch (opcion) {
				case 1: 
					int ingreso=imputUserIntBetween("Euros a ingresar:", 1, 900);
					Ingresar(ingreso);
					break;
				case 2:
					int factura=imputUserIntBetween("De cuanto es la factura?", 1, 5000);
					Pagar(factura);
					break;
				case 3:
					Activar();
					break;
				case 4:
					Desactivar();
					break;
				case 5:
					setPin();
					break;
				case 6:
					System.out.println(this.toString());
					break;
				case 7: 
					System.out.println("\u001B[32m"+getTitular()+"\033[0m");
					break;
				case 8:
					System.out.println("\u001B[32m"+getSaldo()+"\033[0m");
					break;
				case 9:
					System.out.println("\u001B[32m"+getNumero()+"\033[0m");
					break;
				case 10:
					Scanner sc2 = new Scanner(System.in);
					String titular = null;
			    	try {
			 	    	System.out.print("\u001B[34m Nuevo titular: \u001B[32m");
			 	    	pin = sc2.next();
			 		}catch(Exception e) {
			 			System.out.println("\033[31m Error de Scanner"+e+"\033[0m");
			 		};
					setTitular(titular);
					sc2.close();
					break;
				case 11:
					System.out.println("\u001B[32m"+getPin()+"\033[0m");
					break;
				case 12:
					System.out.println("\u001B[32m"+isOperativa()+"\033[0m");
					break;
				case 13:
					System.out.println("\033[31m Saliendo del menú...\033[0m");
                    System.exit(0);
					break;
				default:
					throw new IllegalArgumentException("\033[31m Unexpected value: " + opcion+"\033[0m");
				}
	
	        } while (opcion != 13);
	}
	
	public int imputUserIntBetween(String message, int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		boolean firstRun = true;
		int num;
	    do {
	    	if (!firstRun) {
	            System.out.println("\u001B[31m That number is invalid. \u001B[0m");
	         }
	    	System.out.print("\u001B[34m"+message+"\u001B[32m ");
	    	num = sc.nextInt();
	    	firstRun = false;
		}while(num<num1 || num>num2);
		
	    return num; 
	}

	@Override
	public String toString() {
		return "\u001B[32m Card [numero=" + numero + ", titular=" + titular + ", pin=" + pin + ", saldo=" + saldo + ", operativa="
				+ operativa + "]+\033[0m";
	}
	
}
