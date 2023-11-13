package com.loiane.cursojava35;

public class Calculadora {

	
		// Fatorial
		public static int fatorialNaoRecursivo(int num) {
			if (num == 0){
				return 1;
			}
			int total = 1;
			for (int i=num; i>1; i--) {
				total *=i;
			}
			return total;
		}
		
		// fatorial(5) = 5 * fatorial(4)
		// fatorial(4) = 4 * fatorial(3)
		// fatorial(3) = 3 * fatorial(2)
		// fatorial(2) = 3 * fatorial(1)
		// fatorial(1) = 3 * fatorial(0)
		// fatorial(0) = 1;
		
		public static int fatorial(int num) {
			
			if(num == 0){
				return 1; // ponto de parada
			}
			return num * fatorial(num-1);
		}
}
