package br.developer.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.developer.java.entity.Clientes;
import br.developer.java.entity.Produtos;
import br.developer.java.entity.Vendas;
import br.developer.java.repository.ClientesRepository;
import br.developer.java.repository.ProdutosRepository;
import br.developer.java.repository.VendasRepository;

@Controller
@RequestMapping("/vendas")
public class VendasController {
	
	@Autowired
	private ProdutosRepository produtos;
	
	@Autowired
	private VendasRepository repository;
	
	@Autowired
	private ClientesRepository clientes;
	
	  @GetMapping("/cadastrar")
	  public String cadastrar(@ModelAttribute("venda") Vendas venda) {
		  return "/vendas/cadastro";
	  }
	  
	  @GetMapping("/listar")
	  public String listar(ModelMap model) {
		  model.addAttribute("vendas", repository.findAll());
		  return "/vendas/listar";
	  }
	  
	  @PostMapping("/salvar")
	  public String salvar(@ModelAttribute("venda") Vendas venda, RedirectAttributes attr) {
		  repository.save(venda);
		  attr.addFlashAttribute("success", "Produto adicionado com sucesso");
		  return "redirect:/vendas/cadastrar";
	  }

	  @ModelAttribute("clientes")
	  public List<Clientes> getClientes(){
		 return clientes.findAll();
	  }
	  
	  @ModelAttribute("produtos")
	  public List<Produtos> getProdutos(){
		 return produtos.findAll();
	  }
	  
}
