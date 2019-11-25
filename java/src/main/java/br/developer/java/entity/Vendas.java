package br.developer.java.entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Vendas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToMany
	private List<Produtos> produtos; 
	@ManyToMany
	private Set<Clientes> clientes;   
	private int quantidade;  
	private double total;
	
	public List<Produtos> getProduto() {
		return produtos;
	}
	public void setProduto(List<Produtos> produtos) {
		this.produtos = produtos;
	}
	public Set<Clientes> getCliente() {
		return clientes;
	}
	public void setCliente(Set<Clientes> clientes) {
		this.clientes = clientes;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = quantidade * ((Produtos) produtos).getValor();
	} 
	
	
	

}
