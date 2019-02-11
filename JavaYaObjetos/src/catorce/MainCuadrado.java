package catorce;

import java.util.Scanner;

public class MainCuadrado {

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
