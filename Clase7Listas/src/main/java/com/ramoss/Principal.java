/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.ramoss;

import com.ramos.PkgListaPunto.ClsLista;

/**
 *
 * @author Usuario
 */
public final class Principal {
    private Principal() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        ClsLista lista = new ClsLista();
        lista.insertarCabezaLista("001", "Stiven", 55);
        lista.insertarCabezaLista("002", "Juan", 25);
        lista.insertarCabezaLista("003", "Pedro", 35);
        lista.insertarCabezaLista("004", "Juan", 2);
        lista.insertarCabezaLista("005", "Pedro", 3);
        // EjColecciones col = new EjColecciones();
        // col.EjListas();
        // col.EjArrayList();
        // col.EjSet();

        // ClsEjemplo ej = new ClsEjemplo();
        // ej.ejemplo1();

        // ClsLista lista = new ClsLista();/// intanciamos y creamos lista vacia
        // ClsAlumno al = new ClsAlumno();
        // al = new ClsAlumno();

        // eliminar
        // Buscar por valor
        // buscar x indice
        // insertar de ultimo

        // lista.insertarCabezaLista(80);
        // lista.insertarCabezaLista(40);
        // lista.insertarCabezaLista(6);
        // lista.insertarCabezaLista(88);
        // lista.insertarCabezaLista(89);
        // lista.insertarCabezaLista(99);
        // lista.visualizar();

        System.out.println("--------Inicio-----------");
        lista.visualizar();

        lista.insertarLista("002", "003 ", "Oswaldo", 59);
        System.out.println("++++++++++++++++++++");
        System.out.println("Insertado 003,002,Oswaldo,59");
        lista.visualizar();

        lista.buscarlista("005");
        System.out.println("********************");
        System.out.println("Buscado (005)");
        lista.visualizar();

        lista.eliminar("001");
        System.out.println("-------------------");
        System.out.println("Eliminado (001)");
        lista.visualizar();

    }
}
