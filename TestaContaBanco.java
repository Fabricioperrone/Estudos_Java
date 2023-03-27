
public class TestaContaBanco {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela loka";
		
		System.out.println(contaDaMarcela.titular.nome);
	}
	
}
