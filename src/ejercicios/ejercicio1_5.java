package ejercicios;

import java.util.Scanner;

public class ejercicio1_5 {

	public static void main(String[] args) {
		// Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
		//muestra por pantalla la longitud y el área de la circunferencia. 
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  

		
Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		
		
		System.out.println("Introduce el radio de la circunferencia ");
		Numero1 = teclado.nextFloat();
		
		System.out.println(  "El valor del radio de la circunferencia es: " + Math.round(((Numero1)*100)/100.0) + 
				", la longitud de la cirgunferencia es: " + Math.round((2*Math.PI*Numero1)*100)/100.0+ ", el area de la circunferencia es: " +
				Math.round( Math.PI*Math.pow ( Numero1, 2)*100)/100.0);
		
		teclado.close();
	}
	
	

}
