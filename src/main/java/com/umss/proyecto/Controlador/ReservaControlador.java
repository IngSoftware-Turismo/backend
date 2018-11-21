package com.umss.proyecto.Controlador;

import com.umss.proyecto.Modelo.Reserva;
import com.umss.proyecto.Repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path ="/reserva")

public class ReservaControlador {
  @Autowired
    private ReservaRepositorio reservaRepositorio;
    //@RequestMapping(method = GET,path = "/get")
    @GetMapping(path = "/get")
    public Iterable<Reserva> getReserva(){
      return reservaRepositorio.findAll();
    }

    @RequestMapping(path ="/post", method = POST)
    public Reserva ingresar(@RequestBody Reserva reserva){
      return reservaRepositorio.save(reserva);
    }

}
