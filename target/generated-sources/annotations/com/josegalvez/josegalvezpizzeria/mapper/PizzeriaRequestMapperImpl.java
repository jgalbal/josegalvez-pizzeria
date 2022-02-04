package com.josegalvez.josegalvezpizzeria.mapper;

import com.josegalvez.josegalvezpizzeria.dto.PizzeriaDTO;
import com.josegalvez.josegalvezpizzeria.entity.Pizzeria;
import com.josegalvez.josegalvezpizzeria.mapper.PizzeriaRequestMapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T21:57:56-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class PizzeriaRequestMapperImpl implements PizzeriaRequestMapper {

    @Override
    public Pizzeria pizzeriaEntity(PizzeriaDTO pizzeria) {
        if ( pizzeria == null ) {
            return null;
        }

        Pizzeria pizzeria1 = new Pizzeria();

        pizzeria1.setIdPizzeria( pizzeria.getIdPizza() );
        pizzeria1.setDireccion( pizzeria.getDir() );
        pizzeria1.setSede( pizzeria.getSed() );

        return pizzeria1;
    }
}
