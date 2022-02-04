package com.josegalvez.josegalvezpizzeria.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Modelo DTO Estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzeriaDTO {
	
	@ApiModelProperty(required = true, example = "1",name = "id",value = "ID de Pizzeria")
	private Integer idPizza;
	private String dir;
	private String sed;

}
