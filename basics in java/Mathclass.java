public class Mathclass {
    public static void main(String[] args) {
        // Math class in Java provides various methods for performing mathematical operations.
        // Here are some examples of using the Math class:

        double number = 9.0;

        // Square root
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + sqrt);

        // Power
        double power = Math.pow(2, 3); // 2 raised to the power of 3
        System.out.println("2 raised to the power of 3 is: " + power);

        // Absolute value
        int negativeNumber = -5;
        int absValue = Math.abs(negativeNumber);
        System.out.println("Absolute value of " + negativeNumber + " is: " + absValue);

        // Maximum and Minimum
        int a = 10;
        int b = 20;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);

        // Rounding
        double decimalNumber = 3.7;
        long rounded = Math.round(decimalNumber);
        System.out.println(decimalNumber + " rounded is: " + rounded);
    }
}
