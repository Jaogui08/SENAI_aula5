package Projetos_LPA.aula5;

import java.util.Scanner;

public class lengthteste02 {

	public static void main(String[] args) {
		String frase ;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("escreva alguma frase abaixo:");
		frase = ler.nextLine();
		
		int tamanho = frase.length();
		
		System.out.print("o tamanho da frase é de: " + tamanho + " caracteres");
		
		ler.close();
		
	}

}
