package homeWork_2.presentation;

import java.util.Scanner;

public class SolutionPresentation4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов ряда Фибоначчи: ");
        int n = scan.nextInt();
        int a = 1;
        int b = 2;
        System.out.println("Элементы ряда: ");
        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= n; i++){
            System.out.println(a + b);
            int c = a;
            a = b;
            b = c + a;
        }

    }
}
