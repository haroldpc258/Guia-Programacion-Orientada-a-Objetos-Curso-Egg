package servicios;

import entidades.Arreglo;

import java.util.Arrays;

public class ArregloService {

    public Arreglo crearArreglo(Integer dimension) {

       return new Arreglo(dimension);
    }

    public Arreglo inicializarArregloRandom(Arreglo arreglo) {

        Double[] random = new Double[arreglo.getDimension()];

        for (int i = 0; i < random.length; i++) {
            random[i] = Math.random() * 100;
        }

        arreglo.setValores(random);

        return arreglo;
    }

    public Arreglo ordenarArreglo(Arreglo arreglo) {

        Arrays.sort(arreglo.getValores());

        return arreglo;
    }

/*    public Arreglo inicializarArregloB(Arreglo A, Arreglo B) {

        Double[] arregloA = A.getValores();
        Double[] arregloB = Arrays.copyOfRange(arregloA, 0, B.getDimension());

        System.out.println(Arrays.toString(arregloB));
        Arrays.fill(arregloB, (int) (arregloB.length/2), arregloB.length, 0.5);

        B.setValores(arregloB);

        return B;
    }*/

    public Arreglo inicializarArregloB(Arreglo A, Arreglo B) {

        Arrays.fill(B.getValores(), 0.5);

        Double[] arregloA = A.getValores();
        Double[] arregloB = B.getValores();

        for (int i = 0; i < (int) (arregloB.length/2); i++) {
            arregloB[i] = arregloA[i];
        }

        //B.setValores(arregloB);

        return B;
    }

    public void mostrarArreglo(Arreglo arreglo) {

        System.out.println(Arrays.toString(arreglo.getValores()));
    }


}
