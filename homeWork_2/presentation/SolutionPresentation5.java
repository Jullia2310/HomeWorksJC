package homeWork_2.presentation;

import java.util.Scanner;

public class SolutionPresentation5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимальное натуральное число: ");
        int min = scan.nextInt();
        System.out.println("Введите максимальное натуральное число: ");
        int max = scan.nextInt();
        System.out.println("Введите шаг вывода: ");
        int range = scan.nextInt();

        System.out.println("Ваш диапазон чисел: ");
        for (int i = min; i <= max; i += range){
            System.out.println(i);
        }

    }
}
