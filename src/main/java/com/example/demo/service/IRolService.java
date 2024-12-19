package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;

public interface IRolService {
	
	public abstract List<Rol> listAllRol();
	public abstract Rol addRol(Rol rol);
	public abstract void deleteRol(int id);
	public abstract Rol getRol(int id);
	public abstract Rol editRol(Rol rol);
//	public abstract List<Rol> findAllRolByName(String name);

}
