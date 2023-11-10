package Exercises;

import java.util.Random;

public class Navidad {
	
	public void ArbolDeNavidad(String colorFondo, String colorArbol, String colorSuelo, String colorTronco, String colorBolita) {
		int index,j,k,filas;
        filas=6; //Modifica este parámetro si quieres
        for(index=1; index<filas+(filas/2); index++){
            for(j=filas+(filas/2); j>index; j--){
                System.out.print(colorFondo+" ");}
            for(k=1; k<=index-1; k++){
            	//Random rn=new Random();
            	//int num=rn.nextInt(7);
            	if(k%2==0) {
                    System.out.print(colorBolita+"*"+colorArbol+"*");
            	}else {
                System.out.print(colorArbol+"**");
                }
            }
            for(j=filas+(filas/2); j>index; j--){
                System.out.print(colorFondo+" ");}
            System.out.println("");
        }
        for(index=1; index<filas-(filas/2); index++){
            for(j=filas+(filas/2); j>3; j--){
                System.out.print(colorSuelo+" ");}
            for(k=filas/2; k<=(filas/2)+1; k++){
                System.out.print(colorTronco+"**");}
            for(j=filas+(filas/2); j>3; j--){
                System.out.print(colorSuelo+" ");}
            System.out.println("");
        }
	}
}
