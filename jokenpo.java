package exercicios;

import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		int jogador, computador;
		final int papel = 0; // declaração constante
		final int pedra = 1;
		final int tesoura = 2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("-------Jokenpo Jogo Pedra Papel Tesoura-------");
		System.out.println("");
		System.out.println("0 papel");
		System.out.println("1 pedra");
		System.out.println("2 tesoura");
		// System.out.println("");
		System.out.println("Digite a opção de sua escolha: ");

		// jogador
		jogador = teclado.nextInt();
		switch (jogador) {
		case papel:
			System.out.println("Jogador escolheu PAPEL ");
			break;
		case pedra:
			System.out.println("Jogador escolheu PEDRA ");
			break;
		case tesoura:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida, selecione uma opção válida.");
			System.exit(0); // FINALIZA  APP
			
		}
	
		
	
			computador = (int) (Math.random() * 2);
			System.out.println("");
			System.out.println("Loading : " + " = "  + " sorteando " + computador);
			System.out.println("");

			teclado.close(); 
	//LOGICA COMPUTADOR
		switch (computador) {
		case pedra:
			System.out.println("Computador escolheu PEDRA ");
			break;
		case papel:
			System.out.println("Computador escolheu PAPEL ");
			break;
			case tesoura:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
//LOGICA SAIDAS
		System.out.println("");
		if (jogador == computador) {
			System.out.println("Houve um empate");
		} else {
			boolean jogadorGanhou =  (jogador == papel && computador == pedra) || (jogador == tesoura && computador == papel)
					|| (jogador == pedra && computador == tesoura);
			if (jogadorGanhou)
					{
				System.out.println("Jogador ganhou, parabéns");
			} else {
				System.out.println("Computador ganhou!!");
			}
		}
	}
}
