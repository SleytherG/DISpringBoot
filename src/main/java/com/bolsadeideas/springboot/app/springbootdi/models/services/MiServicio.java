package com.bolsadeideas.springboot.app.springbootdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary
// @Component(value = "miServicioSimple")
public class MiServicio implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando un proceso importante Simple!!!!";
    }
   
}
