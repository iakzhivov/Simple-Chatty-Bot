import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int integer = scanner.nextInt();

        int digit1 = integer / 100;
        int digit2 = integer / 10 % 10;
        int digit3 = integer % 10;

        System.out.println(digit1 + digit2 + digit3);
    }
}