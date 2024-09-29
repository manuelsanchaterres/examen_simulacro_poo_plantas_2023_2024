package main;

import domain.*;

public class Main {

    public static void main(String[] args) {

        simularGestionInventario();
    }

    public static void simularGestionInventario () {

        // CREAMOS INVENTARIO E INSERTAMOS 1 PLANTA DE CADA TIPO Y VARIEDAD
        Inventario inventario = new Inventario();
        Melocotonero melocotonero = new Melocotonero("melocotonero",2, TipoPlanta.Frutal,false,"azul","melocotonerus",false);
        Albaricoquero albaricoquero = new Albaricoquero("albaricoquero",3, TipoPlanta.Frutal,true,"verde","rojo",true);
        Ficus ficus = new Ficus("ficus",12, TipoPlanta.Ficus,"brasil",12.25);
        Laurel laurel = new Laurel("laurel",9, TipoPlanta.Laurel,"marrón");

        System.out.println("INSERTAMOS MELOCOTONERO, ALBARICOQUERO, FICUS Y LAURAL");
        inventario.insertarPlanta(melocotonero);
        inventario.insertarPlanta(albaricoquero);
        inventario.insertarPlanta(albaricoquero);
        inventario.insertarPlanta(ficus);
        inventario.insertarPlanta(laurel);
        System.out.println(inventario);

        System.out.println("MOSTRAMOS LISTA DE PLANTAS (NOMBRE Y TIPO)");
        inventario.mostrarListaPlantas();

        System.out.println("MOSTRAMOS TODOS LOS DATOS DEL ALBARICOQUERO");
        inventario.mostrarDatosPlanta(albaricoquero);

        System.out.println("MOSTRAMOS TODOS LOS DATOS DE TODAS LAS PLANTAS");
        inventario.mostrarDatosPlantas();

        System.out.println("ELIMINAR FICUS DEL INVENTARIO");
        System.out.println(inventario);
        inventario.eliminarPlanta(ficus);
        System.out.println(inventario);

        System.out.println("VACIAR INVENTARIO");
        System.out.println(inventario);
        inventario.vaciarInventario();
        System.out.println(inventario);

        System.out.println(laurel);
        System.out.println("LAUREL CUMPLE AÑOS");
        laurel.cumpleaños();
        System.out.println(laurel);

        System.out.println(albaricoquero);
        System.out.println("ALBARICOQUERO MUERE");
        albaricoquero.morir();
        System.out.println(albaricoquero);

        System.out.println("MELOCOTONERO DA FRUTO");
        melocotonero.darFruto();
        System.out.println(melocotonero);

    }
}
