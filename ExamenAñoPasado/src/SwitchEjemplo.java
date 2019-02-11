
public class SwitchEjemplo {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,8};
		
		System.out.println(masImpares(array));
	}

	
	/*private static boolean masImpares(int[] array) {
		int pares = 0;
		
		int impares = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				pares++;
			}else {
				impares++;
			}	
		}
		
		return (impares > pares);
	}
	
*/
	
	private static boolean masImpares(int[] array) {
		int pares = 0;
		
		int impares = 0;
		
		for (int i = 0; i < array.length; i++) {
			boolean esPar = (array[i]%2 == 0) ;
			int aux = Boolean.compare(esPar, false);
			 switch (aux) {
			case 1:
				impares++;
				break;
			case 0:
				pares++;
				break;

			default:
				break;
			}
		}
		
		return (impares > pares);
	}

	
}
