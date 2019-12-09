package br.developer.java.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "cpf", nullable = false)
	private String cpf;
	@Column(name = "sexo", nullable = false)
	private String sexo;
	@Column(name = "data_de_nascimento")
	private String dataDeNascimento;
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
public void setSexo(String sexo){
		
		this.sexo = sexo;
	}
	
	public String getSexo() {
	return sexo;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}