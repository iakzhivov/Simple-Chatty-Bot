import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int largestElement = 0;

        while (num != 0) {
            num = scanner.nextInt();
            if (num > largestElement) {
                largestElement = num;
            }
        }

        System.out.println(largestElement);
    }
}