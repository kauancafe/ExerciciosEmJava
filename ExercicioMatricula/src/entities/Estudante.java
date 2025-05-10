package entities;

public class Estudante {
	public String aluno;
	public int matricula;
	public String endereco;
	public double[] notas = new double[4];
	
	public Estudante(String aluno, int matricula, String endereco, double[] notas) {
		this.aluno = aluno;
		this.matricula = matricula;
		this.endereco = endereco;
		this.notas = notas;
	}
	
	public double media() {
		double media=0;
		for(int i =0; i<4;i++) {
			media += this.notas[i] / 4;
		}
		return media;
	}

	
	
}	
	