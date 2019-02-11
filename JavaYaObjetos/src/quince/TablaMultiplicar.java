package quince;

import java.util.Scanner;

public class TablaMultiplicar {
	
	/***
	 * Esta clase no tiene atributos
	 */
	/**
	 * Constructor de la clase, imprime por pantalla un mensaje con el texto:
	 * "Construida instancia de objeto TablaMultiplicar"
	 */
	public TablaMultiplicar() {
		System.out.println("Construida instancia de objeto TablaMultiplicar");
	}
	
	/**
	 * Pide un entero al usuario y si es distinto de -1  
	 * imprime su tabla de multiplicar del 1 al 10 
	 * invocando al metodo imprimirTablaDel(v) donde v
	 * es el valor que ha introducido el usuario, 
	 * se repite este proceso hasta que el usuario introduce -1
	 * 
	 * Implementar con un while o do while, construir objeto de tipo Scanner antes
	 * del bucle y cerrarlo después, para leer de la entrada standar.
	 * Cuando el usuario introduce -1, imprimir un mensaje con el texto "Adios"
	 */
	public void imprimirTablas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero entero: ");
		int v = sc.nextInt();
		
		while(v>=0) {
			this.imprimirTablaDel(v);
			System.out.println("Dame otro numero entero: ");
			v = sc.nextInt();
		}
		
		
		
	}
	/**
	 * Imprime la tabla del 1 al 10 del valor que recibe como parametro
	 * Idea feliz: iterar con un bucle for, de v a v * 10, sumando de v en v 
	 * @param v valor del que se imprimira la tabla
	 */
	public void imprimirTablaDel(int v) {
		System.out.println("Tabla del "+ v +":");
		
		for(int i=1; i<=10; i++) {
			System.out.println(v + "x" + i + "=" + v*i);
		}
		//completar funcion
		
	}

	public static void main(String[] ar) {
		TablaMultiplicar tabla;
		tabla = new TablaMultiplicar();
		tabla.imprimirTablas();
	}
}
