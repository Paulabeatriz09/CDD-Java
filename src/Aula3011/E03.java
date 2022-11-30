package Aula3011;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int x = entrada.nextInt();
		int a = x / 2;
		int b = 3 * x + 1;

		int numero = x % 2 == 0 ? a : b;

		System.out.println(numero);

	}

}