import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float altura,soma_alturas=0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite a altura da " + (i+1) + "a pessoa:");
			altura = sc.nextFloat();
			soma_alturas += altura;
		}
		System.out.println("A média das alturas é:");
		System.out.println(soma_alturas/5);
	}

}
