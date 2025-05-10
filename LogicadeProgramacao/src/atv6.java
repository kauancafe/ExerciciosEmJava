import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura;
		double[] imc = new double[5];
		int contadorAbaixoDoPeso=0, contadorPesoIdeal=0, contadorAcimaDoPeso=0;
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o peso da %da pessoa:", i + 1);
			peso = sc.nextDouble();
			System.out.printf("Digite a altura da %da pessoa:", i + 1);
			altura = sc.nextDouble();
			imc[i] = peso / (altura * altura);
		}
		for (int i = 0; i<5;i++) {
			if(imc[i]<18.5) {
				contadorAbaixoDoPeso++;
			}
			else if(imc[i]<25.0){
				contadorPesoIdeal++;
			}
			else {
				contadorAcimaDoPeso++;
			}
		}
		System.out.printf("Pessoas abaixo do peso: %d\nPessoas no peso ideal: %d\nPessoas acima do peso: %d",contadorAbaixoDoPeso,contadorPesoIdeal,contadorAcimaDoPeso);
	}

}
