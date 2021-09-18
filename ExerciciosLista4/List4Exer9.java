package ExerciciosLista4;

//UNIÃO VETORES A,B + VETORC ORDENAÇÃO ORDEM DECRESCENTE

public class List4Exer9 {
	public static void main(String[] args) {

		int vetorA[] = {1,2,3,4,5,6,7,8,9,10};
		int vetorB[] = {11,12,13,14,15,16,17,18,19,20};
		int vetorC[] = new int[20];

		
		for (int i = 0; i < vetorA.length; i++) {

			vetorC[i] = vetorA[i];

		}
		
		for(int i=0; i<vetorB.length; i++) {
			
			vetorC[i+10]=vetorB[i];
		}
			
		for (int i = 0; i < vetorC.length - 1; i++) {
			 
            for (int j = 0; j < vetorC.length - i - 1; j++) {
	 
               if (vetorC[j+1] > vetorC[j]) {
	 
                int auxiliar = vetorC[j+1];
                  vetorC[j+1] = vetorC[j];
	                  vetorC[j] = auxiliar;
	                }
	          }
		}
	for (int i:vetorC) {
		
		System.out.println(i);
		
		}
}
}


