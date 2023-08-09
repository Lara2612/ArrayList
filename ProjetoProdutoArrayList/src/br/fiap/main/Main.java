package br.fiap.main;

import br.fiap.nota.NotaFiscal;
import br.fiap.produto.ItemProduto;
import br.fiap.produto.Produto;

public class Main {
	public static void main(String[] args) {
		
		
		// 1a nota fiscal
		NotaFiscal nf1 = new NotaFiscal("Selmini");
		Produto p1 = new Produto("arroz", 20.90);
		Produto p2 = new Produto("feijão", 10.00);
		Produto p3 = new Produto("batata", 3.00);
		nf1.inserirItemProduto(new ItemProduto(p1, 3));
		nf1.inserirItemProduto(new ItemProduto(p2, 5));
		
		// 2a nota fiscal
		NotaFiscal nf2 = new NotaFiscal("Patrícia");
		nf2.inserirItemProduto(new ItemProduto(p1, 10));
		nf2.inserirItemProduto(new ItemProduto(p2, 10));
		nf2.inserirItemProduto(new ItemProduto(p3, 10));

		System.out.println(nf1.getCliente());
		System.out.println(nf1.calcularTotal());
		System.out.println();
		System.out.println(nf2.getCliente());
		System.out.println(nf2.calcularTotal());
		
	}
}
