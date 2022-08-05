/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.publicacioneslibrospoo;

/**
 *
 * @authors Yenny Gómez Marco Antonio Salas José Nilo Marcelo Valenzuela
 * Maraboli.
 */
public class Publicaciones {

    private String titulo;
    private int anio;
    private String tipo;
    private boolean prestado;

    public Publicaciones() {
    }

    public Publicaciones(String titulo, int anio, String tipo, boolean prestado) {
        this.titulo = titulo;
        this.anio = anio;
        this.tipo = tipo;
        this.prestado = prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", anio=" + anio + ", tipo=" + tipo + ", prestado=" + prestado;
    }
}
