package entities;

public class Products {
	
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: $ "
			+ String.format("%.2f", valorTotalEstoque());
	}
}
