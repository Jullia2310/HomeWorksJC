package homeWork_1;

import java.util.Scanner;

public class SolutionText5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine();

        switch (name){
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебе так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебе так долго ждал...");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
                break;
        }

    }

}

