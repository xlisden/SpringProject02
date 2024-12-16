package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Usuario;
import com.example.demo.service.IUsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	@Autowired
	@Qualifier("usuarioservice")
	private IUsuarioService usuarioService;

	@GetMapping("/list")
	public ModelAndView listAllUsuarios() {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("usuarios", usuarioService.listAllUsuario());
		return mav;
	}
	
	@PostMapping("/addusers")
	public String postMethodName(@ModelAttribute(name = "users") Usuario usuario) {
		usuarioService.addUsuario(usuario);
		return "redirect:/user/list";
	}
	
	
}
