package application;

import java.text.BreakIterator;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Estudante aluno = null;
	int opcao = 7;
	while(opcao!=0 )
	{
		System.out.println("1. Criar um Estudante.");
		System.out.println("2. Calcular Média.");
		System.out.println("3. Obter número de matricula.");
		System.out.println("4. Obter Endereço.");
		System.out.println("0. Encerrar.");

		opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			sc.nextLine();
			System.out.print("Digite o nome do estudante: ");
			String nome = sc.nextLine();
			System.out.print("Digite o numero da matrícula: ");
			int matricula = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite o endereço: ");
			String rua = sc.nextLine();
			double nota[] = new double[4];
			for (int i = 0; i < 4; i++) {
				System.out.printf("Digite a %dª nota: ", i+1);
				nota[i] = sc.nextDouble();
			}
			aluno = new Estudante(nome,matricula,rua,nota);	
			break;
		case 2:
			if(aluno != null) {
			System.out.println("Média do aluno: " + aluno.media());
			}
			break;
		case 3:
			System.out.println("Matrícula do aluno: "+aluno.matricula);
			break;
		case 4:
			System.out.println("Endereço do aluno: "+aluno.endereco);
			break;

		case 0:
			break;
		default:
			System.out.println("Opção inválida, tente novamente");
				
			

		}

	}
}
	}
