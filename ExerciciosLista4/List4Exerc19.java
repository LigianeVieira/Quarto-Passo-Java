package ExerciciosLista4;

//MULTIPLICAR CADA ELEMENTO DE A POR B E ARMAZENAR EM UM VETOR C

public class List4Exerc19 {
public static void main(String[] args) {
		
		int matrizA[][]= {{1,2,3,4,1,2},{4,3,2,1,1,1},{1,2,3,4,2,3},{4,3,2,1,2,3},{3,3,3,3,3,3},{2,2,2,2,2,2}};
		int b=3;
		int matrizC[]=new int[36];
		int contador=0;		
		
		for(int linha =0; linha<matrizA.length;linha++) {
			for(int coluna =0; coluna<matrizA[linha].length;coluna++) {
				
				matrizC [contador]=matrizA[linha][coluna]*b;
				contador++;
			}
			
		}
		for(int i:matrizC) {
		System.out.println(i);
		
		}	
					
}
}

