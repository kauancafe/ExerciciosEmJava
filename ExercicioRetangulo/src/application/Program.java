package application;

import java.util.Scanner;

import utilities.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator retangulo = null;
		int opcao = 99;
		while (opcao != 0) {
			System.out.println("Digite sua opção: ");
			System.out.println("1. Criar um retângulo.");
			System.out.println("2. Calcular área.");
			System.out.println("3. Calcular perímetro.");
			System.out.println("0. Sair.");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite a base do seu retângulo: ");
				double base = sc.nextDouble();
				System.out.print("Digite a altura do seu retângulo: ");
				double altura = sc.nextDouble();
				retangulo = new Calculator(base, altura);
				break;
			case 2:
				System.out.println("A área do seu retângulo é: " + retangulo.area());
				break;
			case 3:
				System.out.println("O perímetro do seu retângulo é: " + retangulo.perimetro());
				break;
			case 0:
				opcao = 0;
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;

			}
		}
	}

}
