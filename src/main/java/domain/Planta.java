package domain;

public abstract class Planta {



    protected String nombre;
    protected int mesesEdad;
    protected String estado;
    protected TipoPlanta tipo;
    protected static int contadorPlantas;

    public Planta(String nombre, int mesesEdad, TipoPlanta tipo) {
        this.nombre = nombre;
        this.mesesEdad = mesesEdad;
        this.estado = "Viva";
        this.tipo = tipo;
        /* PARA CADA INSTANCIA DE PLANTA INCREMENTO EN 1 EL NÚMERO DE PLANTAS */
        incrementarContador();
    }
    private void incrementarContador(){

        contadorPlantas++;
    }

    public void cumpleaños() {

        mesesEdad++;
    }

    public void morir() {

        estado = "Muerta";
    }

    public String getNombre() {
        return nombre;
    }

    public TipoPlanta getTipo() {
        return tipo;
    }

    public abstract String toString();
}
