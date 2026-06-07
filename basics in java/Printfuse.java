public class Printfuse {
    public static void main(String[] args){
        // The printf method in Java is used to format and print output. It allows you to specify the format of the output using format specifiers.

        int number = 42;
        String name = "Alice";
        double price = 19.99;

        // Using printf to format output
        System.out.printf("Hello, %s! Your number is %d and the price is $%.2f.%n", name, number, price);

        // Format specifiers:
        // %s - String
        // %d - Integer
        // %.2f - Floating-point number with 2 decimal places
        // %n - New line

        // use of flags in dispaying the double value in 10 spaces and left justified

        double price1 = 1900.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        // + = output of plus sign for positive numbers and minus sign for negative numbers
        // , = output of comma as a thousands separator
        // ( = output of parentheses for negative numbers in ()
        // spce = output of a space before positive numbers and a minus sign for negative numbers

        // + flag
        System.out.printf("Price 1: %+.2f%n", price1);
        System.out.printf("Price 2: %+.2f%n", price2);
        System.out.printf("Price 3: %+.2f%n", price3);
    
        // , flag
        System.out.printf("Price 1: %,.2f%n", price1);
        System.out.printf("Price 2: %,.2f%n", price2);
        System.out.printf("Price 3: %,.2f%n", price3);

        // ( flag
        System.out.printf("Price 1: %(,.2f%n", price1);
        System.out.printf("Price 2: %(,.2f%n", price2);
        System.out.printf("Price 3: %(,.2f%n", price3);
    
        // space flag
        System.out.printf("Price 1: % ,.2f%n", price1);
        System.out.printf("Price 2: % ,.2f%n", price2);
        System.out.printf("Price 3: % ,.2f%n", price3);  
        
        /* [width] = output of the value in a field of specified width. 
        If the value is shorter than the width, it will be padded with spaces.
        If the value is longer than the width, it will be printed as is.*/

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);

        // zero padding
        System.out.printf("%05d\n", id1);
        System.out.printf("%05d\n", id2);
        System.out.printf("%05d\n", id3);
        System.out.printf("%05d\n", id4);

        
        // right justified padding
        System.out.printf("%5d\n", id1);
        System.out.printf("%5d\n", id2);
        System.out.printf("%5d\n", id3);
        System.out.printf("%5d\n", id4);

        // left justified padding
        System.out.printf("%-5d\n", id1);   
        System.out.printf("%-5d\n", id2);
        System.out.printf("%-5d\n", id3);
        System.out.printf("%-5d\n", id4);
    }
}
