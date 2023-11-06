public class Navidad {
	
	public void ArbolDeNavidad() {
		int index,j,k,filas;
        filas=6; //Modifica este parámetro si quieres
        for(index=1; index<filas+(filas/2); index++){
            for(j=filas+(filas/2); j>index; j--){
                System.out.print(" ");}
            for(k=1; k<=index-1; k++){
                System.out.print("**");}
            for(j=filas+(filas/2); j>index; j--){
                System.out.print(" ");}
            System.out.println("");
        }
        for(index=1; index<filas-(filas/2); index++){
            for(j=filas+(filas/2); j>3; j--){
                System.out.print(" ");}
            for(k=filas/2; k<=(filas/2)+1; k++){
                System.out.print("**");}
            for(j=filas+(filas/2); j>1; j--){
                System.out.print(" ");}
            System.out.println("");
        }
	}
}
