package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;
import com.example.demo.service.IRolService;

@Controller
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	@Qualifier("rolservice")
	private IRolService rolService;
	private boolean isEdit = false;
	
	@GetMapping({"/", ""})
	public String redirect() {
		return "redirect:/rol/list";
	}	
	
	@GetMapping("/list")
	public String listAllRoles(Model model) {
		isEdit = false;
		model.addAttribute("isEdit", isEdit);
		model.addAttribute("rols", rolService.listAllRol());
		model.addAttribute("rol", new Rol());
		return "listRols";
	}
	
	@PostMapping("/addrols")
	public String addRols(@ModelAttribute Rol rol, Model model) {
		isEdit = false;
		model.addAttribute("isEdit", isEdit);
		rolService.addRol(rol);
		return "redirect:/rol/list";
	}

	@GetMapping("/delete")
	public String deleteRol(@RequestParam int id, Model model) {
		isEdit = false;
		model.addAttribute("isEdit", isEdit);
		rolService.deleteRol(id);
		return "redirect:/rol/list";
	}

	@GetMapping("/getrol")
	public String getRol(@RequestParam int id, Model model) {
		isEdit = true;
		model.addAttribute("isEdit", isEdit);
		model.addAttribute("rol", rolService.getRol(id));
		model.addAttribute("rols", rolService.listAllRol());
		return "listRols";
	}
	
	@PostMapping("/editrol")
	public String editRol(@ModelAttribute(name = "rol") Rol rol, Model model) {
		isEdit = false;
		model.addAttribute("isEdit", isEdit);
		rolService.editRol(rol);
		return "redirect:/rol/list";
	}
	
}
