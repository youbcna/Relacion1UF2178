package ejercicios;

import java.util.Scanner;

public class ejercicio1_8 {

	public static void main(String[] args) {
		// Programa que calcula el volumen de una esfera.
Scanner teclado = new Scanner(System.in);
		
		float Numero1;
		
		
		System.out.println("Introduce el radio de la esfera ");
		Numero1 = teclado.nextFloat();
		float volumen = Math.round(4/3.0*Math.PI*Math.pow(Numero1,3)*100)/100f;
		System.out.println("El volumen de la esfera es: "+ volumen); //Math.round(4/3.0*Math.PI*Math.pow(Numero1,3)*100)/100.0);
		
		
		/*double volumen =4/3.0*Math.PI*Math.pow(Numero1,3);
		System.out.printf("El volumen de la esfera es: %.2f ", volumen); 
		teclado.close();*/ // se crea una variable y para ahorrar el math.round se pasa la variable a double y de println a printf,
		// para mostrar el resultado redondo se especifica "%.2f" esto redondea a 2 decimales

		teclado.close();

	}

}
