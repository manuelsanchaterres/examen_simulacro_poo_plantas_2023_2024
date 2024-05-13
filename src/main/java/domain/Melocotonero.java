package domain;

public class Melocotonero extends Frutal{

    private String variedad;
    private boolean tienePlaga;

    public Melocotonero (String nombre, int mesesEdad, TipoPlanta tipo, boolean tieneFruto, String colorHoja, String variedad, boolean tienePlaga) {

        super(nombre, mesesEdad, tipo, tieneFruto, colorHoja);
        this.variedad = variedad;
        this.tienePlaga = tienePlaga;
    }

    @Override
    public String toString() {
        return "Melocotonero{" +
                "variedad='" + variedad + '\'' +
                ", tienePlaga=" + tienePlaga +
                ", tieneFruto=" + tieneFruto +
                ", colorHoja='" + colorHoja + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mesesEdad=" + mesesEdad +
                ", estado='" + estado + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void darFruto() {

        System.out.println("DA FRUTO EL " + this.getClass().getSimpleName().toUpperCase());
    }
}
