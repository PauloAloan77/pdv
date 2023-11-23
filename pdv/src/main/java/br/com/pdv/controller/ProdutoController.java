package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.pdv.repository.ProdutoRepository;

@Controller

public class ProdutoController {
	//criar uma instância do nosso repositorio	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping({"/produtos"})//é o nome que eu  quiser colocar 
	public String home(ModelMap  model){
		
		// o findAll lista todas lojas
		model.addAttribute("produtos", produtoRepository.findAll());			
		return "produtos";//é o nome do arquivo real
	}
}
