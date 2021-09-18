package ExerciciosLista4;

//VETORC = UNIÃO VETOR AB

public class List4Exerc4 {

	public static void main(String[] args) {

		int vetorA[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int vetorB[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int vetorC[] = new int[20];

		for (int i = 0; i < vetorA.length; i++) {

			vetorC[i] = vetorA[i];

		}

		for (int i = 0; i < vetorB.length; i++) {

			vetorC[i + 10] = vetorB[i];
		}

		for (int valores : vetorC) {

			System.out.println(valores);

		}
	}
}
