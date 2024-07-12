
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // consulta();
        // verificacionEdad();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una opción del menú: ");
        System.out.println("1. Imprimir nombre y edad: ");
        System.out.println("2. Comparar dos números: ");
        System.out.println("3. Comparar cuatro números: ");
        System.out.println("4. Verificación de edad: ");
        System.out.println("5. Area y perimetro: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1 ->
                consulta();
            case 2 ->
                valoresNum();
            case 3 ->
                comparacionCuatro();
            case 4 ->
                verificacionEdad();
            case 5 ->
                areaPerimetro();
            default ->
                throw new AssertionError();
        }
        // String saludo = "Dennis";//
        // char a = '2';//
        // byte b = 27;//255+1 
        // int numero = -4;//-4
        // Date fecha = new Date();//
        // double nume = 4 / 2;//2.0
        // double num = 2.4;
        // long cant = -2147483647;//2**32-1 11111111 11111111 11111111 11111111  = 9223372036854775807 positivo es 
        // float num2 = 4.5f;
        // boolean bandera = true;
        // String mensajeBienvenida = "Bienvenido a Java";
        // byte temperaturaActual = 19;
        // boolean datoLogico = true;

        // //Array [[[[[]]]][[[[[[]]]]]]] [] 01 45 9456668765<-"9456668765" 
        // //BD 
        // System.out.println(mensajeBienvenida + " la temperatura actual es " + temperaturaActual + " y el dato logico es " + datoLogico);
        // System.out.println(mensajeBienvenida + " la temperatura actual es " + temperaturaActual + " y el dato logico es " + datoLogico);
    }

    public static void consulta() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su edad " + nombre + ":");
            int edad = sc.nextInt();
            System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
        }

    }

    public static void valoresNum() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese su segundo número :");
            int num2 = sc.nextInt();
            System.out.println("El número " + num1 + " es mayor al número " + num2 + "? " + (num1 > num2));
            System.out.println("El número " + num1 + " es diferente al número " + num2 + "? " + (num1 != num2));
            System.out.println("El número " + num1 + " es divisible por 2?   " + (num1 % 2 == 0));
            System.out.println("");
        }

    }

    public static void comparacionCuatro() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese su segundo número :");
            int num2 = sc.nextInt();
            System.out.println("Ingrese su tercer número :");
            int num3 = sc.nextInt();
            System.out.println("Ingrese su cuarto número :");
            int num4 = sc.nextInt();
            System.out.println("Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4. " + ((num1 > num2) && (num3 > num4)));//f&&f = f f&&t = f t&&t = t
            System.out.println("Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4. " + ((num1 > num2) || (num3 > num4)));
        }

    }

    public static void verificacionEdad() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su anio de nacimiento: ");
            int year = sc.nextInt();
            int actualYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            System.out.println("Tu edad actual es: " + (actualYear - year));//f&&f = f f&&t = f t&&t = t
            if (actualYear - year >= 18) {
                System.out.println("Eres mayor de edad");

            }

        }
    }

    public static void areaPerimetro() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su base: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese su altura :");
            int num2 = sc.nextInt();
            System.out.println("El area es: " + (num1 * num2));
            System.err.println("El perimetro es: " + (2 * (num1 + num2)));
        }
    }

}
