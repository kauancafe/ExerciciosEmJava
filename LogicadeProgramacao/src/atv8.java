import java.util.Scanner;

public class atv8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, menor = 0, maior = 0;
		double media = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %do número de 10: ", i + 1);
			numero = sc.nextInt();
			if(i==0){
				menor=numero;
			}
			else if (numero < menor) {
				menor = numero;
			} else if (numero > maior) {
				maior = numero;
			}
			media += (double) numero / 10;
		}
		System.out.println("Menor valor digitado: " + menor);
		System.out.println("Maior valor digitado: " + maior);
		System.out.println("Média dos valores digitados: " + media);
	}

}
