package dieciseis;

import java.util.Scanner;

public class PruebaVector1 {
	/**
	 * Esta clase tiene 2 atributos privados, teclado de tipo scanner para 
	 * guardar la entrada standar, y un sueldos de tipo int[](vector) 
	 * para almacenar los sueldos
	 */
	private Scanner sc;
	private int[] sueldos;
	/**
	 * Constructor de la clase, guarda en teclado una referencia a la entrada
	 * standar y e inicializa sueldos como vector de 5 enteros
	 */
	public PruebaVector1() {
		sc = new Scanner(System.in);
		sueldos = new int[5];
	}
	/**
	 * Pide y guarda en cada una de las 5 posiciones reservadas del vector sueldos
	 * el sueldo introducido por pantalla
	 */
	public void pedirSueldos() {
		System.out.println("Dame el primer sueldo: ");
		sueldos[0] = sc.nextInt();
		System.out.println("Dame el segundo sueldo: ");
		sueldos[1] = sc.nextInt();
		System.out.println("Dame el tercer sueldo: ");
		sueldos[2] = sc.nextInt();
		System.out.println("Dame el cuarto sueldo: ");
		sueldos[3] = sc.nextInt();
		System.out.println("Dame el quinto sueldo: ");
		sueldos[4] = sc.nextInt();
		
	}
	/**
	 * Imprime el valor de las 5 posiciones del vector sueldos
	 */
	public void imprimirSueldos() {
		for(int i=0; i<5; i++) {
			System.out.println(sueldos[i]);
		}
		
	}

	public static void main(String[] ar) {
		PruebaVector1 pv = new PruebaVector1();
		pv.pedirSueldos();
		pv.imprimirSueldos();
	}
}