package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Rol;
import com.example.demo.service.IRolService;

@Controller
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	@Qualifier("rolservice")
	private IRolService rolService;
	
	@GetMapping({"/list", "/", ""})
	public String listAllRoles(Model model) {
		model.addAttribute("rols", rolService.listAllRol());
		model.addAttribute("rol", new Rol());
		System.out.println(rolService.listAllRol().get(0).getName());
		return "listRols";
	}
	

}
