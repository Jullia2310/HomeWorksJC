package homeWork_1;

import java.util.Scanner;

public class SolutionPresentation5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер позиции кода таблицы ASCII ");
        int name = scan.nextInt();
        char name1 = (char) name;

        if ((name >= 65 && name1 <= 90) || (name1 >= 97 && name1 <= 122)) {
            System.out.println("Это буква английского алфавита - " + name1);
        } else {
            System.out.println("Это иной символ");
        }

    }
}
