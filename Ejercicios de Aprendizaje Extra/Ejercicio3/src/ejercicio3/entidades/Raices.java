package ejercicio3.entidades;

public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {

        return (Math.pow(b, 2) - 4*a*c);
    }

    public double[] calcularRaices() {

        double[] raices = new double[2];

        raices[0] = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        raices[1] = (-b - Math.sqrt(getDiscriminante()))/(2*a);

        return raices;
    }
}
