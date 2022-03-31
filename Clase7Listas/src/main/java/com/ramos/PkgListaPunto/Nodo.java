/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramos.PkgListaPunto;

/**
 *
 * @author Usuario
 */
public class Nodo {
    String carnet;
    Nodo enlace;
    String nombre;
    int promedio;

    // Crear el constructor inicial
    public Nodo(int x) {
        enlace = null;
    }

    // Sobrecarga para crear nodo y enlazar
    public Nodo(String carnt, String name, int prom) {
        carnet = carnt;
        nombre = name;
        promedio = prom;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
