package homeWork_1;


public class SolutionText1_2 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        System.out.println("Побитовые операции с числами 42 и 15.");
        System.out.println("Представление числа 42 в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа 15 в двоичной системе исчисления: " + Integer.toBinaryString(b));

        int aa = (byte) ~ a;
        int bb = (byte) ~ b;
        System.out.println("При применении оператора NOT числа 42 и 15 имеют следующие значения " + aa + " и " + bb);
        System.out.println("Представление числа " + aa + " в двоичной системе исчисления: " + Integer.toBinaryString(aa));
        System.out.println("Представление числа " + bb + " в двоичной системе исчисления: " + Integer.toBinaryString(bb));

        int c = a & b;
        System.out.println("При применении оператора AND результат операции имеет значние " + c);
        System.out.println("Представление числа " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));

        int cc = a | b;
        System.out.println("При применении оператора OR результат операции имеет значние " + cc);
        System.out.println("Представление числа " + cc + " в двоичной системе исчисления: " + Integer.toBinaryString(cc));

        int d = a ^ b;
        System.out.println("При применении оператора XOR результат операции имеет значние " + d);
        System.out.println("Представление числа " + d + " в двоичной системе исчисления: " + Integer.toBinaryString(d));

        int e = a >> 2;
        System.out.println("При применении оператора СДВИГ ВПРАВО для числа 42 результат операции имеет значние " + e);
        System.out.println("Представление числа " + e + " в двоичной системе исчисления: " + Integer.toBinaryString(e));

        int ee = b >> 2;
        System.out.println("При применении оператора СДВИГ ВПРАВО для числа 15 результат операции имеет значние " + ee);
        System.out.println("Представление числа " + ee + " в двоичной системе исчисления: " + Integer.toBinaryString(ee));

        int e1 = a << 2;
        System.out.println("При применении оператора СДВИГ ВЛЕВО для числа 42 результат операции имеет значние " + e1);
        System.out.println("Представление числа " + e1 + " в двоичной системе исчисления: " + Integer.toBinaryString(e1));

        int ee1 = b << 2;
        System.out.println("При применении оператора СДВИГ ВЛЕВО для числа 15 результат операции имеет значние " + ee1);
        System.out.println("Представление числа " + ee1 + " в двоичной системе исчисления: " + Integer.toBinaryString(ee1));

        int f = a >>> 2;
        System.out.println("При применении оператора СДВИГ ВПРАВО С ЗАПОЛНЕНИЕМ НОЛЯМИ для числа 42 результат операции имеет значние " + f);
        System.out.println("Представление числа " + f + " в двоичной системе исчисления: " + Integer.toBinaryString(f));

        int ff = b >>> 2;
        System.out.println("При применении оператора ДВИГ ВПРАВО С ЗАПОЛНЕНИЕМ НОЛЯМИ для числа 15 результат операции имеет значние " + ff);
        System.out.println("Представление числа " + ff + " в двоичной системе исчисления: " + Integer.toBinaryString(ff));






    }
}
