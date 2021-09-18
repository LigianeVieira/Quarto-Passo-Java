package ExerciciosLista4;

//SOMA DE CADA LINHA A, ARMAZENA VETORB 
public class List4Exerc20 {
	public static void main(String[] args) {

		int matrizA[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1 } };
		
		int somaLinha = 0;
		int vetorB[] = new int [12];

		for (int linha = 0; linha < matrizA.length; linha++) {
			somaLinha=0;
			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {

				somaLinha += matrizA[linha][coluna];
            
				vetorB[linha]=somaLinha;
			}
		
		
		System.out.println ( vetorB[linha]);
	}
}
}