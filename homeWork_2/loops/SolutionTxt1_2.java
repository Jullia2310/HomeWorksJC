package homeWork_2.loops;

import java.util.Scanner;

public class SolutionTxt1_2 {
    public static void main(String[] args) {
        System.out.println("Введите в аргумент к исполняемой программе любое число.");
        Scanner scan = new Scanner(args[0]);

        if (scan.hasNextLong()){
            long value = scan.nextLong();
            System.out.println("Вы ввели число " + value);
        } else if (scan.hasNextInt()){
            int value = scan.nextInt();
            System.out.println("Вы ввели число " + value);
        } else if (scan.hasNextDouble()){
            System.out.println("Вы ввели нецелое число");
        } else {
            System.out.println("Вы ввели что-то, а не число");
        }

        int b = Integer.parseInt(args[0]);
        int a = 1;
        int c = 0;
        int d = b;

        while (b > 0) {
            b = b / 10;
            c++;
        }

        b = d;

        int[] amount = new int[c];

        for (int i = amount.length - 1; i > -1; i--) {
            amount[i] = d % 10;
            d /= 10;
        }

        for (int i = 0; i < amount.length; i++) {
            System.out.print(amount[i]);
            if (i != amount.length - 1) {
                System.out.print(" * ");
            }
            a *= amount[i];
        }

        System.out.println(" = " + a + " - результат произведения всех цифр");
    }
}
