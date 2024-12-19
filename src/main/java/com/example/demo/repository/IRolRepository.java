package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rol;

@Repository("rolrepository")
public interface IRolRepository extends JpaRepository<Rol, Serializable>{
	
//	@Query("SELECT r FROM bdtienda.rol r WHERE r.name LIKE CONCAT(:name, '%')")
//	public List<Rol> findAllRolByName(@Param("name") String name);

}
