package com.example.lemus.mimascota;

import java.io.Serializable;

/**
 * Created by lemus on 05-05-17.
 */

public class menu implements Serializable {

    private String Nombre;

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    private String Descripcion;
    private int Imagen;
    public menu(String arrayNombre, String s, int img2, String s1){
    }
    public menu(String nom,String desc){
        Nombre=nom;
        Descripcion=desc;
    }
    public menu(String nom,String desc,int imag){
        Nombre=nom;
        Descripcion=desc;
        Imagen=imag;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}
