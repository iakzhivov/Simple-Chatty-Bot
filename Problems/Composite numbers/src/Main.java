import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        int numDivisor = 0;
        boolean composite = false;
        for (long i = 1L; i <= number; i++) {
            if (number % i == 0) {
                numDivisor++;
            }
            if (numDivisor > 2) {
                composite = true;
                break;
            }
        }
        return composite;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}