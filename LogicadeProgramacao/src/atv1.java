import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resposta;
		
		System.out.println("Em que ano você nasceu?");
		resposta = sc.nextInt();
		System.out.println(2024-resposta);
	}
}
