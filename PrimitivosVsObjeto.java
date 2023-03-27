package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {

		String s = new String("texto"); // objeto String
		s.toUpperCase();
		
		
		// Wrappers são a versão objeto do tipos 
		// primitivos
		int a = 123;   // Primitivo. Só carrega o valor
		System.out.println(a);
	}
}
