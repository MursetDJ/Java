
import java.util.*;

public class Trycatch {

    public static void main(String[] args) {

        cambioint();
    }

    public static void manejoinput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            int num = sc.nextInt();
            System.out.println("Ingrese el numero que restará: ");
            int num2 = sc.nextInt();
            System.out.println(num - num2);
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan enteros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
        System.out.println("Programa finalizado");

    }

    public static void manejodiv() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            int num = sc.nextInt();
            System.out.println("Ingrese el divisor: ");
            int num2 = sc.nextInt();
            System.out.println(num / num2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan enteros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
        System.out.println("Programa finalizado");

    }

    public static void cambioint() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            String num = sc.nextLine();
            int numconv = Integer.parseInt(num);
            System.out.println("El número se ha convertido a entero" + numconv);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
    }
}
