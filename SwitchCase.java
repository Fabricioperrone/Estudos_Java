package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um dia da semana (1-7)");

		int diaSemana = scan.nextInt();

		/*
		 * if (diaSemana == 1) { System.out.println("Domingo"); } else if (diaSemana ==
		 * 2) { System.out.println("Segunda feira");
		 * 
		 * } else if (diaSemana == 3) { System.out.println("Ter�a feira");
		 * 
		 * } else if (diaSemana == 4) { System.out.println("Quarta feira");
		 * 
		 * } else if (diaSemana == 5) { System.out.println("Quinta feira");
		 * 
		 * } else if (diaSemana == 6) { System.out.println("Sexta feira");
		 * 
		 * } else if (diaSemana == 7) { System.out.println("S�bado");
		 * 
		 * }else { System.out.println("N�o � um dia da semnana v�lido"); }
		 */
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
			default: System.out.println("N�o � um dia da semana v�lido");
		}
	}
}
