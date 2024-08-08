
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadIntegradora {

    public static void main(String[] args) {
        trabajo();
    }

    public static void trabajo() {
        try {
            //No funciono como debia    
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        } catch (InputMismatchException e) {
            //Imprimir el error
            System.out.println(e.getMessage());

        }
        try (Scanner sc = new Scanner(System.in)) {
            String oracion = "";
            String[] palabras = new String[0];
            boolean flag = true;
            do {
                System.out.println("Escoge una opción: ");
                System.out.println(oracion.length() == 0 ? "1. Crear oración" : "1. Borrar oración");
                System.out.println("2. Cantidad de caracteres ");
                System.out.println("3. Cantidad de palabras: ");
                System.out.println("4. Mostrar palabras ordenadas alfabeticamente: ");
                System.out.println("5. Ingresar número de palabra: ");
                System.out.println("6. Buscar palabra: ");
                System.out.println("7. Modificar palabra: ");
                System.out.println("8. Mostrar oración: ");
                System.out.println("9. Agregar a la oración: ");
                System.out.println("10. Salir: ");
                int num = sc.nextInt();
                switch (num) {
                    case 1 -> {
                        if (oracion.length() == 0) {
                            oracion = CrearOracion();
                            palabras = Palabras(oracion);
                        } else {
                            oracion = "";
                            palabras = new String[0];
                            System.out.println("La oración ha sido borrada");
                        }
                    }
                    case 2 -> {
                        System.out.println("La cantidad de caracteres es: " + cantidadCaracteres(palabras));
                    }
                    case 3 -> {
                        System.out.println("La cantidad de palabras es: " + cantidadPalabras(palabras));
                    }
                    case 4 -> {
                        System.out.println(Arrays.toString(MostrarPalabras(palabras)));
                    }
                    case 5 -> {
                        numPalabra(palabras);
                    }
                    case 6 -> {
                        buscarPalabra(palabras);
                    }
                    case 7 -> {
                        oracion = reemplazarPalabra(palabras);
                        palabras = Palabras(oracion);
                    }
                    case 8 -> {
                        System.out.println("La oración es: " + oracion);
                    }
                    case 9 -> {
                        System.out.println("Que palabra quieres agregar: ");
                        String palabra = sc.nextLine();
                        oracion = oracion + " " + palabra;
                        palabras = Palabras(oracion);
                    }
                    case 10 -> {
                        System.out.println("Hasta luego");
                        flag = false;
                    }
                    default -> {
                        System.out.println("No existe");
                    }
                }
            } while (flag);

        }
    }

    public static String[] Palabras(String oracion) {
        String[] palabras = oracion.split(" ");
        return palabras;
    }

    public static String CrearOracion() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que oración quieres crear?");
        String or = sc.nextLine();
        System.out.println("Que oración quieres crear?");
        String or2 = sc.nextLine();

        or = or + ", " + or2;
        System.out.println("La frase es: " + or);
        return or;
    }

    public static int cantidadCaracteres(String[] palabras) {
        int cant = 0;
        for (String elem : palabras) {
            cant = cant + elem.length();
        }
        return cant;
    }

    public static int cantidadPalabras(String[] palabras) {
        return palabras.length;
    }

    public static String[] MostrarPalabras(String[] palabras) {
        Arrays.sort(palabras);

        return palabras;
    }

    public static void numPalabra(String[] palabras) {
        System.out.println("Escoge una palabra entre el 1 al" + palabras.length);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num - 1;
        String palabra = palabras[num];
        System.out.println("La palabra elegida es: " + palabra);
    }

    public static void buscarPalabra(String[] palabras) {
        System.out.println("Que palabra de todas estas quieres buscar: " + Arrays.toString(palabras));
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        int pos = Arrays.binarySearch(palabras, palabra);
        System.out.println("La posición de la palabra es: " + (pos + 1));
    }

    public static String reemplazarPalabra(String[] palabras) {
        boolean flag = true;
        String oracion = "";
        boolean onlyLetters = true;
        do {
            System.out.println("Que palabra de todas estas quieres reemplazar: " + Arrays.toString(palabras));
            Scanner sc = new Scanner(System.in);
            String palabra = sc.next();
            int pos = Arrays.binarySearch(palabras, palabra);

            if (pos == -1) {
                System.out.println("La palabra no existe o no es solo letras");
            } else {
                String palabra2 = "";
                do {

                    System.out.println("Que palabra quieres colocar para reemplazar:");
                    palabra2 = sc.nextLine();
                    String val = palabra2.trim();
                    for (int idx = 0; idx < val.length(); idx++) {
                        onlyLetters = Character.isLetter(val.charAt(idx));
                        if (onlyLetters == false) {
                            System.out.println("La palabra no es solo letras");
                            break;
                        } else {
                            flag = false;

                        }
                    }
                } while (flag);
                palabras[pos] = palabra2;
                for (String elem : palabras) {
                    oracion = oracion + elem + " ";
                }
                System.out.println("La oración es: " + oracion);
            }
        } while (flag);
        return oracion;
    }
}
