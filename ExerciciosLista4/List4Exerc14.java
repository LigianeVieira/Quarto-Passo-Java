package ExerciciosLista4;

//Linha5 é linha4 e Coluna3 é a 2 ou 3?
public class List4Exerc14 {
	public static void main(String[] args) {

		int matrizA[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 1, 5, 4, 3, 2 }, { 1, 3, 2, 4, 5 }, { 1, 2, 3, 4, 5 } };
		int soma = 0;

		for (int linha = 0; linha < matrizA.length; linha++) {

			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {

				if (linha == 4 || coluna == 2)
					soma += matrizA[linha][coluna];
			}
		}

		System.out.println("A soma dos elementos da linha5 e coluna3 é: " + soma);
	}
}