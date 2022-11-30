//Escrever um codigo que receba uma nota de 5 alunos, guarde cada uma num array notas. Depois calcule a media da turma

package Aula3011;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		double[] array = new double[5];
		Scanner nota = new Scanner(System.in);
		double soma = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Insira a nota: ");
			double x = nota.nextDouble();

			array[i] = x;
		}
		//ESTRUTURA DO FOR IT { FOR( TipodaVariavel NomeNovaVariavel : NomedoArray)}
		for (double n : array) {
			soma = soma + n;

		}
		System.out.println("A média da turma é: "+soma / array.length);
	}

}