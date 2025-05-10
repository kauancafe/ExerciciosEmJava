import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int soma=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %do número de 10: ",i+1);
			numeros[i] = sc.nextInt();
			soma += numeros[i];
		}
		System.out.printf("Soma dos 10 números: %d",soma);

	}

}
