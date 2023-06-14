package ejercicios;

public class ejercicio1_15 {

	public static void main(String[] args) {
		// Programa para pasar de grados centígrados a grados Kelvin
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa de convesion de grados "
				+ "centigrados a Kelvin");
		float centigrados = teclado.nextFloat();
		System.out.println("Son "+(centigrados+273)+" grados kelvin");
	}

}
