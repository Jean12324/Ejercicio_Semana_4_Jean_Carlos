/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO_SEMANA._4_Jean.controller;

import com.example.EJERCICIO_SEMANA._4_Jean.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Jeanc
 */
@Controller
public class AlumnoController {
     @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "formulario";
    }

    @PostMapping("/formulario/exito")
    public String procesarFormulario(@ModelAttribute Alumno alumno, Model model) {
        model.addAttribute("alumno", alumno);
        return "exito";
    }
}
