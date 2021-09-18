package ExerciciosLista4;

//MATRIZ A IMPRIMIR SOMA
public class List4Exerc12 {
	public static void main(String[] args) {

		int matrizA[][] =  { { 1, 2, 3, 4, 5},
	                         { 6, 7, 8, 9, 10}, 
	                         { 7, 6, 5, 4, 5},
	                         { 1, 3, 2, 4, 5},
	                         { 1, 2, 3, 4, 5} };
		int somaLinha=0;
		
		for(int linha=0; linha<matrizA.length;linha++) {
			for(int coluna=0; coluna<matrizA.length;coluna++) {
				
				somaLinha += matrizA[linha][coluna];}
		}	
				System.out.println("A soma dos elementos da matriz é: " + somaLinha);
			
		}
	}
