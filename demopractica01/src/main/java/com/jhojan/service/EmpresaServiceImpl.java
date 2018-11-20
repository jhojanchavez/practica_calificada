package com.jhojan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jhojan.model.empresa;
import com.jhojan.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	EmpresaRepository empresaRepository;
	
	@Override
	public empresa findById(long id) {
		return empresaRepository.findById(id);
	}

	@Override
	public empresa findByRazon_social(String razon_social) {
		return empresaRepository.findByRazon_social(razon_social);
	}

	@Override
	public void saveEmpresa(empresa empresa) {
		empresaRepository.save(empresa);
	}

	@Override
	public void updateEmpresa(empresa empresa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmpresaById(long id) {
		empresaRepository.deleteById(id);
	}

	@Override
	public List<empresa> findAllEmpresa() {
		return empresaRepository.findAll();
	}

	@Override
	public void deleteAllEmpresa() {
		empresaRepository.deleteAll();
	}

	@Override
	public boolean isEmpresaExist(empresa empresa) {
		// TODO Auto-generated method stub
		return findByRazon_social(empresa.getRazon_social())!=null;
	}
}
