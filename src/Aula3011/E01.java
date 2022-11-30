package Aula3011;


public class E01 {

	public static void main(String[] args) {
		int soma = 0;

		for (int i = 50; i > 0; i--) {

			if (i % 2 != 0) {
				System.out.println(i);

				soma = soma + i;
			}
		}
		System.out.println(soma);

	}

}