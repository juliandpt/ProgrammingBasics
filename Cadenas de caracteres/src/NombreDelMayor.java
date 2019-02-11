import java.util.*;

public class NombreDelMayor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame el nombre del primero: ");
		String nombre1 = sc.nextLine();
		System.out.println("Dame el nombre del segundo: ");
		String nombre2 = sc.nextLine();
		
		System.out.println("Dame la edad del primero: ");
		int edad1 = sc.nextInt();
		System.out.println("Dame la edad del segundo: ");
		int edad2 = sc.nextInt();
		
		if (edad1 > edad2) {
			System.out.println(nombre1 + "es el mayor");
		}else {
			System.out.println(nombre2 + "es el mayor");
		}
	}

}
