package com.umss.proyecto.Repositorio;

import com.umss.proyecto.Modelo.Turista;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TuristaRepositorio extends CrudRepository<Turista,Integer> {
    @Query(value = "select * from turista where ci_turista=:ci",nativeQuery =true)
    Turista getTurista(@Param("ci") Long ci);
}