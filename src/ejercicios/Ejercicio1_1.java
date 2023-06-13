package ejercicios;

import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		// Programa Java que lea dos números enteros por teclado y los muestre por pantalla. 
		
		Scanner teclado = new Scanner(System.in);
		
		int Numero1;
		int Numero2;
		
		System.out.println("Introduce un numero ");
		Numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero ");
		Numero2 = teclado.nextInt();
		
		System.out.println("Los numero introducidos son " + Numero1 + " y " + Numero2);
		
		teclado.close();
		
		// System.out.printf("Los numero introducidos son %d y %d",Numero1,Numero2);
		// teclado.close();  -- Esta seria otra opcion de poder mostrar los resultados

	}

}
