package homeWork_2.presentation;

public class SolutionPresentation2 {
    public static void main(String[] args) {
        int q = 0;

        for (int i = 0; i < 1001; i++) {
            int a = (int) (Math.random() * 1001);
            if (a % 2 == 0){
                q += 1;
            }
        }
        float b = (q * 100) / 1000;
        System.out.println("Вероятность выпадения четных числе равна " + b + "%");

    }
}
