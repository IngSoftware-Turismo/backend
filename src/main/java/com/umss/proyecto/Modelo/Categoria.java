package com.umss.proyecto.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_categoria;
    private String nombre;
	

    public Categoria(){}
    public Categoria(Long id,String text){
        this.id_categoria = id;
        this.nombre = text;
    }
    public Categoria(String text){
        this.nombre = text;
    }

    public String getText() {
        return nombre;
    }

    public Long getId() {
        return id_categoria;
    }

    public void setNombre(String s){
        nombre =s;
    }
}
