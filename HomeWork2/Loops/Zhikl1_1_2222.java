package HomeWork2.Loops;

import java.util.Arrays;
import java.util.Scanner;

//Перемножить все цифры числа введенного через аргумент к исполняемой программе
public class Zhikl1_1_2222 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(args[0]);   // обращение к аргументу через сканер

        if (sc.hasNextLong()) {
            long value = sc.nextLong();
            System.out.println("Введено число : " + value);

            int f = 1;
            int count = 0;
            int a = Integer.parseInt(args[0]);
            System.out.println(Arrays.toString(args));

            while (a != 0) {
                a = a / 10;
                count++;
            }
            a = Integer.parseInt(args[0]);
            int[] arr = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                arr[i] = a % 10;
                a = a / 10;
            }
            for (int i = 0; i < count; i++) {
                f = f * arr[i];
                if (i < count - 1)
                    System.out.print(arr[i] + " * ");
                else
                    System.out.print(arr[i]);
            }
            System.out.print(" = " + f);
        }
        else if (sc.hasNextDouble()) {
            System.out.println("Введено не целое число");
        }
        else {
            System.out.println("Введено не число");
        }
    }
}


