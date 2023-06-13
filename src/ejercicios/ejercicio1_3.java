package ejercicios;

import java.util.Scanner;

public class ejercicio1_3 {

	public static void main(String[] args) {
		// Programa Java que lee un número entero por teclado y obtiene
		// y muestra por pantalla el doble y el triple de ese número.
	Scanner teclado = new Scanner(System.in);
		
		int Numero1;
		
		
		System.out.println("Introduce un numero ");
		Numero1 = teclado.nextInt();
		
		System.out.println("El numero introducidos es " + Numero1 + ". El doble es: " + Numero1*2 
				+ ". El triple del numero es: " + Numero1*3 );
		
		teclado.close();
	}

}
