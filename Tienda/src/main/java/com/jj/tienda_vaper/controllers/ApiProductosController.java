package com.jj.tienda_vaper.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jj.tienda_vaper.modelo.servicios.ProductosService;
import com.jj.tienda_vaper.modelo.entidades.Productos;

@RestController
@RequestMapping("/api/productos") // Ruta para acceder a la API
public class ApiProductosController {
    @Autowired
    private ProductosService productosService;

    public  List<Productos> getProductos() {
       
        List<Productos> productos = this.productosService.getAll(); //4
        return productos;
    }
}
