import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int sum = 0;

        while (num != 0) {
            num = scanner.nextInt();
            sum += num;
        }

        System.out.println(sum);
    }
}