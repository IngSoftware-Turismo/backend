package com.umss.proyecto.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turista {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ci_turista;
    private String nombre;
    private String apellidos;
    private String correo;
    private Long telefono;

    public Turista(){}
    public Turista(Long ci,String text,String text1,String text2,Long tel){
        this.ci_turista = ci;
        this.nombre = text;
        this.apellidos = text1;
        this.correo = text2;
        this.telefono = tel;
    }

    public String getText() {
        return nombre;
    }
    public String getText1() {
        return apellidos;
    }
    public String getText2() {
        return correo;
    }
    public Long getCi() {
        return ci_turista;
    }
    public Long getTel() {
        return telefono;
    }

    public void setNombre(String s){
        nombre =s;
    }
}
