package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// Converte a variável a em um valor double (1.0)
		double a = 1; // conversão implícita
		System.out.println(a);

		// Conversao para um valor float

		float b = (float) 1.2345678888; // explícita (CAST)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}
