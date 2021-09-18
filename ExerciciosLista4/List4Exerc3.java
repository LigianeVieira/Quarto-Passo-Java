package ExerciciosLista4;

//FATORIAL VETORB

public interface List4Exerc3 {
	public static void main(String[] args) {

		int fatorial = 1;
		int vetorA[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int vetorB[] = new int[10];
		int numero = 0;

		for (int i = 0; i < vetorA.length; i++) {

			numero = vetorA[i];

			fatorial = 1;

			for (int j = numero; j > 1; j--) {

				fatorial *= j;
			}

			vetorB[i] = fatorial;

			System.out.println(vetorB[i]);
		}

	}
}
