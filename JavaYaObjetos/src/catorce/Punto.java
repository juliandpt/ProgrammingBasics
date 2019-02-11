package catorce;

import java.util.Scanner;

public class Punto {
	private Scanner sc;
	private int x, y;
	/**
	 * Esta clase tiene los siguientes atributos privados:
	 * - Scanner teclado : para leer de la entrada standar
	 * - int x,y para guardar las posiciones del punto
	 */

	/**
	 * Constructor de la clase, no tiene parametros
	 * Guarda en la variable teclado un objeto de tipo Scanner referenciando a System.in
	 * Pide por pantalla los valores de x e y (enteros) y los almacena
	 */
	public Punto() {
		sc = new Scanner(System.in);
		System.out.println("Dane el valor de x: ");
		x = sc.nextInt();
		System.out.println("Dame el valor de y: ");
		y = sc.nextInt();
		}
	/**
	 * Devuelve el cuadrante al que pertenece el punto con la siguiente logica:
	 * - si x e y son mayores o iguales que 0 devuelve 1
	 * - si x es menor o igual a 0 e y es mayor o igual que cero devuelve 2
	 * - si x e y son menores o iguales que 0 devuelve 3
	 * - devuelve 4 en cualquier otro caso
	 * @return Un entero que representa el cuadrante al que pertenece el punto
	 */
	public int getCuadrante() {
		int c = -1;
		if (x>=0 && y>=0) {
			c = 1;
		}else if (x<=0 && y>=0){
			c = 2;
		}else if (x<=0 && y<=0) {
			c = 3;
		}else {
			c = 4;
		}
		return c;
	}

	public static void main(String[] ar) {
		Punto punto1;
		punto1 = new Punto();
		System.out.println("El punto pertenece al cuadrante "+punto1.getCuadrante());
	}
}
