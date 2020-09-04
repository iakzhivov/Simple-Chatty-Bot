import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;

        if (secondDigit * 10 + firstDigit == number % 100) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}