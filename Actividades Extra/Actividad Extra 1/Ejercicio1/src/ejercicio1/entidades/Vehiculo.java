package ejercicio1.entidades;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer anio;
    private String tipo;
    private Integer velocidad;
    private Integer metrosRecorridos;
    private Integer metrosFrenado;

    public Vehiculo() {
        metrosRecorridos = 0;
    }

    public Vehiculo(String marca, String modelo, Integer anio, String tipo, Integer velocidad, Integer metrosRecorridos, Integer metrosFrenado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.metrosRecorridos = metrosRecorridos;
        this.metrosFrenado = metrosFrenado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getMetrosRecorridos() {
        return metrosRecorridos;
    }

    public void setMetrosRecorridos(Integer metrosRecorridos) {
        this.metrosRecorridos = metrosRecorridos;
    }

    public Integer getMetrosFrenado() {
        return metrosFrenado;
    }

    public void setMetrosFrenado(Integer metrosFrenado) {
        this.metrosFrenado = metrosFrenado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", tipo='" + tipo + '\'' +
                ", velocidad=" + velocidad +
                ", metrosRecorridos=" + metrosRecorridos +
                ", metrosFrenado=" + metrosFrenado +
                '}';
    }
}
