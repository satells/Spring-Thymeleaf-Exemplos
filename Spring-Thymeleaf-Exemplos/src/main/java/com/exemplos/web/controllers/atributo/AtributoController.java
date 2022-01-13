package com.exemplos.web.controllers.atributo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemplos.model.Pessoa;

@Controller
@RequestMapping("atributo")
public class AtributoController {

	@GetMapping("/enviandoAtributo")
	public String enviandoAtributo(ModelMap model) {

		model.addAttribute("nome", "Heitor Augusto");

		return "atributo/atributo";
	}

	@GetMapping("/enviandoObjeto")
	public String enviandoObjeto(ModelMap model) {
		Pessoa pessoa = new Pessoa("Heitor Augusto", "Avenida Paulista", "150");
		model.addAttribute("pessoa", pessoa);

		return "atributo/objeto";

	}

	@GetMapping("/enviandoConjuntos")
	public String enviandoConjuntos(ModelMap model) {
		List<String> pessoas = new ArrayList<String>();
		pessoas.add("Heitor Augusto");
		pessoas.add("BeatrizCristina");

		model.addAttribute("pessoas", pessoas);

		return "atributo/conjuntos";
	}

}
