package quince;

import java.util.Scanner;

public class MayorMenor {
	
	public void cargarValores() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese primer valor:");
		int valor1 = teclado.nextInt();
		System.out.print("Ingrese segundo valor:");
		int valor2 = teclado.nextInt();
		System.out.print("Ingrese tercer valor:");
		int valor3 = teclado.nextInt();
		teclado.close();
		int mayor, menor;
		mayor = calcularMayor(valor1, valor2, valor3);
		menor = calcularMenor(valor1, valor2, valor3);
		System.out.println("El valor mayor de los tres es:" + mayor);
		System.out.println("El valor menor de los tres es:" + menor);
	}

	public int calcularMayor(int v1, int v2, int v3) {
		int m = Integer.MIN_VALUE;
		if (v1>v2 && v1>v3) {
			m = v1;
		}else {
			if (v2>v3) {
				m = v2;
			}else {
				m = v3;
			}
		}
		
		return m;
	}

	public int calcularMenor(int v1, int v2, int v3) {
		int m = Integer.MAX_VALUE;
		if (v1<v2 && v1<v3) {
			m = v1;
		}else {
			if (v2<v3) {
				m = v2;
			}else {
				m = v3;
			}
		}
		
		return m;
	}

	public static void main(String[] ar) {
		MayorMenor maymen = new MayorMenor();
		maymen.cargarValores();
	}
}