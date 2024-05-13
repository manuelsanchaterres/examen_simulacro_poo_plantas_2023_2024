package domain;

public class Albaricoquero extends Frutal{

    private String colorCopa;
    private boolean tieneInjerto;

    public Albaricoquero(String nombre, int mesesEdad, TipoPlanta tipo, boolean tieneFruto, String colorHoja, String colorCopa, boolean tieneInjerto) {

        super(nombre, mesesEdad, tipo, tieneFruto, colorHoja);
        this.colorCopa = colorCopa;
        this.tieneInjerto = tieneInjerto;
    }

    @Override
    public String toString() {
        return "Albaricoquero{" +
                "colorCopa='" + colorCopa + '\'' +
                ", tieneInjerto=" + tieneInjerto +
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
