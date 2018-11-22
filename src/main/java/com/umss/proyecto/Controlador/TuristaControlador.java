package com.umss.proyecto.Controlador;

import com.umss.proyecto.Modelo.Turista;
import com.umss.proyecto.Repositorio.TuristaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//solicitar desde angular
//crossorigin 
@RestController
@RequestMapping(path="/turista")
public class TuristaControlador {
    @Autowired
    private TuristaRepositorio turistaRepositorio;

    @GetMapping(path="/get")
    public Iterable<Turista> getTurista(){

        return turistaRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Turista ingresar(@RequestBody Turista turista){
        return turistaRepositorio.save(turista);
    }

}
