import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de elementos para el vector");

        int numeroDeElementos = sc.nextInt();
        int[] arregloA = new int[numeroDeElementos];
        int[] arregloB = new int[numeroDeElementos];
        int valorAgregado = 0;
        int cont = 0;
        System.out.println("Ingresa los elementos para el vector A entre 5 y 50");
        for (int i = 0; i < numeroDeElementos; i++) {
            valorAgregado = sc.nextInt();
            if (valorAgregado >= 5 && valorAgregado <= 50) {
                cont++;
                arregloA[i] = sc.nextInt();
            }
            if (cont == numeroDeElementos)
                break;
        }

        System.out.println("Ingresa los elementos para el vector B entre 5 y 50");

        for (int i = 0; i < numeroDeElementos; i++) {
            valorAgregado = sc.nextInt();
            if (valorAgregado >= 5 && valorAgregado <= 50) {
                cont++;
                arregloA[i] = sc.nextInt();
            }
            if (cont == numeroDeElementos)
                break;
        }

        // int[] arregloA = { 1, 2, 2, 3 };
        // int[] arregloB = { 2, 3, 2, 1 };

        int[] arragloC = Parcial2Ej2.sumaElementoElemento(arregloA, arregloB);
        int producto = Parcial2Ej2.productoEscalar(arregloA, arregloB);
        boolean mismosELementos = Parcial2Ej2.mismosElementosComoMulticonjunto(arregloA, arregloB);

        System.out.println("La suma del vector A y B del valor es: ");
        for (int valorC : arragloC) {
            System.out.println(valorC);
        }
        System.out.println("El producto del Vector A y B es: " + producto);

        System.out.println("Teinen los mismos elementos? " + mismosELementos);
        sc.close();
    }
}
