import java.util.Scanner;

public class atv9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas= new double[10];
		int acimaMedia=0;
		double media = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite a %da nota de 10: ", i + 1);
			notas[i] = sc.nextDouble();
			if(notas[i]>7) {
				acimaMedia++;
			}
			media += (double) notas[i]/10;
		}
		System.out.printf("Media das notas informadas: %.2f\n",media);
		System.out.println("Alunos acima da media: "+ acimaMedia);

	}

}
