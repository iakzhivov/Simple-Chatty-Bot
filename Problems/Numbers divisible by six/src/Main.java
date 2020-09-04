import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nElements = scanner.nextInt();
        int sumMultipleSix = 0;

        for (int i = 0; i < nElements; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sumMultipleSix += number;
            }
        }

        System.out.println(sumMultipleSix);
    }
}