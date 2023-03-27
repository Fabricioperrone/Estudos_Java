package idade;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		System.out.println("---Programa maior ou menor de idade em Java--");
		System.out.println();
		int idade;
		idade = recebeIdade();
		idade = validaMaiorIdade(idade);

	}

	private static int validaMaiorIdade(int idade) {
		if (idade > 18) {
			System.out.println("Parabéns vc já pode digirir, " + idade + " Anos de idade ");
		} else {
			System.out.println("Menor de idade, " + idade + " ainda não pode dirigir ");
		}
		return idade;
	}

	private static int recebeIdade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor, insira sua idade: ");
		int idade = scan.nextInt();
		scan.close();
		return idade;

	}

}
