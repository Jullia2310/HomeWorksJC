package homeWork_2.loops;

public class SolutionTxt1_1_1 {
    public static void main(String[] args) {
        System.out.println("Введите в аргумент к исполняемой программе любое число для вычисления факториала!");
        int fact = 1;
        int a = 1;
        int b = Integer.parseInt(args[0]);

        while (a <= b) {
            fact = fact * a;
            if (a != b){
                System.out.print(a + " * ");
            } else {
                System.out.print(a);
            }
            a++;
        }

        System.out.println(" = " + fact);
    }
}
