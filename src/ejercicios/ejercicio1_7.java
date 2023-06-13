package ejercicios;

import java.util.Scanner;

public class ejercicio1_7 {

	public static void main(String[] args) {
		// Programa lea la longitud de los catetos de un triángulo rectángulo y
		// calcule la longitud de la hipotenusa según el teorema de Pitágoras. 
Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		float Numero2;
		
		
		System.out.println("Introduce el valor del primer cateto ");
		Numero1 = teclado.nextFloat();
		System.out.println("Introduce el valor del segundo cateto");
		Numero2 = teclado.nextFloat();
		
		System.out.println("La hipotenusa es: "+ Math.round(Math.sqrt(Math.pow(Numero1, 2) + Math.pow(Numero2, 2))*100)/100.0);
		
		teclado.close();

	}

}
