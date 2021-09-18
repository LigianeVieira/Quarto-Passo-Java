package ExerciciosLista4;

//QNTIDADE DE PARES

public class List4Exerc6 {
	public static void main(String[] args) {

		int vetorA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15};
		
		int qntidadePar=0;
		
	for(int i=0; i<vetorA.length; i++)	{
		 if(vetorA[i]%2==0) {
		   qntidadePar++;}
	}
					
	System.out.println("A quantidade de números pares é: "+ qntidadePar);
}
}
