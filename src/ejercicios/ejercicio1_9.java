package ejercicios;

import java.util.Scanner;

public class ejercicio1_9 {

	public static void main(String[] args) {
		// Programa que calcula el área de un triángulo a partir de la longitud de sus lados. 
		
Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		float Numero2;
		float Numero3;
		
		
		
		System.out.println("Introduce el valor del primer cateto ");
		Numero1 = teclado.nextFloat();
		System.out.println("Introduce el valor del segundo cateto");
		Numero2 = teclado.nextFloat();
		System.out.println("Introduce el valor del tercer cateto");
		Numero3 = teclado.nextFloat();
		float calculo = (Numero1 + Numero2 + Numero3)/2;
		double calculo2 = Math.sqrt(calculo*(calculo - Numero1)*(calculo - Numero2)*(calculo-Numero3));
		System.out.printf("El Area es: %.2f ", calculo2 );
		
		teclado.close();
	}

}
