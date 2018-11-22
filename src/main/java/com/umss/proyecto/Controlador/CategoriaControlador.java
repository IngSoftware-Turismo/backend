package com.umss.proyecto.Controlador;

import com.umss.proyecto.Modelo.Categoria;
import com.umss.proyecto.Repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//solicitar desde angular
//crossorigin 
@RestController
@RequestMapping(path="/categoria")
public class CategoriaControlador {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @GetMapping(path="/get")
    public Iterable<Categoria> getCategoria(){

        return categoriaRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Categoria ingresar(@RequestBody Categoria categoria){
        return categoriaRepositorio.save(categoria);
    }

}
