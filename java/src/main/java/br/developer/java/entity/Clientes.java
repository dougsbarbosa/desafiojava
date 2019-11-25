package br.developer.java.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;
import javax.validation.Valid;


@Entity
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cpf;
	private char sexo;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
	private Date dataDeNascimento;

	public void setNascimento(String dataRecebida) throws ParseException { 
	    this.dataDeNascimento = formato.parse(dataRecebida);
	}
	
	public Date getNascimento() {
		return dataDeNascimento;
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
public void setSexo(char sexo){
		
		this.sexo = sexo;
	}
	
	public String getSexo() {
		if (sexo =='M' || sexo == 'm') {
			return "Masculino";
		}
		else if (sexo == 'f' || sexo == 'F') {
			return "Feminino";
		}
		else {
			return "Outro";
		}
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}