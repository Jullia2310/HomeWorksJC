package homeWork_1;

import java.util.Scanner;

public class SolutionPresentation6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год, про который хотите узнать.");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Введеный Вами год - високосный!");
        } else {
            System.out.println("Введеный Вами год - обычный!");
        }

    }
}
