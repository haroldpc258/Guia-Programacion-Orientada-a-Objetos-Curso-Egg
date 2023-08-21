package ejercicio6.entidades;

public class Ahorcado {

    private String[] palabraBuscando;
    private int letrasEncontradas;
    private int numeroIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscando, int letrasEncontradas, int numeroIntentos) {
        this.palabraBuscando = palabraBuscando;
        this.letrasEncontradas = letrasEncontradas;
        this.numeroIntentos = numeroIntentos;
    }

    public String[] getPalabraBuscando() {
        return palabraBuscando;
    }

    public void setPalabraBuscando(String[] palabraBuscando) {
        this.palabraBuscando = palabraBuscando;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }
}

