package ExerciciosLista4;

//100 NUMEROS PARES

public class List4Exerc1 {

	public static void main(String[] args) {

		int pares[] = new int[100];
		int numero = 0;

		for (int i = 0; i < pares.length; i++) {
			pares[i] = numero;
			numero += 2;
		}
		for (int i : pares) {

			System.out.println(i);
		}
	}
}
