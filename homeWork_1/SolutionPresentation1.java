package homeWork_1;

import java.util.Scanner;

public class SolutionPresentation1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstnumber = scan.nextInt();

        System.out.println("Введите второе число: ");
        int secondnumber = scan.nextInt();

        System.out.println("Первое число: " + firstnumber);
        System.out.println("Второе число: " + secondnumber);

        boolean firstsplit = firstnumber % 2 == 0;
        boolean secondsplit = secondnumber % 2 == 0;

        if (firstsplit){
            System.out.println("Первое число ЧЕТНОЕ!");
        } else {
            System.out.println("Первое число НЕЧЕТНОЕ!");
        }

        if (secondsplit){
            System.out.println("Второе число ЧЕТНОЕ!");
        } else {
            System.out.println("Второе число НЕЧЕТНОЕ!");
        }


    }
}
