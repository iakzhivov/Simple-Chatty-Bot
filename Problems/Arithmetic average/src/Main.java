import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sumMultipleThree = 0;
        int amountMultipleThree = 0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0.0) {
                sumMultipleThree += i;
                amountMultipleThree++;
            }
        }

        System.out.println(sumMultipleThree / amountMultipleThree);
    }
}