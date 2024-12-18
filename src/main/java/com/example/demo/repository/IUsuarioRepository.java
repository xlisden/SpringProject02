package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario;

@Repository("usuariorepository")
public interface IUsuarioRepository extends JpaRepository<Usuario, Serializable>{
	
//	@Query("SELECT u FROM bdtienda.usuario u WHERE u.username LIKE CONCAT(:username, '%')")
//	public List<Usuario> findAllUsuarioByUsername(@Param("username") String username);

}
