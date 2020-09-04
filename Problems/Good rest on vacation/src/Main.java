import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightHotelCost = scanner.nextInt();

        int totalCost = foodCostPerDay * nDays + flightCost * 2 + nightHotelCost * (nDays - 1);

        System.out.println(totalCost);
    }
}