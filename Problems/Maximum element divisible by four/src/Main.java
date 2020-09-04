import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nElements = scanner.nextInt();
        int maxMultipleFour = 0;

        for (int i = 0; i < nElements; i++) {
            int element = scanner.nextInt();
            if (element % 4 == 0 && element > maxMultipleFour) {
                maxMultipleFour = element;
            }
        }

        System.out.println(maxMultipleFour);
    }
}