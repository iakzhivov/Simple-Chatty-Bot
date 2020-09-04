import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        boolean onlyFirstNumPositive = firstNum > 0 && secondNum <= 0 && thirdNum <= 0;
        boolean onlySecondNumPositive = firstNum <= 0 && secondNum > 0 && thirdNum <= 0;
        boolean onlyThirdNumPositive = firstNum <= 0 && secondNum <= 0 && thirdNum > 0;

        boolean exactlyOneNumPositive = onlyFirstNumPositive || onlySecondNumPositive || onlyThirdNumPositive;

        System.out.println(exactlyOneNumPositive);
    }
}