package com.jhojan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhojan.model.empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<empresa, Long>{
empresa findById(long id);

	empresa findByRazon_social(String razon_social)
	
}
