package com.umss.proyecto.Repositorio;

import com.umss.proyecto.Modelo.Paquete;
import com.umss.proyecto.Modelo.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservaRepositorio extends CrudRepository<Reserva,Integer> {
    @Query(value = "select * from reserva r where r.id_paquete= :id_paquete",nativeQuery =true)
    List<Reserva> getReservas(@Param("id_paquete") Long id_paquete);
}
