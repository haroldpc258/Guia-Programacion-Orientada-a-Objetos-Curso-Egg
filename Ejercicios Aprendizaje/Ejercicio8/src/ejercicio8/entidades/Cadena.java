package ejercicio8.entidades;

public class Cadena {

    private int longitud;
    private String frase;

    public Cadena() {
    }

    public Cadena(int longitud, String frase) {
        this.longitud = longitud;
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
