package com.bolsadeideas.springboot.app.springbootdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// @Component(value = "miServicioComplejo")
public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando un proceso importante Complejo!!!!";
    }
   
}
