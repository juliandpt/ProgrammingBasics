import java.util.Scanner;

public class ExamenAñoPasado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la variable x: ");
		double x = sc.nextDouble();
		System.out.println("Dame la variable y: ");
		double y = sc.nextDouble();
		
		System.out.println(calcular(x, y));
	}
	
	public static double calcular(double x, double y) {
		return (1.0/2.0*(x*y) + x*x + y*y);
		
	}

}
