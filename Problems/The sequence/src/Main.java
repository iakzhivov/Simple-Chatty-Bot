import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numElements = scanner.nextInt();
        int element;
        int maxElementDivisibleFour = 0;
        int i = 0;

        while (i < numElements) {
            element = scanner.nextInt();
            if (element % 4 == 0 && element > maxElementDivisibleFour) {
                maxElementDivisibleFour = element;
            }
            i++;
        }

        System.out.println(maxElementDivisibleFour);
    }
}