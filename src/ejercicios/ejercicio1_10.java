package ejercicios;

import java.util.Scanner;

public class ejercicio1_10 {

	public static void main(String[] args) {
/*Programa que calcule el cambio que se debe devolver al usuario.
 *  Se pedirán por teclado dos números, el precio del artículo y el importe introducido. 
 *  Se devolverá el número de monedas a entregar óptimo suponiendo que tenemos disponibilidad de monedas infinita.
 */
		
		Scanner teclado = new Scanner(System.in);
		
		float precio;
		float importe;
		
		System.out.println("Introduce el precio del articulo ");
		precio = teclado.nextFloat();
		System.out.println("Introduce el importe introducido ");
		importe = teclado.nextFloat();
		
		float calculo= importe - precio;
		int euros = (int) calculo;
		int centimos =  (int) ((calculo-euros)*100);
		
		int monedas2eu = euros/2;
		int monedas1eu = euros%2;
		int monedas50c = centimos/50;
		centimos =centimos %50;
		int monedas20c = centimos/20;
		centimos =centimos %20;
		int monedas10c = centimos/10;
		centimos =centimos %10;
		int monedas05c = centimos/5;
		centimos =centimos %5;
		int monedas02c = centimos/2;
		int monedas01c = centimos%2;
		
		
				
		System.out.printf("El cambio es: %.2f €  ", calculo );
		System.out.printf( "\nMoneda de 2€:  "+ monedas2eu);
		System.out.printf( "\nMoneda de 1€:  "+ monedas1eu);
		System.out.printf( "\nMoneda de 0.50€:  "+ monedas50c);
		System.out.printf( "\nMoneda de 0.20€:  "+ monedas20c);
		System.out.printf( "\nMoneda de 0.10€:  "+ monedas10c);
		System.out.printf( "\nMoneda de 0.05€:  "+ monedas05c);
		System.out.printf( "\nMoneda de 0.02€:  "+ monedas02c);
		System.out.printf( "\nMoneda de 0.01€:  "+ monedas01c);
		
		/*System.out.println("Hay "+euros/2+"monedas de 2 €");
		System.out.println("Hay "+euros%2+"monedas de 1 €");
		*/
		teclado.close();

	}

}

