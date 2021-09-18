package ExerciciosLista4;

public class List4Exerc15 {

	public static void main(String[] args) {

		int matrizA[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 1, 3, 2, 4, 5 }, { 1, 2, 3, 4, 5 } };
		int menor = Integer.MAX_VALUE;

		for (int linha = 0; linha < matrizA.length; linha++) {

			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {

				if (linha == coluna) {

					if (matrizA[linha][coluna] < menor)
						menor = matrizA[linha][coluna];
				}
			}
		}

		System.out.println(menor);
	}
}