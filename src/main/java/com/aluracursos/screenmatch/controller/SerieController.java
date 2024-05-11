package com.aluracursos.screenmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {
    @GetMapping("/Series")
    public String MostrarMensaje(){
        return "Este es mi primer mensaje en app web";
    }

}
