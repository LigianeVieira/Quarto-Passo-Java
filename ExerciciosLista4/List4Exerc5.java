package ExerciciosLista4;

public class List4Exerc5 {

	public static void main(String[] args) {

		int vetorA[] = { 1, 2, 3, 4, 5,6,7,8,9,10 };
		int vetorB[] = { 2, 4, 5, 14, 15,11,6,9,0,1};
		int vetorC[] = new int[10];
		

		for (int i = 0; i < vetorA.length; i++) {

			for (int j = 0; j < vetorB.length; j++) {

				if (vetorA[i] == vetorB[j]) {

					
			
				vetorC[i]=vetorA[i];
		}
				
			}	
				
				System.out.println(vetorC[i]);
			}
		}
	
	}
