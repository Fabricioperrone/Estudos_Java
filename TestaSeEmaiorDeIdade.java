
public class TestaSeEmaiorDeIdade {

	public static void main(String[] args) {
		
		Pessoa fabricio = new Pessoa();
		fabricio.setNome("Fabr�cio Perrone");;
		fabricio.setCpf("333.123.567.32");;
		fabricio.setIdade(41);
		
		boolean idadeMenoDe18= fabricio.idade <=17;
		if(idadeMenoDe18) {
			System.out.println("Voce ainda n�o tem idade para dirigir ");
		}
		boolean idadeMaiorDe18 = fabricio.idade >= 18;
		if(idadeMaiorDe18) {
			System.out.println("Voce j� tem mais de 18, j� pode dirigir. ");
		}
		
		System.out.println(fabricio.getNome());
		System.out.println(fabricio.getCpf());
		System.out.println(fabricio.idade);
	}

}
