import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade,somaIdades=0,contador=0;
		
		while(true) {
			System.out.println("Digite uma idade, ou digite 0 para mostrar a média:");
			idade = sc.nextInt();
			if(idade==0) {
				break;
			}
			
			else {
				somaIdades += idade;
				contador ++;
			}
			
		}
		System.out.println("A média das idades é:");
		System.out.println(somaIdades/contador);
	}

}
