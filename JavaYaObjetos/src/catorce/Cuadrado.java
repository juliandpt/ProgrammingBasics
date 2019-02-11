package catorce;

import java.util.Scanner;

public class Cuadrado {
	/**
	 * Esta clase tiene un unico atributo de tipo int para guardar 
	 * la longitud del lado del cuadrado
	 */
	private int lado;
	/**
	 * Constructor de la clase, guarda en el atributo lado el parametro que recibe
	 * @param l valor del lado
	 */
	public Cuadrado(int l) {
		lado = l;
	}
	
	/**
	 * Devuelve el perimetro del cuadrado (4 veces la longitud del lado)
	 * @return Entero representndo el valor del perimetro
	 */
	public int getPerimetro() {
		return (4*lado);
		
	}
	/**
	 * Devuelve el valor de la superficie (lado al cuadrado)
	 * @return Entero indicando el valor de la superficie
	 */
	public int getSuperficie() {
		return (lado*lado);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese valor del lado :");
		int l = sc.nextInt();
		sc.close();
		Cuadrado cuadrado1 = new Cuadrado(l);
		System.out.println("El perimetro del cuadrado es "+cuadrado1.getPerimetro());
		System.out.println("La superficie del cuadrado es "+cuadrado1.getSuperficie());
	}
}
