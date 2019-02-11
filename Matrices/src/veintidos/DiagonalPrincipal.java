package veintidos;

public class DiagonalPrincipal {
	
	

	public static void main(String[] args) {
		InitializeMatrix matriz = new InitializeMatrix(4, 4);
		matriz.cargar();
		matriz.imprimeDiagonalPrincipal();
		System.out.println("metodo 2");
		matriz.imprimeDiagonalPrincipal2();
	}

}
