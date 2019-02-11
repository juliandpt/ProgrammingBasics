package veinticinco;

import java.util.Scanner;

public class IrregularMatrix {
	
	private Scanner sc;
	private int matrix[][];
	
	public void cargar() {
		
		sc = new Scanner(System.in);
		System.out.println("Cuantas filas tienes la matriz: ");
		int f = sc.nextInt();
		matrix = new int [f][];
		
		for(int i = 0; i < matrix.length; i++) {
			System.out.println("Cuantas columnas tienes la fila" + i + ":");
			int c = sc.nextInt();
			matrix[i] = new int [c];
			for (int k = 0; k < matrix[i].length;k++) {
				System.out.println("Dame el componente" + i + k + ":");
				matrix[i][k] = sc.nextInt();
			}
			
		}
	}
	
	public void imprimir() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		IrregularMatrix matriz = new IrregularMatrix();
		matriz.cargar();
		matriz.imprimir();
	}

}
