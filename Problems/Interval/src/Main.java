import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean firstPartInterval = number > -15 && number <= 12;
        boolean secondPartInterval = number > 14 && number < 17;
        boolean thirdPartInterval = number >= 19;
        boolean allInterval = firstPartInterval || secondPartInterval || thirdPartInterval;

        if (allInterval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}