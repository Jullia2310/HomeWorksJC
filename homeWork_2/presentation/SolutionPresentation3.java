package homeWork_2.presentation;

import java.util.Scanner;

public class SolutionPresentation3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое натуральное число:");
        int n = scan.nextInt();
        int even = 0;
        int odd = 0;

        while (n > 0){
            if (n % 2 == 0){
                even += 1;
            } else {
                odd += 1;
            }
           n = n / 10;
        }
        System.out.println("Количество четных цифр:  " + even);
        System.out.println("Количество нечетных цифр:  " + odd);

    }
}
