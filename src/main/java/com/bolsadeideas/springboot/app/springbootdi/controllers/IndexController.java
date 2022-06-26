package com.bolsadeideas.springboot.app.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.app.springbootdi.models.services.IServicio;

@Controller
public class IndexController {

    // private MiServicio servicio = new MiServicio();

    @Autowired
    @Qualifier(value = "miServicioSimple")
    private IServicio servicio;

    // Cuando Inyectamos con el constructor se puede omitir el @Autowired
    // @Autowired
    // public IndexController(IServicio servicio) {
    //     this.servicio = servicio;
    // }

    @GetMapping(value = {"/index", "/", ""})
    public String index(Model model) {
        model.addAttribute("titulo", "Inyeccion de Dependencias.");
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    // @Autowired
    // public void setServicio(IServicio servicio) {
    //     this.servicio = servicio;
    // }

    
    
}
