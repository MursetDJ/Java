
import java.util.*;

public class Mathclass {

    public static void main(String[] args) {
        numPrimo();
    }

    public static void absoluto() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            double num = sc.nextDouble();
            System.out.println("El valor absoluto es: " + Math.abs(num));
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan enteros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
        System.out.println("Programa finalizado");

    }

    public static void randomLimits() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa limite inferior: ");
            double num = sc.nextDouble();
            System.out.println("Ingresa limite superior: ");
            double num2 = sc.nextDouble();
            double numLimit = Math.floor((Math.random() * (num2 - num)) + num);
            System.out.println("El número entre los dos límites es: " + numLimit);
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan enteros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
        System.out.println("Programa finalizado");

    }

    public static void numPrimo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa limite superior: ");
            double num2 = sc.nextDouble();
            double rangen = Math.round((Math.random() * num2));
            String valor = "";
            for (int i = 2; i < rangen; i++) {
                if (rangen % i == 0) {
                    valor = "no es primo ";
                    break;
                } else {
                    valor = "es primo ";
                }
            }
            System.out.println("El número " + rangen + " " + valor
                    + " y su raiz es:  " + Math.sqrt(rangen));
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan enteros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
        System.out.println("Programa finalizado");

    }

    public static void redondeo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero con decimal: ");
            double num = sc.nextDouble();
            System.out.println("El número redondeado es: " + Math.round(num));

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan enteros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
        System.out.println("Programa finalizado");

    }

    public static void numAleatorios() {
        try {
            System.out.println("El numero aleatorio es: " + Math.floor((Math.random() * 355)));
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
    }

    public static void potencia() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la base: ");
            double num = sc.nextDouble();
            System.out.println("Ingresa la potencia: ");
            double p = sc.nextDouble();
            System.out.println("El resultado es: " + Math.pow(num, p));
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
    }

    public static void raiz() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa el número: ");
            double num = sc.nextDouble();
            System.out.println("El resultado es: " + Math.sqrt(num));
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
    }
}
