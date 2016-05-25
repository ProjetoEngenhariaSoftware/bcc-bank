package br.ufrpe.bcc.bank.conf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println("Acessando a Home!");
		return new ModelAndView("home");
	}

}
