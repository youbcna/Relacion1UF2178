package ejercicios;

import java.util.Scanner;

public class ejercicio1_6 {

	public static void main(String[] args) {
		// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		
		
		System.out.println("Introduce la velocidad en km/h:  ");
		Numero1 = teclado.nextFloat();
		
		System.out.println(Numero1 + " km/h son " + Math.round((Numero1*0.2778)*100)/100.0 + " m/s");
		
		teclado.close();

	}

}
