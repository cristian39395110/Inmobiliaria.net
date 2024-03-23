package com.miapp.listadeinmueble.model;

public class Inmueble {
    private int foto;
    private  String direccion;
    private Double precio;

    public Inmueble(int foto, String direccion, Double precio) {
        this.foto = foto;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
