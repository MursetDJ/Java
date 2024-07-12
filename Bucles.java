
import java.util.Arrays;
import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        reto10();
    }

    public static void reto1() {
        int[] nums = {2, 3, 4};
        int sum = 0;

        for (int elem : nums) {
            System.out.println(elem);
        }
    }

    public static void reto2() {
        try (Scanner sc = new Scanner(System.in)) {

            int[] arreglo = {4, 5, 2, 1, 23, 4};
            Arrays.sort(arreglo);
            System.out.println(arreglo[0]);

        }
    }

    public static void reto3() {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i <= Math.round(arreglo.length / 2); i++) {
            int data1 = arreglo[i];
            int data2 = arreglo[arreglo.length - i - 1];
            System.err.println("data1: " + data1 + " data2: " + data2);
            arreglo[i] = data2;
            arreglo[arreglo.length - i - 1] = data1;
        }
        System.out.println(Arrays.toString(arreglo));
    }

    public static void reto4() {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i <= Math.round(arreglo.length / 2); i++) {
            int data1 = arreglo[i];
            int data2 = arreglo[arreglo.length - i - 1];
            System.err.println("data1: " + data1 + " data2: " + data2);
            arreglo[i] = data2;
            arreglo[arreglo.length - i - 1] = data1;
        }
        System.out.println(Arrays.toString(arreglo));
    }

    public static void reto5() {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + (i - 1 == -1 ? 0 : arreglo[i - 1]);
        }
        System.out.println(Arrays.toString(arreglo));
    }

    public static void reto6() {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + (i - 1 == -1 ? 0 : arreglo[i - 1]);
        }
        System.out.println(Arrays.toString(arreglo));
    }

    public static void reto7() {
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) Math.round(Math.random() * 100) - 1;
        }
        int cant = 0;
        System.out.println(Arrays.toString(arreglo));
        for (int elem : arreglo) {
            System.err.print(elem % 2 == 0 ? elem + " " : "");
            if (elem % 2 == 0) {
                cant++;
            }
        }
        System.out.println("La cantidad de pares es: " + cant);
    }

    public static void reto8() {
        float[] arreglo = new float[20];
        float suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (float) Math.random() * 100 - 1;
        }
        for (float num : arreglo) {
            suma = suma + num;
        }
        System.out.println(Arrays.toString(arreglo));
        System.out.println("La suma total es: " + suma);
        System.out.println("Promedio de los números es: " + suma / arreglo.length);
    }

    public static void reto9() {
        String[] arreglo = {"Hola", "mi nombre", "es", "Dennis"};
        String concatenar = "";
        for (int i = 0; i < arreglo.length; i++) {
            concatenar = concatenar + arreglo[i] + " ";
        }
        System.out.println(concatenar);
    }

    public static void reto10() {
        char[] arreglo = {'H', 'o', 'l', 'a', ' ', 'm', 'i', ' ', 'n', 'o', 'm', 'b', 'r', 'e', ' ', 'e', 's', ' ', 'D', 'e', 'n', 'n', 'i', 's'};
        String concatenar = "";
        for (char elem : arreglo) {
            concatenar = concatenar + elem;
        }
        System.out.println(concatenar);
        System.out.println("Que letra quieres buscar?: ");
        Scanner sc = new Scanner(System.in);
        char buscar = sc.nextLine().charAt(0);
        int cantida = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == buscar) {
                cantida++;
            }
        }
        System.out.println(cantida == 0 ? "No se encontro la letra" : "La letra se encuentra " + cantida + " veces");
    }

}
