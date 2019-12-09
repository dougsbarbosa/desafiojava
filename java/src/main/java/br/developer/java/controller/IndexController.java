package br.developer.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.developer.java.repository.ClientesRepository;
import br.developer.java.repository.ProdutosRepository;
import br.developer.java.repository.VendasRepository;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	VendasRepository repository;
	ClientesRepository clientes;
	ProdutosRepository produtos;
	
	@GetMapping("/")
	public String index() {
		return "/index";
	}

	
}
