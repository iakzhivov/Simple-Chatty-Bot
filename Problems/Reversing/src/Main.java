import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();

        int digit1 = n / 100;
        int digit2 = n / 10 % 10;
        int digit3 = n % 10;
        int result = digit3 * 100 + digit2 * 10 + digit1;

        System.out.println(result);
    }
}