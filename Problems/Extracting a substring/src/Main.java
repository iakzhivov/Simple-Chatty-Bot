import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(str.substring(beginIndex, endIndex + 1));
    }
}