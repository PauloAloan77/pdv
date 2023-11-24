package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.LojaRepository;

@Controller

public class Vendedorcontroller {
	//criar uma instância do nosso repositorio	
	@Autowired
	private LojaRepository lojaRepository;
	
	@GetMapping({"/vendedor"})//é o nome que eu  quiser colocar 
	public String home(ModelMap  model){
		
		// o findAll lista todas lojas
		model.addAttribute("vendedor", lojaRepository.findAll());			
		return "vendedor";//é o nome do arquivo real
	}
}
