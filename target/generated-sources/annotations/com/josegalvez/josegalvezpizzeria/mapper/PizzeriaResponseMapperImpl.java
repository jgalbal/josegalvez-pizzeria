package com.josegalvez.josegalvezpizzeria.mapper;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;
import com.josegalvez.josegalvezpizzeria.entity.Pizzeria;
import com.josegalvez.josegalvezpizzeria.mapper.PizzeriaResponseMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T21:57:21-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class PizzeriaResponseMapperImpl implements PizzeriaResponseMapper {

    @Override
    public PizzeriaDTO pizzeriaDTO(Pizzeria pizzeria) {
        if ( pizzeria == null ) {
            return null;
        }

        PizzeriaDTO pizzeriaDTO = new PizzeriaDTO();

        pizzeriaDTO.setIdPizza( pizzeria.getIdPizzeria() );
        pizzeriaDTO.setDir( pizzeria.getDireccion() );
        pizzeriaDTO.setSed( pizzeria.getSede() );

        return pizzeriaDTO;
    }

    @Override
    public List<PizzeriaDTO> listarPizzeriaDTOlist(List<Pizzeria> listar) {
        if ( listar == null ) {
            return null;
        }

        List<PizzeriaDTO> list = new ArrayList<PizzeriaDTO>( listar.size() );
        for ( Pizzeria pizzeria : listar ) {
            list.add( pizzeriaDTO( pizzeria ) );
        }

        return list;
    }
}
