package ejercicios;

import java.util.Scanner;

public class ejercicio1_2 {

	public static void main(String[] args) {
	// Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
		
Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Introduce un nombre ");
		nombre = teclado.nextLine();
		
		System.out.println("Buenos dias " + nombre );
		
		teclado.close();

	}

}
