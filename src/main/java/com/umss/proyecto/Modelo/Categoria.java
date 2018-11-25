package com.umss.proyecto.Modelo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @Column(name="id_categoria")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "categoria")
    private List<Paquete> paquete;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
