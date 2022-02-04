package com.josegalvez.josegalvezpizzeria.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;
import com.josegalvez.josegalvezpizzeria.entity.Pizzeria;

@Mapper(componentModel = "spring")
public interface PizzeriaResponseMapper {
	
	@Mappings(value = {
			@Mapping(source = "idPizzeria", target = "idPizza"),
			@Mapping(source = "direccion", target = "dir"),
			@Mapping(source = "sede", target = "sed")
	})
	PizzeriaDTO pizzeriaDTO(Pizzeria pizzeria);

	
	List<PizzeriaDTO> listarPizzeriaDTOlist(List<Pizzeria> listar);

}
