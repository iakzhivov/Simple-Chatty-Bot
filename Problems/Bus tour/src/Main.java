import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightBus = scanner.nextInt();
        int numBridges = scanner.nextInt();
        int heightBridges;
        int i = 1;
        boolean crash = false;

        while (i <= numBridges) {
            heightBridges = scanner.nextInt();
            if (heightBus < heightBridges) {
                crash = false;
            } else {
                crash = true;
                break;
            }
            i++;
        }

        if (crash) {
            System.out.println("Will crash on bridge " + i);
        } else {
            System.out.println("Will not crash");
        }
    }
}