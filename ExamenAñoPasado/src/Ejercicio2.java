import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int suma = 0;
		int varMayor = 0;
		
		while(suma <= 100) {
			System.out.println("Dame un numero entero: ");
			int num = sc.nextInt();
			
			if (num < 0){
				System.out.println("No puedes meter un numero negativo");
				num = 0;
			}
			
			if(num > varMayor) {
				varMayor = num;
			}
			
			suma += num;
		}
		
		System.out.println(varMayor);
	}

}
