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
		exemplos.add(new Exemplo("Links - CSS/Javascript/Image", "/links/cssjavascriptimage"));
		exemplos.add(new Exemplo("Fragment - replace", "/fragment/replace"));
		exemplos.add(new Exemplo("Fragment - insert", "/fragment/insert"));
		exemplos.add(new Exemplo("Fragment - include", "/fragment/include"));

		model.addAttribute("exemplos", exemplos);

		return "home";
	}
}
