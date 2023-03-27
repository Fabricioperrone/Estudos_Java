
public class ControleBonificacao {

	private double soma;

	//public double getSoma() {
	//	return soma;
	//}
	

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	public double getSoma() {
		return this.soma;
	}
}
