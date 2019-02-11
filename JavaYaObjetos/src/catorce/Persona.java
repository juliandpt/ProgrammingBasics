package catorce;

import java.util.Scanner;
/*Confeccionar una clase que permita carga el nombre y la edad de una persona. 
 * Mostrar los datos cargados. 
 * Imprimir un mensaje si es mayor de edad (edad>=18)

*/
public class Persona {
	/*
	 * La clase tendra tres atributos privados:
	 * uno de tipo Scanner para leer de la entrada standar
	 * otro de tipo String para guardar el nombre de cada
	 * instancia de tipo persona, y otro de tipo int para
	 * guardar la edad
	 * */
		private Scanner sc;
		private String nombre;
		private int edad;

	/**
	 * Este metodo guarda en el atributo de tipo Scanner
	 * un nuevo objeto apuntando a la entrada standar,
	 * imprime un mensaje en el que pide el nombre y lo 
	 * guarda en el atributo de tipo String, e imprime
	 * un mensaje para pedir la edad y lo guarda en el 
	 * atributo de tipo int
	 */
		
	public void inicializar() {
		sc = new Scanner(System.in);
		System.out.println("Dame el nombre: ");
		nombre = sc.next();
		System.out.println("Dame la edad: ");
		edad = sc.nextInt();
	}
	/**
	 * Este metodo imprime por la salida standar 
	 * el valor de los atributos  nombre y edad 
	 */
	public void imprimir() {
		System.out.println("El nombre es " + nombre);
		System.out.println("La edad es " + edad);
	}
	/**
	 * Este metodo devuelve true si el atributo edad
	 * es mayor o igual a 18
	 * @return true if this.edad>=18, false if not
	 */
	public boolean esMayorEdad() {
		if(edad>=18) {
			return true;
		}
		return false;
		
		//return (edad>=18);
	}

	public static void main(String[] ar) {
		Persona persona1= new Persona();
		persona1.inicializar();
		persona1.imprimir();
		if(persona1.esMayorEdad()) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
	}
}
