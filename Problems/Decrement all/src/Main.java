import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int fourthNum = scanner.nextInt();

        System.out.print(--firstNum + " ");
        System.out.print(--secondNum + " ");
        System.out.print(--thirdNum + " ");
        System.out.print(--fourthNum);
    }
}