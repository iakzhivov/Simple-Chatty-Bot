import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;
        int squaresNum = 1;

        while (squaresNum <= n) {
            System.out.println(squaresNum);
            num++;
            squaresNum = num * num;
        }
    }
}