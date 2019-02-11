package diecisiete;

import java.util.Scanner;

public class PruebaVector8 {
	/**
	 * Esta clase tiene un atributo Scanner teclado para leer de la entrada standar,
	 * y otro int[] sueldos para almacenar los sueldos de los operarios
	 */
	private Scanner sc;
	private int[] sueldos;
	/**
	 * Iniciliza el valor de la variable teclado
	 */
	public PruebaVector8() {
		sc = new Scanner(System.in);
	}

	/**
	 * Pide el numero de sueldos a cargar, inicializa sueldos como vector de enteros
	 * de ese tamanio, y pide el valor de cada uno de los sueldos guardandolos en el
	 * vector
	 */
	public void cargar() {
		System.out.print("Cuantos sueldos cargar:");
		int cantidadSueldos = sc.nextInt();
		sueldos = new int[cantidadSueldos];
		for(int i = 0; i<cantidadSueldos; i++) {
			System.out.println("Dime tu sueldo: ");
			sueldos[i] = sc.nextInt();
		}
	}

	/**
	 * Imprime el valor de cada una de las posiciones del vector
	 */
	public void imprimir() {
		for(int i = 0; i<sueldos.length; i++) {
			System.out.println(sueldos[i]);
		}
		
	}

	public static void main(String[] ar) {
		PruebaVector8 pv = new PruebaVector8();
		pv.cargar();
		pv.imprimir();
	}
}