
import java.util.Random;
import javax.swing.*;

public class BubbleSort {
 
	public static void main(String[] args) {
		
		int i;
        long inicio;
        long fim;
        //double tempo;
        int[] vetor = new int[100];
        int intervaloInicial = 0;
        int intervaloFinal = 100;
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = getRandomNumberRange(intervaloInicial, intervaloFinal);
            System.out.println(vetor[i]);
        }
        //BubbleSort
        System.out.println("--Bubblesort--");
        inicio = System.currentTimeMillis();
        bubbleSort(vetor);
        fim = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (fim - inicio) / 1000d);
    }

    private static int getRandomNumberRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }

    public static void bubbleSort(int[] a){
        if(a == null){
            throw new NullPointerException("The array doesn't exist.");
        }
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
