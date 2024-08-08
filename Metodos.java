
import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        imprimirTablaMultiplicar(pedirnumero());
        imprimirTablaNumeros(pedirnumeros());
    }

    public static int pedirnumero() {
        boolean correcto = false;
        int num = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa un numero: ");
                num = sc.nextInt();
                correcto = true;
            } catch (Exception e) {
                System.out.println("Solo se aceptan enteros");

            }
        } while (correcto != true);
        return num;
    }

    public static void imprimirTablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static int[] pedirnumeros() {
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = pedirnumero();
        }
        return num;
    }

    public static void imprimirTablaNumeros(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(num[i] + " * " + j + " = " + (num[i] * j));
            }
            System.out.println("------------------------");
        }
    }
}
