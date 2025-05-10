import java.util.Scanner;

public class atv11 {

	public static void main(String[] args) {
		/*
		 * Questão 05: Escreva um programa que leia o nome de X pessoas. Após ler todos
		 * os nomes, pergunte ao usuário o nome que ele deseja consultar e verifique se
		 * este nome consta na lista. Obs.: O número de pessoas deve ser determinado
		 * pelo usuário.
		 */
		Scanner sc = new Scanner(System.in);
		int quantosNomes, verificador = 0;

		System.out.println("Quantos nomes você deseja inserir? ");
		quantosNomes = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[quantosNomes];
		
		for (int i = 0; i < quantosNomes; i++) {
			System.out.printf("Digite o %do nome: ", i + 1);
			nomes[i] = sc.nextLine();
		}
		System.out.print("Qual nome você deseja consultar se consta na lista: ");
		String nomeConsulta = sc.nextLine();
		for (int i = 0; i < quantosNomes; i++) {
			if (nomes[i].equals(nomeConsulta)) {
				verificador++;
			}
		}
		System.out.println("O nome " + nomeConsulta + ((verificador != 0) ? " está na lista" : " não está na lista"));

	}

}
