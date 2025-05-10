import java.util.Scanner;

public class atv5 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int Num1,Num2;
			String Operador;
			System.out.println("Digite o primeiro número que deseja operar: ");
			Num1 = sc.nextInt();
			System.out.println("Digite o segundo número que deseja operar: ");
			Num2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Qual operador deseja utilizar?");
			Operador = sc.nextLine();
			
			if(Operador.equals("+")) {
				System.out.println("Soma = " + (Num1 + Num2));
		}
			else if(Operador.equals("-")) {
				System.out.println("Subtração = " + (Num1 - Num2));
		}
			else if(Operador.equals("*")) {
				System.out.println("Multiplicação = " + (Num1 * Num2));
		}
			else if(Operador.equals("/")) {
				System.out.println("Divisão = " + (Num1 / Num2));
		}
			else {
				System.out.println("Erro, tente novamente.");
			}
	}
}