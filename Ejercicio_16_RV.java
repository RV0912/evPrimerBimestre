package evPrimerBimestre;

import java.util.Scanner;

public class Ejercicio_16_RV {

	public static void main(String[] args) {
		  
		Scanner ingreso = new Scanner(System.in);
		int cafe;
        
		System.out.println("Ingrese el num (1 al 4) del cafe que quiere \no ingrese 5 para salir: ");
		cafe = ingreso.nextInt();
		
        switch (cafe) {
            case 1:
            	System.out.println("Eligio café cortado☺");
                break;
            case 2:
            	System.out.println("Eligio café latte☺");
                break;
            case 3:
            	System.out.println("Eligio café solo☺");
                break;
            case 4:
            	System.out.println("Eligio café lagrima☺");
                break;
            case 5:
            	System.out.println("Usted salio del programa");
                break;
            
            }
        
        
	}

}
