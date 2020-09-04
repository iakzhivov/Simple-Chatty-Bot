import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            int detector = scanner.nextInt();
            if (detector == 1) {
                larger++;
            } else if (detector == -1) {
                smaller++;
            } else {
                perfect++;
            }
        }

        System.out.print(perfect + " " + larger + " " + smaller);
    }
}