package com.loiane.cursojava35labs;

public class Calculadora {

	public static int somar(int num1, int num2) {

		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	public static int potencia(int num1, int num2) {

		int total = 1;
		for (int i = 1; i <= num2; i++) {
			total *= num1;
		}
		return total;
	}

	// Fatorial
	public static int fatorialNaoRecursivo(int num) {
		if (num == 0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}

	// Fatorial = 5 * fatoril(4)
	// Fatorial = 4 * fatoril(3)
	// Fatorial = 3 * fatoril(2)
	// Fatorial = 2 * fatoril(1)
	// Fatorial = 1 * fatoril(0)
	// Fatorial = 1
	public static int fatorial(int num) {

		if (num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);
	}
}
