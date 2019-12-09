package br.developer.java.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name = "vendas")
public class Vendas {
	@Id
	@Column(name = "id")
	@GeneratedValue
	public Long id;
	@ManyToOne 
	private Produtos produtos; 
	private String nome_produto;
	@ManyToOne 
	private Clientes cliente;
	private String nome_cliente;
	@Column(name = "quantidade")
	private int quantidade;  
	@Column(name = "total")
	private double total;
	
	public Produtos getProduto() {
		return produtos;
	}
	public void setProduto(Produtos produtos) {
		this.produtos = produtos;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return total = quantidade * produtos.getValor();
	}

	public String getNome_produto() {
		return nome_produto = produtos.getNome();
	}

	public String getNome_cliente() {
		return nome_cliente = cliente.getNome();
	}

	
	
	
	
	

}
