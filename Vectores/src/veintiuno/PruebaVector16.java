package veintiuno;

import java.util.Scanner;

public class PruebaVector16 {
	private Scanner teclado;
	private String[] nombres;
	private int[] notas;

	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		notas = new int[5];
		System.out.println("Carga de nombres y notas");
		for (int f = 0; f < nombres.length; f++) {
			System.out.print("Ingese el nombre del alumno:");
			nombres[f] = teclado.next();
			System.out.print("Ingrese la nota del alumno:");
			notas[f] = teclado.nextInt();
		}
	}

	/**
	 * Este metodo recorre el vector de notas con dos bucles (o indices)
	 * uno k de 0 al final del vector, y otro f de 0 a notas.length - 1 -k
	 * El proposito del indice k es solo establecer un limite para f que se
	 * reduce a cada iteracion (porque se le resta k al limite de f)
	 * En cada iteracion de f se compara cada termino con el siguiente desplazando
	 * el menor a la derecha. De este modo en la primera iteracion de k dentro de f 
	 * recorrer 
	 * todo el vector, y dejar el menor elemento a la derecha. 
	 * En la segunda iteracion 
	 * de k se hara lo mismo recorriendo todo el vector menos la ultima posicion
	 * (en la que esta el ultimo de la iteracion anterior) dejando el segundo
	 * menor elemento en la penultima posicion, se seguira con este proceso
	 * hasta comparar los dos elementos mayores situados en las posiciones 0 y 1
	 * 
	 * Nota: Si se intercambian las notas en el vector de notas, hay que hacer lo 
	 * mismo con los nombres en el vector de nomnbres
	 */
	public void ordenar() {
		for (int k = 0; k < notas.length; k++) {
			for (int f = 0; f < notas.length - 1 - k; f++) {
				if (notas[f] < notas[f + 1]) {
					int aux = notas[f];
					notas[f] = notas[f+1];
					notas[f+1] = aux;
				}
			}
		}
	}

	public void imprimir() {
		System.out.println("Nombres de alumnos y notas de mayor a menor");
		for (int f = 0; f < notas.length; f++) {
			System.out.println(nombres[f] + " - " + notas[f]);
		}
	}

	public static void main(String[] ar) {
		PruebaVector16 pv = new PruebaVector16();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}
}