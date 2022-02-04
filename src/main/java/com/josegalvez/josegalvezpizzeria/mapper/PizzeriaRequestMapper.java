package com.josegalvez.josegalvezpizzeria.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;
import com.josegalvez.josegalvezpizzeria.entity.Pizzeria;

@Mapper(componentModel = "spring")
public interface PizzeriaRequestMapper {
	
	@Mappings(value = {
			@Mapping(source = "idPizza", target = "idPizzeria"),
			@Mapping(source = "dir", target = "direccion"),
			@Mapping(source = "sed", target = "sede")
	})
	Pizzeria pizzeriaEntity(PizzeriaDTO pizzeria);

}
