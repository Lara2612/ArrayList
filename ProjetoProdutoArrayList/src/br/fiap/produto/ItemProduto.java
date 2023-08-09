package br.fiap.produto;

public class ItemProduto {
	private Produto produto;
	private int quantidade;
	
	public ItemProduto(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ItemProduto [produto=" + produto + ", quantidade=" + quantidade + "]";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}
