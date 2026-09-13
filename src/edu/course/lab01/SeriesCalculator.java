package edu.course.lab01;

public class SeriesCalculator {

    public static void calculate() {
        double sum = 0.0;
        int n = 2;
        int count = 0;
        int lastAddedN = 0;

        while (true) {
            double term = 1.0 / (n * n + n - 2);

            if (Math.abs(term) < 1e-6) {
                break;
            }

            sum += term;
            count++;
            lastAddedN = n;

            n++;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Последний n: " + lastAddedN);
        System.out.println("Количество членов: " + count);
    }
}
