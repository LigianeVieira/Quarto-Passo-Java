package ExerciciosLista4;

//SOMA DOS ELEMENTOS

public class List4Exerc7 {

	public static void main(String[] args) {

		int vetorA[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {

			soma += vetorA[i];
		}
System.out.println("A soma dos elementos é: " + soma);
	}
}

