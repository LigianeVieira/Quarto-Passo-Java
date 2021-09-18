package ExerciciosLista4;

//ORDENAÇÃO EM ORDEM CRESCENTE

public class List4Exerc8 {
	public static void main(String[] args) {

		int vetorA[] = {1,4,7,3,2,9,8,6,5,10,20,18,17,15,16,19,11,13,14,21};
		
		for (int i = 0; i < vetorA.length - 1; i++) {
			 
            for (int j = 0; j < vetorA.length - i - 1; j++) {
	 
               if (vetorA[j] > vetorA[j + 1]) {
	 
                int auxiliar = vetorA[j];
                  vetorA[j] = vetorA[j + 1];
	                  vetorA[j + 1] = auxiliar;
	                }
	          }
		}
	for (int i:vetorA) {
		
		System.out.println(i);
}
}
}