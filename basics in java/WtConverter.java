import java.util.Scanner;
public class WtConverter {
    public static void main(String[] args) {
        // Weight converter program

    //Declare Variables
    Scanner scanner = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;

    //Welcome message
    System.out.println("Welcome to the Weight Converter!");
    System.out.println("Please select the conversion you want to perform:");
    System.out.println("1. Pounds to Kilograms");
    System.out.println("2. Kilograms to Pounds");

    //prompt for user choixe 
    System.out.print("Enter your choice (1 or 2): ");
    choice = scanner.nextInt();

    // option 1 convert lbs to kgs

    if (choice == 1){
        System.out.print("Enter weight in pounds: ");
        weight = scanner.nextDouble();
        newWeight = weight * 0.453592; // conversion factor from pounds to kilograms
        System.out.println("Weight in kilograms: " + newWeight);
    }
    // option 2 convert kgs to lbs
    else if (choice == 2){
        System.out.print("Enter weight in kilograms: ");
        weight = scanner.nextDouble();
        newWeight = weight * 2.20462; // conversion factor from kilograms to pounds
        System.out.println("Weight in pounds: " + newWeight);
    }
    // else print invalid choice
    else {
        System.out.println("Invalid choice. Please select either 1 or 2.");
    }
    scanner.close();
    }
}