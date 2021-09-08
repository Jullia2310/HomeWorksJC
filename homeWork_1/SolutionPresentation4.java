package homeWork_1;

import java.util.Scanner;

public class SolutionPresentation4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        System.out.println("Ваше число: " + num);

        System.out.println("Введите цифру 1, если Ваше число нужно переводить в байты.");
        System.out.println("Введите цифру 2, если Ваше число нужно переводить в килобайты.");
        int dig = scan.nextInt();

        double b = num / 1024.0;
        int kb = num * 1024;

        if (dig == 1){
            System.out.println("Значение Вашего числа в байтах: " + b);
        } else if (dig == 2){
            System.out.println("Значение Вашего числа в килобайтах: " + kb);
        } else {
            System.out.println("Неверный ввод цифр! Попробуйте еще раз!");
        }
    }
}
