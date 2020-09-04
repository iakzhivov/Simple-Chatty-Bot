import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int years = 0;
        double deposit = m;

        while (deposit < k) {
            deposit += 0.01 * p * deposit;
            years++;
        }

        System.out.println(years);
    }
}