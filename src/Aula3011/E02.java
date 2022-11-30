//Imprimir todos os multiplos de 3, entre 1 e 100, e após somar os resultados

package Aula3011;

public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {

				System.out.println(i);
			}
			soma = soma + i;
		}
		System.out.println(soma);
	}
}