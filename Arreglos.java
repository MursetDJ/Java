
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        // int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] arreglo2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // int[][] matriz = {arreglo1, arreglo2};//print me manda ambos arreglos
        // System.out.println(matriz[0].length);
        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         System.out.println("Estamos en la fila " + (i + 1) + " Y en la columna " + (j + 1));
        //     }
        // }

        reto5();
    }

    /*
            | 1 2 3 |
            | 1 2 3 |
            | 1 2 3 |
            
     */
    public static void reto1() {
        int[] nums = {2, 3, 4};
        int sum = 0;

        for (int elem : nums) {
            sum = sum + elem;
        }
        System.out.println(sum);
    }

    public static void reto2() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arreglo = new int[4];
            System.out.println(Arrays.toString(arreglo));
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = sc.nextInt();
            }
            int sum = 0;
            for (int elem : arreglo) {
                sum = sum + elem;
            }
            System.out.println(sum / arreglo.length);

        }

    }

    public static void reto3() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arreglo = new int[5];
            int mayor = 0;
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = sc.nextInt();
            }

            Arrays.sort(arreglo);
            System.out.println(Arrays.toString(arreglo));
            System.out.println(arreglo[arreglo.length - 1]);

        }
    }

    public static void reto4() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arreglo = {1, 2, 3};
            int value = sc.nextInt();
            int v = Arrays.binarySearch(arreglo, value);
            System.out.println(v < 0 ? "No existe" : "Existe");
        }
    }

    public static void reto5() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arreglo = {1, 2, 3};
            int[] v = Arrays.copyOf(arreglo, 5);

            for (int idx = 0; idx < v.length - arreglo.length; idx++) {
                v[idx + arreglo.length] = sc.nextInt();
            }
            System.out.println(Arrays.toString(v));
        }
    }

    public static void reto6() {
        try (Scanner sc = new Scanner(System.in)) {

            int[] arreglo = new int[6];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int) Math.round(Math.random() * 20);
            }
            System.out.println(Arrays.toString(arreglo));
            int result = 0;
            for (int elem : arreglo) {
                if (elem % 2 == 0) {
                    result++;
                }

            }
            System.out.println(result);
        }
    }

    public static void reto7() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arreglo = {1, 2, 3};
            int[] v = Arrays.copyOf(arreglo, 5);

            for (int idx = 0; idx < v.length - arreglo.length; idx++) {
                v[idx + arreglo.length] = sc.nextInt();
            }
            System.out.println(Arrays.toString(v));
        }
    }

    public static void reto8() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arreglo = {1, 2, 3};
            int[] v = Arrays.copyOf(arreglo, 5);

            for (int idx = 0; idx < v.length - arreglo.length; idx++) {
                v[idx + arreglo.length] = sc.nextInt();
            }
            System.out.println(Arrays.toString(v));
        }
    }
}
