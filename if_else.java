package Projetos_LPA.aula5;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);

		System.out.println("digite um numero");
		numero = ler.nextInt();

		if (numero > 10)
			System.out.println("o numero é maior que 10");
		ler.close();

	}

}
