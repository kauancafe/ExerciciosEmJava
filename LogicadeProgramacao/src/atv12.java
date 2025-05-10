import java.util.Scanner;

public class atv12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor1 = new int[5], vetor2 = new int[5];
		int verificador = 0;
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d° elemento que vai compor o vetor 1: ", i + 1);
			vetor1[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d° elemento que vai compor o vetor 2: ", i + 1);
			vetor2[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (vetor1[i] == vetor2[i]) {
				verificador++;
				}
		}
		System.out.println(verificador);
		if (verificador == 5)
			System.out.println("Os vetores são iguais");

		else
			System.out.println("Os vetores não são iguais");

	}

}
