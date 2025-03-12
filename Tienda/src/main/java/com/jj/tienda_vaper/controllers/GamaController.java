package com.jj.tienda_vaper.controllers;


import com.jj.tienda_vaper.modelo.servicios.GamasService;
import com.jj.tienda_vaper.modelo.entidades.Gamas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin") // Asegúrate de que esta anotación no está interfiriendo
public class GamaController {

    @Autowired
    private GamasService gamasService;

    // @GetMapping("/gamas")
    // public String listarGamas(Model model) {
    //     List<Gamas> gamas = gamasService.getAll();
    //     model.addAttribute("gamas", gamas);
    //     return "admin/gamas"; // Asegúrate de que esta plantilla existe
    // }
}
