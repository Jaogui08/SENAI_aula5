package Projetos_LPA.aula5;

import java.util.Scanner;

public class atividade_helloworld {

	public static void main(String[] args) {
		String texto;
		String frase = "hello world";
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a frase abaixo:");
		texto = ler.nextLine();
		
		if (texto.equals(frase)) System.out.println("sua frase é igual a que está no sistema!");
		
		int tamanho = texto.length();
		int caracter;
		
		System.out.print("informe qual caractere você gostaria de saber: ");
		caracter = ler.nextInt();
		
		char letra = texto.charAt(caracter);
		
		System.out.println("o tamanho da frase é de " + tamanho + " caracteres");
		
		System.out.println("o caracter selecionado é o: " + letra);	
		
	}

}
