package com.jj.tienda_vaper.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jj.tienda_vaper.modelo.servicios.GamasService;
import com.jj.tienda_vaper.modelo.entidades.Gamas;

@RestController
@RequestMapping("/api/gamas") // Ruta para acceder a la API
public class ApiGamasController {
    @Autowired
    private GamasService gamasService;


    public  List<Gamas> getGamas() {
       
        List<Gamas> gamas = this.gamasService.getAll(); //4
        return gamas;
    }
}