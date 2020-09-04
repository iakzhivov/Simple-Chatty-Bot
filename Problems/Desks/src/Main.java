import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        int nFirstStudents = scanner.nextInt();
        int nSecondStudents = scanner.nextInt();
        int nThirdStudents = scanner.nextInt();

        int nFirstDesks = nFirstStudents / 2 + nFirstStudents % 2;
        int nSecondDesks = nSecondStudents / 2 + nSecondStudents % 2;
        int nThirdDesks = nThirdStudents / 2 + nThirdStudents % 2;
        int sumDesks = nFirstDesks + nSecondDesks + nThirdDesks;

        System.out.println(sumDesks);
    }
}