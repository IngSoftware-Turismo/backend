package com.umss.proyecto.Controlador;

import com.umss.proyecto.Modelo.Paquete;
import com.umss.proyecto.Repositorio.PaqueteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path ="/paquete")

public class PaqueteControlador {
    @Autowired
    private PaqueteRepositorio paqueteRepositorio;
    //@RequestMapping(method = GET,path = "/get")
    @GetMapping(path = "/get")
    public Iterable<Paquete> getPaquetes(){
        return paqueteRepositorio.findAll();
    }

    @RequestMapping(path = "/post", method = POST)
    public Paquete ingresar(@RequestBody Paquete paquete){
        return paqueteRepositorio.save(paquete);

    }
    @RequestMapping(path = "/getPaquete", method = GET)
    public Paquete getPaquete(@RequestParam(value = "nombre") String nombre){
        return paqueteRepositorio.getPaquete(nombre);

    }

}
