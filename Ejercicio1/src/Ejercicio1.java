import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Cuantos elementos tiene el array?");
		int valArray = sc.nextInt();
		int [] array = new int [valArray];
		int numero = 0;
		int numPar = 0;
		int posPar = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dame un numero: ");
			numero = sc.nextInt();
			array[i] = numero;
			
			if (numero%2 == 0) {
				numPar += numero;
			}
			
			if(i%2 == 0) {
				posPar += numero;
			}
		}
		
		System.out.println("La suma de elemtos pares es : " + numPar);
		System.out.println("La suma de los elementos de las posiciones pares es: " + posPar);
	}

}
