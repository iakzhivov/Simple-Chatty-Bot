import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean leap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        if (leap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}