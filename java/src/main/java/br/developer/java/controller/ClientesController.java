package br.developer.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import br.developer.java.entity.Clientes;
import br.developer.java.repository.ClientesRepository;

@Controller
public class ClientesController {
	
	  @Autowired
	  private ClientesRepository cadastrarCliente;
	  
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public List<Clientes> findAll() {
		return cadastrarCliente.findAll();
	}
	

	@RequestMapping(value = "/addcliente", method = RequestMethod.POST)
    public String addCliente(@ModelAttribute Clientes cliente, Model model) {
		model.addAttribute("cliente", cadastrarCliente.save(cliente) );
        return "cadastrodeclientes.html";
    }
}
