package ExerciciosLista4;

//MATRIZ C É O PRODUTO DE A,B

public class List4Exerc16 {
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4, 2, 2 }, { 4, 3, 2, 1, 1, 1 }, { 1, 2, 3, 4, 2, 2 }, { 4, 3, 2, 1, 1, 1 } };
		int b[][] = { { 1, 1, 2, 2 }, { 2, 2, 3, 3 }, { 3, 3, 4, 4 }, { 4, 4, 5, 5 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

		int resultado[][] = produtoMatricial(a, b);

		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {

				System.out.println(resultado[i][j]);

			}
		}
	}

	public static int[][] produtoMatricial(int a[][], int b[][]) {

		int[][] c = new int[a.length][b[0].length];

		for (int linha = 0; linha < c.length; linha++) {

			for (int coluna = 0; coluna < c[linha].length; coluna++) {

				int aux = 0;

				for (int k = 0; k < a.length; k++) {
					aux += a[coluna][k] * b[k][linha];
				}

				c[linha][coluna] = aux;

			}

		}

		return c;
	}

}
