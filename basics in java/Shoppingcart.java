import java.util.Scanner;

public class Shoppingcart {
    //Shopping cart program
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

            String item;
            double price;
            int Qty;
            char Currency = '$';
            double total;

            System.out.println("Welcome to the Shopping Cart Program!");
            System.out.print("Enter the name of the item: ");
            item = scanner.nextLine();
            System.out.print("Enter the price of the item: ");
            price = scanner.nextDouble();
            System.out.print("Enter the quantity of the item: ");
            Qty = scanner.nextInt();

            total = price * Qty;
            System.out.println("\n=== Shopping Cart Summary ===");
            System.out.println("Item: " + item);
            System.out.println("Price: " + Currency + price);
            System.out.println("Quantity: " + Qty);
            System.out.println("Total: " + Currency + total);


    scanner.close();
}
}
