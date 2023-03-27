package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// Converte a vari�vel a em um valor double (1.0)
		double a = 1; // convers�o impl�cita
		System.out.println(a);

		// Conversao para um valor float

		float b = (float) 1.2345678888; // expl�cita (CAST)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}
