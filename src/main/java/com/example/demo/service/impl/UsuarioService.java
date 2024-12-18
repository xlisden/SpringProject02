package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.service.IUsuarioService;

@Service("usuarioservice")
public class UsuarioService implements IUsuarioService{

	@Autowired
	@Qualifier("usuariorepository")
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> listAllUsuario() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAllUsuarioByUsername(String username) {
//		return usuarioRepository.findAllUsuarioByUsername(username);
		return null;
	}

}
