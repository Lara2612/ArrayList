package br.fiap.nota;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.fiap.produto.ItemProduto;

public class NotaFiscal {
	private int numero;
	private String cliente;
	private List<ItemProduto> lista;
	
	public NotaFiscal(String cliente) {
		super();
		this.cliente = cliente;
		this.numero = gerarNumero();
		this.lista = new LinkedList<ItemProduto>();
	}
	
	private int gerarNumero() {
		Random gerador = new Random();
		return gerador.nextInt(1000, 9999);
	}
	
	public void inserirItemProduto(ItemProduto item) {
		lista.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for(ItemProduto item : lista) {
			total += item.getQuantidade() * item.getProduto().getPreco();
		}
		return total;		
	}

	public String getCliente() {
		return cliente;
	}	
	
}
