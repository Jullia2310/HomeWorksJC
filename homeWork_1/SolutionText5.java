package homeWork_1;

import java.util.Scanner;

public class SolutionText5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine();
        String a = "Вася";
        String b = "Анастасия";

        if(name.equals(a)){
            System.out.println("Привет!");
            System.out.println("Я тебе так долго ждал!");
        } else {
            if (name.equals(b)){
                System.out.println("Я тебе так долго ждал...");
            } else {
                System.out.println("Добрый день, а Вы кто?");
            }
        }

    }
}
