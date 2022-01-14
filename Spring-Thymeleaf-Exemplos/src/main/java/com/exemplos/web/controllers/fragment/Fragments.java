package com.exemplos.web.controllers.fragment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemplos.model.Pessoa;

@Controller
@RequestMapping("fragment")
public class Fragments {

	@GetMapping("/replace")
	public String fragmentReplace(ModelMap model) {
		Pessoa pessoa = new Pessoa("Heitor Augusto", "Rua da Consolação", "350 - ap.105");
		model.addAttribute("pessoa", pessoa);

		return "fragment/replace";
	}

	@GetMapping("/insert")
	public String fragmentInsert(ModelMap model) {

		Pessoa pessoa = new Pessoa("Heitor Augusto", "Rua da Consolação", "350 - ap.105");
		model.addAttribute("pessoa", pessoa);

		return "fragment/insert";
	}

	@GetMapping("/include")
	public String fragmentInclude(ModelMap model) {
		Pessoa pessoa = new Pessoa("Heitor Augusto", "Rua da Consolação", "350 - ap.105");
		model.addAttribute("pessoa", pessoa);

		return "fragment/include";
	}
}