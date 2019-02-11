import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame una frase: ");
		String frase = sc.nextLine();
		
		char [] letra = frase.toCharArray();  

		for (int i = 0; i < letra.length; i++) {
			if(letra[i] != ' ') {
				if(i%2 == 0) {
					if(letra[i] == 'a') {
						letra[i] = 'z';
					}else if (letra[i] == 'A') {
						letra[i] = 'Z';
					}else {
						letra[i]=(char)(letra[i]-1);
					}
					
				}else {
					if(letra[i] == 'z') {
						letra[i]='a';
					}else if(letra[i] == 'Z') {
						letra[i] = 'A';				
					}else {
						letra[i] = (char)(letra[i]+1);
					}
				}
			}
		}
		
		System.out.println("Frase cambiada: " + frase.valueOf(letra));
		
	}

}
	
		
		
	



