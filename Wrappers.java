
import java.util.Arrays;
import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {
        NumtoStr();
    }

    public static void cadenaNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto numerico");
        String num = sc.nextLine();
        try {
            Double num2 = Double.valueOf(num);
            System.err.println("Numero convertido a double es " + num2);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir");
        }
    }

    public static void cadenaNumInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto numerico");
        String num = sc.nextLine();
        try {
            Integer num2 = Integer.valueOf(num);
            System.err.println("Numero convertido a Integer es " + num2);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir " + e.getMessage());
        }
    }

    public static void charLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String word = sc.nextLine().trim();
        boolean ist = true;
        for (int i = 0; i < word.length(); i++) {
            ist = Character.isLetter(word.charAt(i));
            if (ist == false) {
                System.out.println("La palabra no tiene solo letras");
                break;
            }
        }
        if (ist == true) {
            System.out.println("Todas son letras");
        }
    }

    public static void spaceChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe palabras");
        String word = sc.nextLine().trim();
        int cant = 0;
        for (int i = 0; i < word.length(); i++) {
            boolean ist = Character.isWhitespace(word.charAt(i));
            if (ist == true) {
                cant++;
            }
        }
        if (cant > 0) {
            System.out.println("La cantidad de espacios son; " + cant);
        } else {
            System.out.println("No tenemos espacios");
        }
    }

    public static void sumDecAndInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto numerico");
        String num = sc.nextLine();
        try {
            Integer num2 = Integer.valueOf(num);
            System.out.println("Numero convertido a Integer es " + num2);
            System.out.println("Escribe una cadena de texto numerico");
            String num3 = sc.nextLine();
            try {
                Double num4 = Double.valueOf(num3);
                System.out.println("Numero convertido a double es " + num4);
                System.out.println("Suma de ambos es: " + (Double) (num2 + num4));
            } catch (NumberFormatException e) {
                System.out.println("No se puede convertir");
            }
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir " + e.getMessage());
        }
    }

    public static void NumtoStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        String num = String.valueOf(sc.nextInt());
        int cant = 0;
        for (int i = 0; i < num.length(); i++) {
            boolean ist = Character.isDigit(num.charAt(i));
            if (ist == true) {
                cant++;
            }
        }
        if (cant > 0) {
            System.out.println("La cantidad de numeros es: " + cant);
        } else {
            System.out.println("No tenemos numeros");
        }
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
