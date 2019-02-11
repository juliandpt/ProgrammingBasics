package dieciocho;

import java.util.Scanner;

public class PruebaVector10 {
	/**
	 * Esta clase tiene tres atributos privados
	 * uno de tipo Scanner para leer de la entrada standar,
	 * otro de sipo String[] para guardar los nombres
	 * y otro de tipo int[] para guardar las edades
	 */
	private Scanner sc;
	private String[] nombres;
	private int[] edades;
	/**
	 * Inicializar atributo Scanner apuntando a System.in
	 * y nombres y edades como atributos de 5 elementos
	 */
	public PruebaVector10() {
		sc = new Scanner (System.in);
		nombres = new String[5];
		edades = new int[5];
	}
	/**
	 * Inicializar pidiendo los valores por pantalla, las edades y nombres
	 * de los 5 elementos
	 */
	public void cargar() {
		for(int i = 0; i<5; i++) {
			System.out.println("Dame tu nombre: ");
			nombres[i] = sc.next();
			System.out.println("Dame tu edad: ");
			edades[i] = sc.nextInt();
		}
	}
	/**
	 * Imprime nombre y edad de aquellas personas mayores de edad
	 */
	public void printMayoresDeEdad() {
		for (int i=0; i<edades.length; i++) {
			if(edades[i]>=18) {
				System.out.println(nombres[i]);
				System.out.println(edades[i]);
			}		
		}
	}

	public static void main(String[] args) {
		PruebaVector10 pv = new PruebaVector10();
		pv.cargar();
		pv.printMayoresDeEdad();
	}
}