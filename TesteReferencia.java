
public class TesteReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Sub-Zero");
		g1.setSalario(5000.0);
		
		EditorVideo evi = new EditorVideo();
		evi.setSalario(2500.0);
		
		Designer d =new Designer();
		d.setSalario(2000.0);
		
		
		
		//String nome = g1.getNome();
		
		//System.out.println(nome);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(d);
		controle.registra(evi);
		
		System.out.println(controle.getSoma());
				
	}
}
