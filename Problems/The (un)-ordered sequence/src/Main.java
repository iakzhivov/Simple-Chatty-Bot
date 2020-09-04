import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentNum = scanner.nextInt();
        int previousNum = currentNum;
        int increment = 0;
        int decrement = 0;
        boolean ordered;

        while (currentNum != 0) {
            if (currentNum < previousNum) {
                decrement++;
            }
            if (currentNum > previousNum) {
                increment++;
            }
            previousNum = currentNum;
            currentNum = scanner.nextInt();
        }


        ordered = decrement == 0 || increment == 0;
        System.out.println(ordered);
    }
}