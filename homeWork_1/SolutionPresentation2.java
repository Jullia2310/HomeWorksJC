package homeWork_1;

import java.util.Scanner;

public class SolutionPresentation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();


        if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)){
            System.out.println("Первое число среднее!");
        } else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)){
            System.out.println("Второе число среднее!");
        } else if ((num1 < num3 && num3 < num2) || (num2 < num3 && num3 < num1)){
            System.out.println("Третье число среднее!");
        } else {
            System.out.println("Числа равны между собой!");
        }

    }
}
