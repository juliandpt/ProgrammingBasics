/**
 * 
 */
package catorce;

/**
 * @author lucas
 *
 */
import java.util.Scanner;

public class Triangulo {
	/***
	 * Esta clase contiene un atributo privado de tipo Scanner para leer de la 
	 * entrada standar, y tres atributos privados de tipo entero para guardar
	 * la longitud de cada uno de los lados
	 */
	private Scanner sc;
	private int l1, l2, l3;

	
	/**
	 * Constructor de la clase, no recibe parametros.
	 * Inicializa el atributo de tipo Scanner con un nuevo objeto Scanner referenciando
	 * a System.in
	 * Pide por pantalla la longitud de cada uno de los lados del triangulo 
	 * y los guarda en los
	 * atributos enteros
	 */
	public Triangulo() {
		sc = new Scanner(System.in);
		System.out.println("Dame el lado 1: ");
		l1 = sc.nextInt();
		System.out.println("Dame el lado 2: ");
		l2 = sc.nextInt();
		System.out.println("Dame el lado 3: ");
		l3 = sc.nextInt();
	}

	/**
	 * Devuelve la longitud del mayor de los lados guardados en los atributos enteros
	 * @return Longitud del lado mayor
	 */
	public int ladoMayor() {
		if (l1>l2 && l1>l3) {
			return l1;
		}else if(l2>l3){
			return l2;
		}else {
			return l3;
		}
	}
	/**
	 * Permite consultar si un triangulo es equilatero (los tres lados seran iguales)
	 * @return True si es un triangulo equilatero, false en otro caso
	 */
	public boolean esEquilatero() {
	 return (l1==l2 && l2==l3);
	}

	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo();
		System.out.println("El lado mayor es "+
				triangulo1.ladoMayor());
		if(triangulo1.esEquilatero()) {
			System.out.println("Es un triangulo equilatero");
		}
		else {
			System.out.println("No es un triangulo equilatero");
		}
	}
}
