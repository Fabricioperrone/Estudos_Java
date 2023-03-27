package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7)");

		int diaSemana = scan.nextInt();
		

		
		  if (diaSemana == 1) { System.out.println("Domingo"); } else if (diaSemana ==
		  2) { System.out.println("Segunda feira");
		  
		  } else if (diaSemana == 3) { System.out.println("Terça feira");
		  
		  } else if (diaSemana == 4) { System.out.println("Quarta feira");
		  
		  } else if (diaSemana == 5) { System.out.println("Quinta feira");
		  
		  } else if (diaSemana == 6) { System.out.println("Sexta feira");
		  
		  } else if (diaSemana == 7) { System.out.println("Sábado");
		  
		  }else { System.out.println("Não é um dia da semnana válido"); }
		 
	}

}
