package diecinueve;

import java.util.Scanner;

public class PruebaVector11 {
	/**
	 * Esta clase tiene tres atributos privados: 
	 * 	-teclado de tipo Scanner para leer de la entrada standar
	 * 	-nombres de tipo String[] para guardar el nombre de los empleados
	 * 	-sueldos de tipo float[] para guardar su sueldo
	 */
	
	private Scanner sc;
	private String[] nombres;
	private float[] sueldos;
	private final static int TamVectores = 2;
	
	/**
	 * Inicializar teclado como objeto Scanner referenciando a System.in
	 * nombres y sueldos como vectores de 5 elementos
	 */
	public PruebaVector11() {
		sc = new Scanner (System.in);
		nombres = new String[5];
		sueldos = new float[5];
	}
	/*
	 * Guardar en sueldos y nombres el valor del sueldo y nombre de cada
	 * empleado pidiendolos y leyendolos por pantalla
	 */
	public void cargar() {
		for(int i = 0; i<5; i++) {
			System.out.println("Nombre: ");
			nombres[i] = sc.next();
			System.out.println("Sueldo: ");
			sueldos[i] = sc.nextFloat();
		}
	}
	/**
	 * 
	 * @return Indice en el vector sueldos del mayor de sus elementos
	 */
	public int posMayorSueldo() {
		int posMayor = 0;
		for (int i = 0; i<5; i++) {
			if(sueldos[i] > sueldos[posMayor]) {
				posMayor = i;
			}
		}
		return posMayor;
	}
	/**
	 * Imprime nombres[pos] y sueldos[pos]
	 * @param pos posicion de la que imprimir la informacion
	 */
	private void printInfo(int pos) {
		System.out.println(nombres[pos]);
		System.out.println(sueldos[pos]);
		
		
	}

	public static void main(String[] ar) {
		PruebaVector11 pv = new PruebaVector11();
		pv.cargar();
		int pos = pv.posMayorSueldo();
		System.out.println("Info del empleado con mayor sueldo:");
		pv.printInfo(pos);
	}

}