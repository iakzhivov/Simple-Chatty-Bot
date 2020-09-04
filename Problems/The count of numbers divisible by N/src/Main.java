// Without any loops

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int countNumbersDivisibleN;

        if (a % n == 0) {
            countNumbersDivisibleN = b / n - a / n + 1;
        } else {
            countNumbersDivisibleN = b / n - a / n;
        }

        System.out.println(countNumbersDivisibleN);
    }
}


// With loops

/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int countNumbersDivisibleN = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                countNumbersDivisibleN++;
            }
        }

        System.out.println(countNumbersDivisibleN);
    }
}
*/