import java.util.Scanner;

public class EjercicioFuncion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame el valor i: ");
		double i = sc.nextDouble();
		
		System.out.println(calculoFuncion(i));
	}

	public static double calculoFuncion(double i) {
		
		double acum = 0;
		
		for (int n = 1; n <= i; n++ ) {
			
			acum += 1.0/n;
		}
		
		return acum;
	}
}
