package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.pdv.repository.VendaRepository;

@Controller

     public class VendaController {
	//criar uma instância do nosso repositorio	
	@Autowired
	private VendaRepository vendaRepository;
	
	@GetMapping({"/venda"})//é o nome que eu  quiser colocar 
	public String home(ModelMap  model){
		
		// o findAll lista todas lojas
		model.addAttribute("venda", vendaRepository.findAll());			
		return "venda";//é o nome do arquivo real
	}
}
