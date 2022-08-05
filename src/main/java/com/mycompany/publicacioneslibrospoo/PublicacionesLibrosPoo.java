/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.publicacioneslibrospoo;

import java.util.ArrayList;

/**
 *
 * @authors Yenny Gómez Marco Antonio Salas José Nilo Marcelo Valenzuela
 * Maraboli.
 */
public class PublicacionesLibrosPoo {

    public static void main(String[] args) {
        ArrayList<Publicaciones> listaPublicaciones = new ArrayList<>();

        Publicaciones p1 = new Publicaciones("Donde van a morir los elefantes", 1995, "libro", false);
        Publicaciones p2 = new Publicaciones("Rolling Stone", 1967, "revista", false);
        Publicaciones p3 = new Publicaciones("¿Los androides sueñan con ovejas eléctricas?", 1968, "libro", true);
        Publicaciones p4 = new Publicaciones("National Geographic", 2018, "revista", true);

        listaPublicaciones.add(p1);
        listaPublicaciones.add(p2);
        listaPublicaciones.add(p3);
        listaPublicaciones.add(p4);

        //prestar un libro
        p1.setPrestado(true);

        //mostrar array
        int i;
        for (i = 0; i < listaPublicaciones.size(); i++) {
            System.out.println(listaPublicaciones.get(i));
        }
        System.out.println("*****************************");

        //mostrar cuantos anteriores a 1990
        int contador = 0;
        int x;
        for (x = 0; x < listaPublicaciones.size(); x++) {
            if (listaPublicaciones.get(x).getAnio() < 1990) {
                contador++;
            }
        }
        System.out.println("hay " + contador + " publicaciones anteriores a 1990");
        System.out.println("*****************************");
        //cuantos estan prestados
        Metodos metodos = new Metodos();
        metodos.cuentaPrestados(listaPublicaciones);

        System.out.println("*****************************");
        //anteriores a..
        metodos.publicacionesAnterioresA(listaPublicaciones);
    }
}
