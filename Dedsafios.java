
import java.util.Arrays;
import java.util.Scanner;

public class Dedsafios {

    public static void main(String[] args) {
        barras();
    }

    public static void primos() {
        int[] primos = new int[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cuantos números primos quieres");
        int cant = sc.nextInt();
        int count = 0;
        int num = 0;
        do {
            for (int i = 2; i < num + 1; i++) {
                if (i == num) {
                    primos = Arrays.copyOf(primos, primos.length + 1);
                    primos[primos.length - 1] = num;
                    count++;
                } else if (num % i == 0) {
                    break;
                }
            }
            num++;
        } while (count < cant);
        System.out.println(Arrays.toString(primos));
    }

    public static void factorial() {
        int cont = 1;//se va a multiplicar
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        do {
            cont = cont * num;
            num--;//5,4,3,2,1
        } while (num > 1);
        System.out.println(cont);//6*5*4*3*2*1=30*12*2=360*2=720
    }

    public static void fibo() {
        int num = 0;
        int fibo = 0;
        int fiboant = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int pos = sc.nextInt();
        while (num <= pos) {
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
        System.out.println("El numero en la posicion " + pos + " es: " + fiboant);
    }

    public static void cuadrado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cantidad de puntos (*)");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i == 0 || i == num - 1) {
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            } else {
                String msg = "";
                for (int j = 0; j < num; j++) {
                    if (j == 0 || j == num - 1) {
                        msg = msg + "*";
                    } else {
                        msg = msg + " ";
                    }
                }
                System.out.print(msg);
            }

            System.out.println();
        }
    }

    public static void barras() {
        Scanner sc = new Scanner(System.in);
        String msg = "";
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa numero" + (i + 1) + " de 4");
            int cant;
            do {
                cant = sc.nextInt();
                if (cant > 20 || cant < 1) {
                    System.err.println("Ingrese el número de 1 al 20");
                }
            } while (cant > 20 || cant < 1);

            for (int j = 0; j < cant; j++) {
                msg = msg + "*";
            }
            msg = msg + "\n";
        }

        System.out.println(msg);

    }

}
