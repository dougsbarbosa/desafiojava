package br.developer.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.developer.java.entity.Produtos;
import br.developer.java.repository.ProdutosRepository;

@Controller
@RequestMapping ("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	  @GetMapping("/cadastrar")
	  public String cadastrar(@ModelAttribute("produto") Produtos produto) {
		  return "/produtos/cadastro";
	  }
	  
	  @GetMapping("/listar")
	  public String listar(ModelMap model) {
		  model.addAttribute("produtos", repository.findAll());
		  return "/produtos/listar";
	  }
	  
	  @PostMapping("/salvar")
	  public String salvar(@ModelAttribute("produto") Produtos produto, RedirectAttributes attr) {
		  repository.save(produto);
		  attr.addFlashAttribute("success", "Produto adicionado com sucesso");
		  return "redirect:/produtos/cadastrar";
	  }

}
