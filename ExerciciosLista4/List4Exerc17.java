package ExerciciosLista4;


//MATRIZ C= SOMA A,B
public class List4Exerc17 {

	public static void main(String[] args) {

		int matrizA[][] = { { 1, 2, 3, 4 }, { 4, 3, 2, 1 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 } };
		int matrizB[][] = { { 1, 1, 2, 2 }, { 2, 2, 3, 3 }, { 3, 3, 4, 4 }, { 4, 4, 5, 5 } };
		int matrizC[][] = new int[4][4];
		int soma = 0;

		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA.length; coluna++) {

				soma = matrizA[linha][coluna] + matrizB[linha][coluna];

				matrizC[linha][coluna] = soma;

				System.out.println(matrizC[linha][coluna]);
			}
		}
	}
}


						
		
	