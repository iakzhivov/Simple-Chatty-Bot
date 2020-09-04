import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean smallVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        boolean capitalVowel = ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        return smallVowel || capitalVowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}