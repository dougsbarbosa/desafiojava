package br.developer.java.entity;

import javax.persistence.*;

@Entity
public class Produtos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private static double valor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
