import java.util.Scanner;

public class fibonacciExamen {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el numero de valores a imprimir: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print(calcFib(i));
			System.out.print(",");
		}
	}
	
	public static int calcFib(int n) {
		if (n==0) {               //podria poner un else if
			return 0;
		}
		
		if (n==1) {
			return 1;
		}
		
		return calcFib(n-1) + calcFib(n-2);
	}
}
