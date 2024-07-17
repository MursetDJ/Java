
import java.util.Arrays;
import java.util.Scanner;

public class ArreglosS {

    public static void main(String[] args) {
        llenarArr();
    }

    public static void OrdenDesc() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 100);
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int numUlt = 0;
            int numF = 0;
            for (int idx = 0; idx < Math.round(nums.length / 2); idx++) {
                numUlt = nums[nums.length - idx - 1];
                numF = nums[idx];
                nums[idx] = numUlt;
                nums[nums.length - idx - 1] = numF;

            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void posicion() {
        boolean flag = true;
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(nums));
            System.out.println("Que número quieres buscar");
            int num = sc.nextInt();
            int pos = Arrays.binarySearch(nums, num);
            System.out.println("El numero se encuentra en la posicion " + (pos + 1));
        }
    }

    public static void comparar() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 100);
            }
            int[] nums2 = Arrays.copyOf(nums, nums.length + 1);
            System.out.println(Arrays.toString(nums));
            boolean comparacion = Arrays.equals(nums, nums2);
            if (comparacion) {
                System.out.println("Los arreglos son iguales");
            } else {
                System.out.println("Los arreglos son diferentes");
            }
        }
    }

    public static void copyPar() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 100);
            }
            boolean result = false;
            do {
                System.out.println("Ingrese numero inferior");
                int inf = sc.nextInt();
                System.out.println("Ingrese numero superior");
                int sup = sc.nextInt();
                if (inf < sup && sup <= nums.length) {
                    result = true;
                    int[] nums2 = Arrays.copyOfRange(nums, inf, sup);
                    System.out.println(Arrays.toString(nums2));
                } else {
                    System.out.println("Los numeros no son validos");
                }
            } while (result != true);

            System.out.println(Arrays.toString(nums));
        }
    }

    public static void llenarArr() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese cantidad para el arreglo");
            int num = sc.nextInt();
            int[] nums = new int[num];
            int postant = 0;

            boolean response = false;
            do {
                System.out.println("Ingrese numero para el arreglo");
                int value = sc.nextInt();
                System.out.println("Ingrese hasta que posición llenar el arreglo");
                int pos = sc.nextInt();
                if (pos > nums.length) {
                    System.out.println("Excediste la posición máxima " + nums.length);
                    continue;
                } else if (pos == nums.length) {
                    response = true;
                }
                Arrays.fill(nums, postant, pos, value);
                postant = pos;
            } while (response != true);

            System.out.println(Arrays.toString(nums));
        }
    }
}
