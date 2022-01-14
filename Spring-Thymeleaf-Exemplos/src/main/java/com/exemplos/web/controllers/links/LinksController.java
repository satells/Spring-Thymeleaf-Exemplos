package com.exemplos.web.controllers.links;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("links")
public class LinksController {

	@GetMapping("/cssjavascriptimage")
	public String linkcssjavascript() {

		return "links/cssjavascriptimage";

	}
}
