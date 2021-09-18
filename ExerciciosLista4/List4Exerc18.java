package ExerciciosLista4;

//SOMA LINHAS PARES

public class List4Exerc18 {
public static void main(String[] args) {
		
		int matrizA[][]= {{1,2,3,4,5,6,7,8,9},
		                  {9,8,7,6,5,4,3,2,1},
		                  {1,1,1,1,1,1,1,1,1},
		                  {9,8,7,6,5,4,3,2,1},
		                  {2,2,2,2,2,2,2,2,2},
		                  {9,8,7,6,5,4,3,2,1},
		                  {3,3,3,3,3,3,3,3,3},
		                  {9,8,7,6,5,4,3,2,1},
		                  {1,1,1,1,1,1,1,1,1}};
		int soma=0;
		for(int linha=0;linha<=matrizA.length;linha+=2) {
			for(int coluna=0; coluna<=matrizA[linha].length;coluna+=2) {
				soma+=matrizA[linha][coluna];
			}
		}
		System.out.println(soma);
		}
}