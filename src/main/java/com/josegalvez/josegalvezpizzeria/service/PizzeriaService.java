package com.josegalvez.josegalvezpizzeria.service;

import java.util.List;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;

public interface PizzeriaService {
	
	List<PizzeriaDTO> listar();
	void crear(PizzeriaDTO pizzeria);
	void eliminar(Integer id);

}
