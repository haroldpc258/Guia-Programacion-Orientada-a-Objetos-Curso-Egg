package entidades;

import java.util.Arrays;

public class Arreglo {

    private Integer dimension;
    private Double[] valores;

    public Arreglo() {
    }

    public Arreglo(Integer dimension) {
        this.dimension = dimension;
        valores = new Double[dimension];
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Double[] getValores() {
        return valores;
    }

    public void setValores(Double[] valores) {
        this.valores = valores;
    }

}
