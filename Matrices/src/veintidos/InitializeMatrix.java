package veintidos;

import java.util.Scanner;

public class InitializeMatrix {
	
	private Scanner sc;
	private int matrix[][];
	
	public InitializeMatrix(int f, int c) {
		matrix = new int[f][c];
		sc = new Scanner(System.in);
	}

	public void cargar() {
		for (int f = 0; f < matrix.length; f++) {       //metrix.length devuelve el numero de filas
			for (int c = 0; c < matrix[f].length; c++) {    //matrix[f].length devuelve el numero elementos la fila f
				System.out.println("Dame los valores: ");
				matrix[f][c] = sc.nextInt();
			}
		}
	}
	
	public void imprimir() {
		for (int f = 0; f < matrix.length; f++) {
			for (int c = 0; c < matrix[f].length; c++) {
				System.out.print(matrix[f][c] + "-");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		InitializeMatrix matriz = new InitializeMatrix(5,3);
		matriz.cargar();
		matriz.imprimir();
	}

	public void imprimeDiagonalPrincipal() {
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 4; c++) {
				if(f == c) {
					System.out.println(matrix[f][c]);
				}
				
			}
		}

	}
	
	public void imprimeDiagonalPrincipal2() {
		for (int k = 0; k < 4; k++) {
			
					System.out.println(matrix[k][k]);
			
		}

	}
}