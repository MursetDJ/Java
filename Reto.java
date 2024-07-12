
import java.util.Scanner;

public class Reto {

    public static void main(String[] args) {
        reto2();
    }

    public static void reto1() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el número para saber si es par o impar: ");
            int num = sc.nextInt();
            System.out.println(num % 2 == 0 ? "El número es par" : "El número es impar");
        }
    }

    public static void reto2() {
        boolean flag = true;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Reto 2 Presione S si quiere salir");
                char ext = sc.next().charAt(0);
                if (ext == 'S' || ext == 's') {
                    break;
                }
                System.out.println("Ingrese el primer número: ");
                int num = sc.nextInt();
                System.out.println("Ingrese el segundo número: ");
                int num2 = sc.nextInt();
                System.out.println("Escoja una operación: ");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1 ->
                        System.out.println(num + num2);
                    case 2 ->
                        System.out.println(num - num2);
                    case 3 ->
                        System.out.println(num * num2);
                    case 4 ->
                        System.out.println(num / num2);
                    case 5 ->
                        flag = false;
                }
            } while (flag);
        }

    }
}
