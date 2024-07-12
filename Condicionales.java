
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        password();
    }

    public static void reto1() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el número para saber si es positivo, negativo o cero: ");
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println("El número es positivo");
            } else if (num < 0) {
                System.out.println("El número es negativo");

            } else {
                System.out.println("El número es cero");
            }
        }
    }

    public static void edades() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();
            if (edad >= 18 && edad <= 64) {
                System.out.println("Eres adulto");
            } else if (edad < 18 && edad >= 0) {
                System.out.println("Eres menor de edad");
            } else if (edad > 64 && edad <= 125) {
                System.out.println("Eres adulto mayor");

            } else {
                System.out.println("Edad incorrecta");
            }

        }

    }

    public static void divisible() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el número para saber si es divisible: ");
            int num = sc.nextInt();
            int cant = 0;
            String valor = "El número es divisible por";
            if (num % 3 == 0) {
                valor = valor + " 3";
                cant++;
            }
            if (num % 5 == 0) {
                valor = valor + (cant == 1 ? " y" : "") + " 5";
            }

            System.out.println(valor);
        }

    }

    public static void password() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la contraseña: ");
            String password = sc.nextLine();
            if (password.equals("password")) {
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
    }

    public static void calDisct() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la contraseña: ");
            int precio = sc.nextInt();
            if (precio >= 100) {
                System.out.println("Precio con descuento " + (precio * 0.9));
            } else {
                System.out.println("Precio de " + precio);
            }
        }
    }

    public static void reto2() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la puntuación (entre 0 y 100): ");
            int num = sc.nextInt();
            if (num > 100 || num < 0) {
                System.out.println("La puntuación debe estar entre 0 y 100");
            } else if (num <= 100 && num >= 90) {
                System.out.println("A");

            } else if (num <= 89 && num >= 80) {
                System.out.println("B");

            } else if (num <= 79 && num >= 70) {
                System.out.println("C");

            } else if (num <= 69 && num >= 60) {
                System.out.println("D");

            } else {
                System.out.println("F");
            }
        }
    }

}
