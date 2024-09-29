package domain;

import java.util.ArrayList;

public class Inventario {

    @Override
    public String toString() {
        return "Inventario{" +
                "plantas=" + plantas +
                '}';
    }

    ArrayList<Planta> plantas = new ArrayList<Planta>();

    public void mostrarListaPlantas(){

        for (Planta planta : plantas) {

            System.out.println("TIPO DE PLANTA: " + planta.getTipo());
            System.out.println("NOMBRE DE PLANTA: " + planta.getNombre());
        }
    }

    public void mostrarDatosPlanta(Planta planta) {

        if (plantaEncontradaInventario(planta)) {

            System.out.println(planta);
        } else {

            System.out.println("LA PLANTA NO SE ENCUENTRA EN EL INVENTARIO!!!");
        }

    }

    public boolean plantaEncontradaInventario (Planta planta) {

        return plantas.contains(planta);
    }

    public void mostrarDatosPlantas(){

        for (Planta planta : plantas) {

            mostrarDatosPlanta(planta);
        }
    }

    public void insertarPlanta(Planta planta) {

        if (plantaEncontradaInventario(planta)) {

            System.out.println( planta.getNombre().toUpperCase() + " YA SE ENCUENTRA EN EL INVENTARIO!!!");
        } else {
            plantas.add(planta);
        }
    }


    public void eliminarPlanta(Planta planta) {

        if (plantaEncontradaInventario(planta)) {

            plantas.remove(planta);
        } else {

            System.out.println( planta.getNombre().toUpperCase() + " NO SE ENCUENTRA EN EL INVENTARIO!!!");
        }

    }

    public void vaciarInventario() {

        plantas.clear();
    }



}
