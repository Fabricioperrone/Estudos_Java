
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();

		nico.setNome("Fabricio Perrone");
		nico.setCpf("83169989049");
		nico.setSalario(2500.00);

		System.out.println(nico.getCpf());
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
	}
}
