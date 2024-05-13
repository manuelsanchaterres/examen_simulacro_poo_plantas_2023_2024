package domain;

public class Laurel extends Planta{

    protected String colorCorteza;

    public Laurel(String nombre, int mesesEdad, TipoPlanta tipo, String colorCorteza){

        super(nombre,mesesEdad,tipo);
        this.colorCorteza = colorCorteza;
    }

    @Override
    public String toString() {
        return "Laurel{" +
                "colorCorteza='" + colorCorteza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mesesEdad=" + mesesEdad +
                ", estado='" + estado + '\'' +
                ", tipo=" + tipo +
                '}';
    }


}
