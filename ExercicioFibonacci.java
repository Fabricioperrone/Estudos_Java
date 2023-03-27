package fibonacci;

import java.util.Scanner;

public class ExercicioFibonacci {

	public static void main(String[] args) {

		int i;
		
		
		for (i = 1; i <= 10; i++) { //calcula de i até dez
			System.out.printf("%d", fib(i));
		}
		System.out.println();
	}

	public static int fib(int n) {
		if (n == 1)// se for 1 primeiro termo eh 0
			return (0);

		if (n == 2) //se for 2 primeiro termo eh 1
			return (1);

		int i, F = 0, F1 = 0, F2 = 1;
		for (i = 3; i <= n; i++) {//calculo a partir do 3º termo// quando i for igual a 3, 
			//i menor ou igual n, incrementa mais um
			F = F1 + F2; //soma
			F1 = F2; // f1 recebe f2
			F2 = F; // f2 igual a soma f1+f2
		}
		return (F);
	}

}
