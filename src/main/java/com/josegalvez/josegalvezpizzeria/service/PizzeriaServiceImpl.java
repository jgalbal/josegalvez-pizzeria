package com.josegalvez.josegalvezpizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;
import com.josegalvez.josegalvezpizzeria.mapper.PizzeriaRequestMapper;
import com.josegalvez.josegalvezpizzeria.mapper.PizzeriaResponseMapper;
import com.josegalvez.josegalvezpizzeria.repository.PizzeriaRepository;


@Service
public class PizzeriaServiceImpl implements PizzeriaService{
	
	@Autowired
	private PizzeriaRepository repo;
	@Autowired
	private PizzeriaRequestMapper erqm;
	@Autowired
	private PizzeriaResponseMapper erpm;

	@Override
	public List<PizzeriaDTO> listar() {
		// TODO Auto-generated method stub
		return erpm.listarPizzeriaDTOlist(repo.findAll());
	}

	@Override
	public void crear(PizzeriaDTO pizzeria) {
		// TODO Auto-generated method stub
		repo.save(erqm.pizzeriaEntity(pizzeria));
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
