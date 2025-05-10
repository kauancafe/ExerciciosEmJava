package application;

import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Products produto = new Products();

		System.out.println("Digite os dados do produto:");

		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		System.out.println();

		System.out.println("Dados do produto: " + produto);
		System.out.println();

		System.out.print("Digite a quantidade de produtos que você deseja adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println();

		System.out.println("Dados atualizados: " + produto);
		System.out.println();

		System.out.print("Digite a quantidade de produtos que você deseja remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println();

		System.out.println("Dados atualizados: " + produto);
		System.out.println();
	}

}
