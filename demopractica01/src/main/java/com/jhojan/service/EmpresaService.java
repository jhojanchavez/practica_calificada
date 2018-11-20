package com.jhojan.service;

import java.util.List;

import com.jhojan.model.empresa;

public interface EmpresaService {
empresa findById(long id);

	empresa findByRazon_social(String razon_social);

	void saveEmpresa(empresa empresa);

	void updateEmpresa(empresa empresa);

	void deleteUserById(long id);

	List<empresa> findAllEmpresa(); 

	void deleteAllEmpresa();

	public boolean isEmpresaExist(empresa empresa);
}
