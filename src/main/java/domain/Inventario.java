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

        System.out.println(planta);
    }

    public void mostrarTodosDatosPlantas(){

        for (Planta planta : plantas) {

            mostrarDatosPlanta(planta);
        }
    }

    public void insertarPlanta(Planta planta) {

        plantas.add(planta);
    }

    public void eliminarPlanta(Planta planta) {

        plantas.remove(planta);
    }

    public void vaciarInventario() {

        plantas.clear();
    }



}
