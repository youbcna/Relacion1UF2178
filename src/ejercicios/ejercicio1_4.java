package ejercicios;

import java.util.Scanner;

public class ejercicio1_4 {

	public static void main(String[] args) {
		//Programa que lea una cantidad de grados centígrados y 
		//la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)

Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		
		
		System.out.println("Introduce los grados centigrados ");
		Numero1 = teclado.nextFloat();
		
		System.out.println( Numero1 + " Grados Celsius son " + (32+(9*Numero1 /5) )
				+ " Grados Farenheit "  );
		
		teclado.close();
	}

}
