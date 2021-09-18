package ExerciciosLista4;

// MAIOR NÚMERO VETOR

public class List4Exerc11 {
	public static void main(String[] args) {

		int vetorA[] = { 1, 4, 7, 3, 2, 9, 8, 6, 5, 10, 11, 20, 13, 21,33 };
		int maior = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < maior);				;
			maior = vetorA[i];

		}
		System.out.println("O maior número do vetor é: " + maior);
	}
}