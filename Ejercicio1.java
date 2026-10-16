package ejercicio1;

public class Ejercicio1 {

    // Wrapper: valida el arreglo e inicia la recursión.
    static boolean estaOrdenado(int[] arreglo) {

        if (arreglo == null || arreglo.length == 0) {
            return false;
        }

        return verificarOrden(arreglo, 0);
    }

    // Verifica recursivamente si el arreglo está ordenado.
    static boolean verificarOrden(int[] arreglo, int indice) {

        // Caso base
        if (indice >= arreglo.length - 1) {
            return true;
        }

        // Caso de fallo
        if (arreglo[indice] > arreglo[indice + 1]) {
            return false;
        }

        // Llamada recursiva
        return verificarOrden(arreglo, indice + 1);
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 8, 4, 5};
        int[] c = {7};
        int[] d = {2, 2, 3, 3, 5};
        int[] e = {};

        System.out.println(estaOrdenado(a));
        System.out.println(estaOrdenado(b));
        System.out.println(estaOrdenado(c));
        System.out.println(estaOrdenado(d));
        System.out.println(estaOrdenado(e));
        System.out.println(estaOrdenado(null));
    }
}