import java.util.Random;
import java.util.Arrays;

public class numeros {

	public static void main(String[] args) {
		Random gerador = new Random(10);

		int numeros[] = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (1 + (Math.random() * 10));
		}
		for(int i=0;i<10;i++) {
			System.out.println(numeros[i]);
		}
	}

}
