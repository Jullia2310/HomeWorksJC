package homeWork_1;

import java.util.Scanner;

public class SolutionPresentation3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        int num3 = num1 / num2;
        int num4 = num1 % num2;

        if (num4 == 0){
            System.out.println("Первое число делится на второе без остатка!");
            System.out.println("Частное от деления первого числа на второе равно " + num3);
        } else {
            System.out.println("Первое число делится на второе с остатком!");
            System.out.println("Остаток от деления первого числа на второе равен: " + num4);
            System.out.println("Частное от деления первого числа на второе равно " + num3);
        }
    }
}
