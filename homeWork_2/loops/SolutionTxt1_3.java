package homeWork_2.loops;

import java.util.Scanner;

public class SolutionTxt1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, которое хотите возвести в степень.");
        double number = scan.nextDouble();
        System.out.println("Введите степень, в которую хотите возвести число.");
        int pow = scan.nextInt();
        double result = 1;

        if (((int) pow != pow) || (pow < 0)){
            System.out.println("ВНИМАНИЕ! Степень должна быть только целым положительным числом!");
        }

        for (int i = 1; i <= pow ; i++) {
            result *= number;
        }

        System.out.println("Результат возведения числа в степень: " + number + " ^ " + pow + " = " + result);

    }
}
