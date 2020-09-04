import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String newStr1 = str1.replaceAll("\\s+", "");
        String newStr2 = str2.replaceAll("\\s+", "");

        System.out.println(newStr1.equals(newStr2));
    }
}