import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long res = 1L;
        if (n != 0L) {
            for (long i = 1L; i <= n; i++) {
                res *= i;
            }
        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}