package com.example.lemus.mimascota;

import java.io.Serializable;

/**
 * Created by lemus on 26-05-17.
 */

public class menuV implements Serializable {

    private String Nombre;
    private String Direccion;
    private int Imagen;
    private String Descripcion;

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }



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



    public menuV(){
    }
    public menuV(String nom,String desc,String dir){
        Nombre=nom;
        Descripcion=desc;
        Direccion=dir;
    }
    public menuV(String nom,String desc,int imag,String dir){
        Nombre=nom;
        Descripcion=desc;
        Imagen=imag;
        Direccion=dir;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}
