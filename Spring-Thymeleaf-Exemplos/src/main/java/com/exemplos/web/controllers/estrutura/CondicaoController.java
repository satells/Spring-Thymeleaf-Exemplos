package com.exemplos.web.controllers.estrutura;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemplos.model.Pedido;

@Controller
@RequestMapping("estrutura")
public class CondicaoController {

	@GetMapping("/condicao")
	public String getCondicao(ModelMap model) {
		Random random = new Random();

		Integer integer = random.nextInt();

		System.out.println(integer);

		Pedido pedido = new Pedido(integer);

		model.addAttribute("pedido", pedido);

		return "estrutura/condicao";
	}
}
