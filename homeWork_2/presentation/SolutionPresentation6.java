package homeWork_2.presentation;

import java.util.Scanner;

public class SolutionPresentation6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое натуральное число: ");
        int n = scan.nextInt();
        int m = 0;

        while (n > 0){
            m = (m * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println("Ваше число, но перевернутое: " + m);

    }
}
