
import java.util.*;
import java.util.regex.Pattern;

public class Integrador {

    public static void main(String[] args) {
        passwordSencillo();

    }

    public static void grados() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la temperatura: ");
            double num = sc.nextDouble();
            System.out.println("Ingrese la unidad de medida (C/F): ");
            String temp = sc.next();
            String conv = temp.equals("C") ? "La temperatura es: " + num + " convertida a Celsius es: " + ((num - 32) * 5) / 9 : temp.equals("F") ? "La temperatura es: " + num + " convertida a Fahrenheit es: " + ((num * 9) / 5) + 32 : "Tiene que ser C o F";
            System.out.println(conv);
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan numeros");
        } catch (Exception e) {
            System.out.println("Error no controlado");
        }
    }

    public static void password() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa La contraseña, tiene que tener 8 caracteres o más y debe tener al menos un número, una letra mayuscula y minuscula y un caracter especial: ");
            sc.next(Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"));
            System.out.println("Programa finalizado");
        } catch (InputMismatchException e) {

            System.out.println("Cantidad de caracteres incorrecta" + e);
        }
    }

    public static void passwordSencillo() {
        try {
            boolean confirm = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa La contraseña, tiene que tener 8 caracteres o más y debe tener al menos un número, una letra mayuscula y minuscula y un caracter especial: ");
            String pass = sc.next();
            if (pass.length() < 8) {
                System.out.println("La contraseña debe tener 8 caracteres o más");
                confirm = false;
            }
            if (!pass.matches("^(?=.*[@$!%*?&])(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{0,}$")) {
                System.out.println("La contraseña debe tener caracteres especiales");
                confirm = false;
            }
            if (!pass.matches("^(?=.*[a-z])(?=.*[A-Z])[A-Za-z]{0,}$")) {
                System.out.println("La contraseña debe tener al menos una letra mayuscula, minuscula");
                confirm = false;
            }
            System.err.println(confirm ? "La contraseña es correcta" : "La contraseña es incorrecta");
        } catch (InputMismatchException e) {

            System.out.println("Cantidad de caracteres incorrecta" + e);
        }
    }
}
