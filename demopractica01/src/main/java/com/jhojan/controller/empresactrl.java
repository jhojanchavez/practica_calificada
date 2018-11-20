package com.jhojan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhojan.model.empresa;
import com.jhojan.service.EmpresaService;

@RestController
@RequestMapping(value="/api/user")
public class empresactrl {
	@Autowired
	EmpresaService empresaService;
	
	@GetMapping("/all")
	protected List<empresa> allempresa() {
		return empresaService.findAllEmpresa();
	}
	@GetMapping("/ifexit")
	protected boolean isExistEmpresa(@RequestBody empresa empresa) {
		return empresaService.isEmpresaExist(empresa);
	}
	
	@PostMapping("/save")//save o insert
	protected void save(@RequestBody empresa empresa) {
		if(empresaService.isEmpresaExist(empresa)) {
			empresaService.updateEmpresa(empresa);
			System.out.println("La empresa ya existe");
		}else {
			empresaService.saveEmpresa(empresa);
			System.out.println("no existe la empresa");
		}
		//return "welcome a spring boot";
	}
	
	@PutMapping("/update")//update
	protected String update() {
		return "welcome a spring boot";
	}
	@PutMapping("/delete")
	protected String delete() {
		return "welcome a spring boot";
	}

}
