package ExerciciosLista4;

//10 NUMEROS PRIMOS

public class List4Exerc2 {
	public static void main(String[] args) {

		int primos[] = new int[10];
		int numero = 2;
		int qntidadePrimos = 0;
		boolean isPrimos;

		while (qntidadePrimos < 10) {
			isPrimos = true;

			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					isPrimos = false;

				}
			}
			if (isPrimos) {

				primos[qntidadePrimos] = numero;
				qntidadePrimos++;

			}
			numero++;
		}
		for (int i : primos) {
			System.out.println(i);

		}

	}
}