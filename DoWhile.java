
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        reto1();
    }

    public static void reto1() {
        boolean a = false;
        Scanner sc = new Scanner(System.in);
        while (a != true) {
            System.out.println("Escoge una de las opciones");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5 Salir");
            int num = sc.nextInt();
            if (num == 5) {
                break;
            }
        }
    }

}
