package ExerciciosLista4;

public class List4Exerc10 {

	public static void main(String[] args) {

		int vetorA[] = { 1, 4, 7, 3, 2, 9, 8, 6, 5, 10 };
		int vetorB[] = new int[vetorA.length];

		int numero;
		boolean isPrimo;

		for (int i = 0; i < vetorA.length; i++) {

			isPrimo = true;
			numero = vetorA[i];
			
			if(numero ==2) {
				
				vetorB[i] = numero;
				continue;
			}

			for (int j = 2; j < numero; j++) {

				if (numero % j == 0)
					isPrimo = false;

				if (isPrimo)
					vetorB[i] = numero;

			}
		}

		for (int i : vetorB) {

			if (i != 0)
				System.out.println(i);
		}
	}
}