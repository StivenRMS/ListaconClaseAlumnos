/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramos.PkgListaPunto;

/**
 *
 * @author Usuario
 */
public class ClsLista {

    // Cabeza , head
    public Nodo primero;

    public ClsLista() {
        primero = null;
    }

    // // Funcion para obtener numeros
    // private int leerEntero() {
    // System.out.println("Ingrese valor, -1 para terminar");
    //
    // return Integer.parseInt(new Scanner(System.in).nextLine());
    //
    // }

    // public ClsLista crearLista() {
    // int x;
    // primero = null;
    //
    // do {
    // x = leerEntero();
    // if (x != -1) {
    // primero = new Nodo(x, primero);
    // }
    // } while (x != -1);
    //
    // return this;
    // }

    public ClsLista insertarCabezaLista(String carnet, String nombre, int promedio) {
        Nodo nuevo;
        nuevo = new Nodo(carnet, nombre, promedio);
        nuevo.enlace = primero;/// enlance nuevo nodo al frente de la lista (lo apunta)
        primero = nuevo;/// Mueve primero y apunta al nodo nuevo

        return this; /// retorna la referencia del objeto Lista

    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println(n.carnet + "" + n.nombre + "" + n.promedio);
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));

        }
    }

    // public ClsLista insertarUltimo(Nodo ultimo, int entrada) {
    // ultimo.enlace = new Nodo(entrada);
    // ultimo = ultimo.enlace;
    // return this;
    // }

    public Nodo buscarlista(String destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino.equals(indice.carnet)) {/// (valorBuscar.equals(indice.dato)

                return indice;
            }
        }
        return null;
    }

    // Insertar la lista
    public ClsLista insertarLista(String busqueda, String carnet, String name, int promedio) {
        Nodo nuevo, anterior;
        anterior = buscarlista(busqueda);
        if (anterior != null) {
            nuevo = new Nodo(carnet, name, promedio);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    // //Buscar por posicion
    // public Nodo buscarPosicion(int posicion) {
    // Nodo indice;
    // int i;
    // if (posicion < 0) {
    // return null;
    // }
    //
    // indice = primero;
    // for (i = 1; (i < posicion) && (indice != null); i++) {
    // indice = indice.enlace;
    //
    // }
    //
    // return indice;
    // }

    public void eliminar(String entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        /// inicializar los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
        /// Buscar en el nodo
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.carnet.equals(entrada));
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }

        // enlanzar del nodo anterior con el siaguiente nodo
        if (actual != null) {
            // distingue que ell nodo no sea la cabeza
            if (actual.equals(primero)) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;

            }
            actual = null;/// ya que es una variable local, no es nesario
        }
    }

}
