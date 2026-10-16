package ejercicio2;

public class Ejercicio2 {

    // Wrapper: valida el texto e inicia la recursión.
    static String invertirString(String texto) {

        if (texto == null) {
            return null;
        }

        return invertir(texto, texto.length() - 1);
    }

    // Invierte el texto de forma recursiva.
    static String invertir(String texto, int indice) {

        // Caso base
        if (indice < 0) {
            return "";
        }

        // Llamada recursiva
        return texto.charAt(indice) + invertir(texto, indice - 1);
    }

    public static void main(String[] args) {

        System.out.println(invertirString("hola"));
        System.out.println(invertirString("Java"));
        System.out.println(invertirString("a"));
        System.out.println(invertirString(""));
        System.out.println(invertirString(null));
    }
}
