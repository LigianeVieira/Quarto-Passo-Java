package ExerciciosLista4;

//SOMA DOS ELEMENTOS NA DIAGONAL PRINCIPAL
public class List4Exerc13 {
	public static void main(String[] args) {

		int matrizA[][] =  { { 1, 2, 3, 4, 5},
				             { 6, 7, 8, 9, 10 }, 
				             { 11, 12, 13, 14,15},
				             { 1, 3, 2, 4, 5},
				             { 1, 2, 3, 4, 5} };

		int diagonal = 0;
		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA.length; coluna++) {
				if (linha == coluna) {
					diagonal += matrizA[linha][coluna];
				}
			}
		}
			System.out.println("A soma da diagonal principal é: " + diagonal);
		}
	}
