package com.jj.tienda_vaper.controllers;

import com.jj.tienda_vaper.modelo.servicios.ProductosService;
import com.jj.tienda_vaper.modelo.entidades.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductosController {
    @Autowired
    private ProductosService productosService;

    @GetMapping("/productos")
    public String getProductos(Model modelo) {
        List<Productos> productos = this.productosService.getAll();
        modelo.addAttribute("Lproductos", productos);
        return "/frontend/productos/listar";
    }

    @GetMapping("/productos/{id}")
    public String getProducto(@PathVariable(value = "id", required=false) String id, Model vista) {
        System.out.println("El producto es: " + id);
        Productos producto = this.productosService.getId(id);
        System.out.println(producto);

        vista.addAttribute("Vproducto", producto);
        return "/frontend/productos/detalle";
    }
}
