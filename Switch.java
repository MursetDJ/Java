
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        areaspe();
    }

    public static void trabajo() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escoge un día de la semana: ");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miercoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sabado");
            System.out.println("7. Domingo");
            int num = sc.nextInt();
            switch (num) {
                case 1, 2, 3, 4, 5 ->
                    System.out.println("Hoy es un dia laboral");
                case 6, 7 ->
                    System.out.println("Hoy es un fin de semana");
                default ->
                    System.out.println("No existe");
            }
        }
    }

    public static void areaspe() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("De que figura quieres el área, escoge una opción: ");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            int num = sc.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.println("Ingresa el radio");
                    double radio = sc.nextDouble();
                    System.out.println("Que quieres obtener");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    int num2 = sc.nextInt();
                    String valor = num2 == 1 ? "El area es: " : num2 == 2 ? "El perimetro es: " : "No existe";
                    double result = num2 == 1 ? Math.PI * Math.pow(radio, 2) : num2 == 2 ? 2 * Math.PI * radio : 0;
                    System.out.println(num2 != 1 && num2 != 2 ? "No existe" : "El " + valor + " es: " + result);

                }
                case 2 -> {
                    System.out.println("Ingresa el alto");
                    double altura = sc.nextDouble();
                    System.out.println("Ingresa el ancho");
                    double anchura = sc.nextDouble();
                    System.out.println("Que quieres obtener");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    int num2 = sc.nextInt();
                    String valor = num2 == 1 ? "El area es: " : num2 == 2 ? "El perimetro es: " : "No existe";
                    double result = num2 == 1 ? altura * anchura : num2 == 2 ? 2 * (altura + anchura) : 0;
                    System.out.println(num2 != 1 && num2 != 2 ? "No existe" : "El " + valor + " es: " + result);

                }

                default ->
                    System.out.println("No existe");
            };
        }
    }

    public static void figuras() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("De que figura quieres el área, escoge una opción: ");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            int num = sc.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.println("Ingresa el radio");
                    double radio = sc.nextDouble();
                    System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
                }
                case 2 -> {
                    System.out.println("Ingresa el alto");
                    double altura = sc.nextDouble();
                    System.out.println("Ingresa el ancho");
                    double anchura = sc.nextDouble();
                    System.out.println("El area del rectangulo es: " + altura * anchura);
                }

                case 3 -> {
                    System.out.println("Ingresa la altura");
                    double altura = sc.nextDouble();
                    System.out.println("Ingresa la base");
                    double base = sc.nextDouble();
                    System.out.println("El area del triangulo es: " + (base * altura) / 2);
                }

                default ->
                    System.out.println("No existe");
            };
            double result = switch (num) {
                case 1 -> {
                    System.out.println("Ingresa el radio");
                    double radio = sc.nextDouble();
                    yield Math.PI * Math.pow(radio, 2);
                }
                case 2 -> {
                    System.out.println("Ingresa el alto");
                    double altura = sc.nextDouble();
                    System.out.println("Ingresa el ancho");
                    double anchura = sc.nextDouble();
                    yield altura * anchura;
                }

                case 3 -> {
                    System.out.println("Ingresa la altura");
                    double altura = sc.nextDouble();
                    System.out.println("Ingresa la base");
                    double base = sc.nextDouble();
                    yield (base * altura) / 2;
                }

                default ->
                    -1;
            };
            String fig = num == 1 ? "Circulo" : num == 2 ? "Rectangulo" : num == 3 ? "Triangulo" : "No existe";
            System.out.println("El area del" + fig + " es: " + result);
        }

    }

    public static void estados() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escoge una opción: ");
            System.out.println("1. Guardar ");
            System.out.println("2. Cargar ");
            System.out.println("3. Salir ");
            int num = sc.nextInt();

            switch (num) {
                case 1 ->
                    System.out.println("Guardado");
                case 2 ->
                    System.out.println("Cargado");
                case 3 ->
                    System.out.println("Saliendo");

                default ->
                    System.out.println("No existe");
            }
        }
    }

    public static void calificacion() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Coloca calificación numerica del 1 al 5: ");
            int num = sc.nextInt();

            switch (num) {
                case 1 ->
                    System.out.println("Muy deficiente");
                case 2 ->
                    System.out.println("Deficiente");
                case 3 ->
                    System.out.println("Suficiente");
                case 4 ->
                    System.out.println("Notable");
                case 5 ->
                    System.out.println("Sobresaliente");
                default ->
                    System.out.println("No existe");
            }
        }
    }

}
