package domain;

public class Ficus extends Planta{

    protected String origen;
    protected double tamaño;

    public Ficus(String nombre, int mesesEdad, TipoPlanta tipo, String origen, double tamaño){

        super(nombre,mesesEdad,tipo);
        this.origen = origen;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Ficus{" +
                "origen='" + origen + '\'' +
                ", tamaño=" + tamaño +
                ", nombre='" + nombre + '\'' +
                ", mesesEdad=" + mesesEdad +
                ", estado='" + estado + '\'' +
                ", tipo=" + tipo +
                '}';
    }


}
