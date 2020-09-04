import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int nextEven = number / 2 * 2 + 2;
        System.out.println(nextEven);
    }
}