package domain;

public abstract class Frutal extends Planta{

    protected boolean tieneFruto;
    protected String colorHoja;

    public Frutal(String nombre, int mesesEdad, TipoPlanta tipo, boolean tieneFruto, String colorHoja){

        super(nombre,mesesEdad,tipo);
        this.tieneFruto = tieneFruto;
        this.colorHoja = colorHoja;
    }
    // PUEDE SER DISPENSABLE YA QUE SÓLO VAMOS A CREAR OBJETOS DERIVADOS MELOCOTONERO Y ALBARICOQUERO
    @Override
    public String toString() {
        return "Frutal{" +
                "tieneFruto=" + tieneFruto +
                ", colorHoja='" + colorHoja + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mesesEdad=" + mesesEdad +
                ", estado='" + estado + '\'' +
                ", tipo=" + tipo +
                '}';
    }


    protected abstract void darFruto();

}
