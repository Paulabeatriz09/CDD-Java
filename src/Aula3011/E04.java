//Inserir a quantidade de alunos e dizer a media entre eles


package Aula3011;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner quant = new Scanner(System.in);
		System.out.println("Insira a quantidade de alunos: ");
		int x = quant.nextInt();
		double media = 0;
		double soma = 0;

		// double media=(media+nota)/quant;

		for (int i = 1; i <= x; i++) {
			Scanner nota = new Scanner(System.in);
			System.out.println("Insira as notas: ");
			double y = nota.nextDouble();
			soma = soma + y;
			media = soma / x;

		}
		System.out.println(media);

	}

}