
public class Parcial2Ej2 {
    // int[] leerArreglo(int n);

    // int[] sumaElementoElemento(int[] a, int[] b);

    // int productoEscalar(int[] a, int[] b);

    // int rotacionDerechaDeAParaObtenerB(int[] a, int[] b);

    // boolean mismosElementosComoMulticonjunto(int[] a, int[] b);

    public static int[] leerArreglo(int[] arraglo) {
        return arraglo;
    }

    public static int[] sumaElementoElemento(int[] vectorA, int[] vectorB) {
        int length = vectorB.length;
        int[] vectorC = new int[length];
        for (int i = 0; i < length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }

    public static int productoEscalar(int[] vectorA, int[] vectorB) {

        int length = vectorB.length;
        int vectorC = 0;

        for (int i = 0; i < length; i++) {
            vectorC += vectorA[i] * vectorB[i];
        }

        return vectorC;
    }

    public static boolean mismosElementosComoMulticonjunto(int[] vectorA, int[] vectorB) {
        int length = vectorB.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (vectorA[i] == vectorB[i]) {
                count++;
            }
        }
        if (count > 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int rotacionDerechaDeAParaObtenerB(int[] vectorA, int[] vectorB) {
        // Retorna k si b es igual a a rotado k posiciones a la derecha.
        // En caso contrario, retorna -1.
        int posicion = 0;
        int length = vectorB.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (vectorA[i] != vectorB[j]) {
                    posicion = i;
                }
            }
        }
        return posicion;

    }

}
