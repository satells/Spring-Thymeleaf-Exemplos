package com.exemplos.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.exemplos.model.Exemplo;

@Controller
public class HomeController {

	@GetMapping({ "", "/" })
	public String home(ModelMap model) {

		List<Exemplo> exemplos = new ArrayList<Exemplo>();

		exemplos.add(new Exemplo("Passando parâmetros objeto", "/atributo/enviandoObjeto"));
		exemplos.add(new Exemplo("Enviando parametro texto", "/atributo/enviandoAtributo"));
		exemplos.add(new Exemplo("Enviando parametro conjuntos", "/atributo/enviandoConjuntos"));
		exemplos.add(new Exemplo("Estrutura - Condição", "/estrutura/condicao"));

		model.addAttribute("exemplos", exemplos);

		return "home";
	}
}
