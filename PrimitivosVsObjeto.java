package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {

		String s = new String("texto"); // objeto String
		s.toUpperCase();
		
		
		// Wrappers s�o a vers�o objeto do tipos 
		// primitivos
		int a = 123;   // Primitivo. S� carrega o valor
		System.out.println(a);
	}
}
