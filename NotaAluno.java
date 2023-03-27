
public class NotaAluno {

	float nota1, nota2, nota3, media=0;

	public void calculaMedia() {
		media = (nota1+nota2+nota3)/3;
		if(media >6) {
			System.out.println("Aprovado com média " + media);
		}
		if(media >= 4 && media <=6) {
			System.out.println("Verificação Suplementar \n" + media);
		}
		else {
			if(media <=3) {
				System.out.println("Reprovado não alcançou a média \n" + media);
			}
		}
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

}
