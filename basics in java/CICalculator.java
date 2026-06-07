import java.util.Scanner;

public class CICalculator {
    public static void main(String[] args) {
        // compound interest calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timescompounds;
        int years;
        double amount;

    System.out.print("Enter the principal amount: ");
    principal = scanner.nextDouble();

    System.out.print("Enter the annual interest rate (in %): ");
    rate = scanner.nextDouble();

    System.out.print("Enter the number of times interest is compounded per year: ");
    timescompounds = scanner.nextInt();

    System.out.print("Enter the number of years: ");
    years = scanner.nextInt();

    // Calculate the compound interest
    amount = principal * Math.pow(1 + (rate / 100) / timescompounds, timescompounds * years);
    scanner.close();

    System.out.printf("The compound interest is: %.2f\n", amount - principal);
    System.out.printf("The total amount after %d years is: %.2f\n", years, amount);
}
}
