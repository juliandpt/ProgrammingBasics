import java.util.Scanner;

public class AñoPasado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame la primera frase: ");
		String frase1 = sc.nextLine();
		
		System.out.println("Dame la segunda frase: ");
		String frase2 = sc.nextLine();
		
		int tope = 0;
		int dif = 0;
		
		if (frase1.length() > frase2.length()) {
			tope = frase2.length();
			
			dif = frase1.length() - tope;
		}else{
			tope = frase1.length();
			
			dif = frase2.length() - tope;
		}
		
		for (int i = 0; i < tope; i++) {
			
			if (frase1.charAt(i) != frase2.charAt(i) ) {
				dif++;
			}
		}
		
		System.out.println(dif);
	}

}
