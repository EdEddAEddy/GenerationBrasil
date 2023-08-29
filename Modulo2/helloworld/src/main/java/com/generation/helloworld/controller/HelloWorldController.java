package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
    @GetMapping("/bsm")
    public String bsm() {
        return "Mentalidade de crescimento\r\n"
        		+ "Persistencia\r\n"
        		+ "Responsibilidade Pessoal\r\n"
        		+ "Orientação ao Futuro\r\n"
        		+ "Comunicação\r\n"
        		+ "Orientação ao Detalhe\r\n"
        		+ "Proatividade\r\n"
        		+ "Trabalho em Equipe";
    }
    
    @GetMapping("/objetivos")
    public String objetivos() {
    	return "Aprender Spring, PF";
    }
}
