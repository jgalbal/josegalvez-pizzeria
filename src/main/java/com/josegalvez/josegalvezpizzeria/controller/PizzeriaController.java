package com.josegalvez.josegalvezpizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;
import com.josegalvez.josegalvezpizzeria.service.PizzeriaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(tags = "Pizzeria API")
@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {
	
	@Autowired
	private PizzeriaService service;
	
	@ApiOperation(value = "Listar pizzerias", notes = "Listar pizzerias")
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "No existe"),
			@ApiResponse(code = 201, message = "creado")
	})
	@GetMapping("/listar")
	public @ResponseBody List<PizzeriaDTO> listarPizzeria(){
		return service.listar();
	}
	
	@ApiOperation(value = "Crear pizzerias", notes = "Crear pizzerias")
	@PostMapping("/crear")
	public void crearPizzeria(@RequestBody PizzeriaDTO dto) {
		service.crear(dto);
	}
	
	@ApiOperation(value = "Eliminar pizzerias", notes = "Eliminar pizzerias")
	@DeleteMapping("/eliminar/{id}")
	public void eliminarPizzeria(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
