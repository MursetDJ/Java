
import java.util.Arrays;

public class ChartEjer {

    public static void main(String[] args) {
        fibo();
    }

    public static void contraseña() {
        boolean flag = false;
        do {
            String password = "";
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean number = false;
            boolean special = false;
            char[] caracteres = new char[10];
            for (int i = 0; i < 10; i++) {
                int value = ((int) (Math.random() * 93) + 33);
                char v = (char) value;
                caracteres[i] = v;
                if (!Character.isLetterOrDigit(v) && special == false) {
                    special = true;
                }
                if (Character.isDigit(v) && number == false) {
                    number = true;

                }
                if (Character.isUpperCase(v) && upperCase == false) {
                    upperCase = true;
                }
                if (Character.isLowerCase(v) && lowerCase == false) {
                    lowerCase = true;
                }
                password = password + v;
            }
            String msg = "";
            msg = msg + (number ? "se encontró numero " : "no se encontró numero ");
            msg = msg + (upperCase ? "se encontró mayúscula " : "no se encontró mayúscula ");
            msg = msg + (lowerCase ? "se encontró minúscula " : "no se encontró minúscula ");
            msg = msg + (special ? "se encontró caracter especial " : "no se encontró caracter especial ");
            System.out.println(msg);
            System.out.println(password);
            if (number && upperCase && lowerCase && special) {
                flag = true;
            }
        } while (flag != true);

    }

    public static void promedio() {
        String[] notas = new String[5];
        String[] aprobados = {};
        String[] desaprobados = {};
        String[] excelencia = {};
        for (int i = 0; i < notas.length; i++) {
            Double v = Math.random() * 11;
            notas[i] = String.valueOf(v);
            if (v < 4) {
                desaprobados = Arrays.copyOf(desaprobados, desaprobados.length + 1);
                desaprobados[desaprobados.length - 1] = notas[i];
            } else if (v >= 4 && v < 10) {
                aprobados = Arrays.copyOf(aprobados, aprobados.length + 1);
                aprobados[aprobados.length - 1] = notas[i];
            } else {
                excelencia = Arrays.copyOf(excelencia, excelencia.length + 1);
                excelencia[excelencia.length - 1] = notas[i];
            }
        }
        System.out.println(Arrays.toString(notas));
        double promedio = Arrays.stream(notas).mapToDouble(Double::parseDouble).average().getAsDouble();
        double sum = 0;
        for (String elem : notas) {
            sum = sum + Double.parseDouble(elem);
        }
        promedio = sum / notas.length;
        System.out.println("El promedio de todas las notas son " + promedio);
        System.out.println(Arrays.toString(aprobados));
        promedio = Arrays.stream(aprobados).mapToDouble(Double::parseDouble).average().getAsDouble();
        System.out.println("El promedio de aprobados son " + promedio);
        System.out.println(Arrays.toString(desaprobados));
        promedio = Arrays.stream(desaprobados).mapToDouble(Double::parseDouble).average().getAsDouble();
        System.out.println("El promedio de desaprobados son " + promedio);
        System.out.println(Arrays.toString(excelencia));
        promedio = Arrays.stream(excelencia).mapToDouble(Double::parseDouble).average().getAsDouble();
        System.out.println("El promedio de excelencia son " + promedio);

    }

    public static void fibo() {
        int num = 0;
        int fibo = 0;
        int fiboant = 0;
        while (num < 8) {

            System.out.println(fibo);
            if (fibo == 0) {
                fibo = 1;
                fiboant = 0;
            } else {
                int changefibo = fibo;
                fibo = fibo + fiboant;
                fiboant = changefibo;
            }
            num++;
        }
    }

    public static void verificacionEdad() {

    }

    public static void areaPerimetro() {

    }

}
