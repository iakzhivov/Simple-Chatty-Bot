import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean successfulWeekday = numCups >= 10 && numCups <= 20 && !weekend;
        boolean successfulWeekend = numCups >= 15 && numCups <= 25 && weekend;

        System.out.println(successfulWeekday || successfulWeekend);
    }
}