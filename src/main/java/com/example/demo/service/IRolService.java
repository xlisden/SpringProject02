package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Rol;

public interface IRolService {
	
	public abstract List<Rol> listAllRol();
	public abstract Rol addRol(Rol rol);

//	public abstract Usuario addUsuario(Usuario usuario);
//	public abstract List<Usuario> findAllUsuarioByUsername(String username);
//	public abstract List<Usuario> listAllUsuario();
}
