package com.umss.proyecto.Repositorio;

 import com.umss.proyecto.Modelo.Paquete;
 import org.springframework.data.jpa.repository.Query;
 import org.springframework.data.repository.CrudRepository;
 import org.springframework.data.repository.query.Param;

 import java.util.List;

public interface PaqueteRepositorio extends CrudRepository<Paquete,Integer> {
    @Query(value = "select * from paquete where nombre=:nombre",nativeQuery =true)
    Paquete getPaquete(@Param("nombre") String nombre);
    @Query(value = "select * from paquete p where p.id_categoria = :id_categoria",nativeQuery =true)
    List<Paquete> getPaquetes(@Param("id_categoria") Long id_categoria);

}
