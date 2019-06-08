import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame el numero: ");
		int num = sc.nextInt();
		int var = 0;
		
		for (var = 0; var < num; var++) {
			int varAnt = 1;
			int varAnt2 = 0;
			
			if(var > 1) {
				System.out.println(varAnt + varAnt2);
				varAnt += var-1;
				varAnt2 += varAnt-1;
			}else {
				System.out.println(var);
			}
			
		}
	}		
}

