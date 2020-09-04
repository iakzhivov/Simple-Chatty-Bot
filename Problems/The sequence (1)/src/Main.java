import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numberNum = 0;
        int repeatingNum = 1;

        while (numberNum != n) {
            for (int i = 1; i <= repeatingNum; i++) {
                System.out.println(repeatingNum);
                numberNum++;
                if (numberNum == n) {
                    break;
                }
            }
            repeatingNum++;
        }
    }
}