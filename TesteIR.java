
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		// ifs aqui
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota � de 7,5%");
			System.out.println("Voce pode deduzir ate R$ 142");
		} else if (salario >= 2800 && salario <= 3751.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voce pode deduzir at� R$ 350");
		} else if (salario >= 3751.0 && salario <= 4664.0) {
			System.out.println("A sua aliquota � de 22.5%");
			System.out.println("Voce pode deduzir at� r$ 635");
		}

	}

}
