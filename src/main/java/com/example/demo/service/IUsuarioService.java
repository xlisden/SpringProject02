package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface IUsuarioService {
	
	public abstract Usuario addUsuario(Usuario usuario);
	public abstract List<Usuario> findAllUsuarioByUsername(String username);
	public abstract List<Usuario> listAllUsuario();

}
