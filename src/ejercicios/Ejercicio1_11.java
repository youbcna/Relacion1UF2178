package ejercicios;

import java.util.Scanner;

public class Ejercicio1_11 {

	public static void main(String[] args) {
		// Programa que lee un número de 3 cifras y muestra sus cifras por separado. 
		
Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		
		
		System.out.println("Introduce el radio de la esfera ");
		Numero1 = teclado.nextFloat();
		
		float calculo = Numero1/10000;
		float calculo2 = calculo/1000;
		float calculo3 = calculo2/100;
		float calculo4 = calculo3/10;
		float calculo5 = calculo4/1;
		
		System.out.println("El volumen de la esfera es: "+ volumen); 

		teclado.close();
	}

}
