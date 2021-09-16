package homeWork_2.presentation;

import java.util.Scanner;

public class SolutionPresentation1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое натуральное число:");
        int a = scan.nextInt();
        int m = a % 10;

        while (a > 0){
            if ((a % 10) > m){
                m = a % 10;
            }
            a = a /10;
        }
        System.out.println("Наибольшая цифра Вашего числа: " + m);
    }
}
