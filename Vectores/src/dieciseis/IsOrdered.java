package dieciseis;

import java.util.Scanner;

public class IsOrdered {
	private Scanner teclado;
	private int[] vector;
	
	public IsOrdered() {
		teclado = new Scanner(System.in);
		vector = new int [10];
	}
	
	public void initVector() {
		for(int i=0;i<10;i++) {
			System.out.println("Introdice el "+i+"st componente");
			vector[i]=teclado.nextInt();
		}
	}
	/**
	 * 
	 * @return True if the vector attribute is ordered False otherwise
	 */
	private boolean isOrdered() {
		int i = 0;
		while(i<10) {
			if(vector[i]<vector[i+1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] ar) {
		IsOrdered iO = new IsOrdered();
		iO.initVector();
		if (iO.isOrdered()) {
			System.out.println("Ordered vector");
		}
		else {
			System.out.println("Unordered vector");
		}
	}



}
