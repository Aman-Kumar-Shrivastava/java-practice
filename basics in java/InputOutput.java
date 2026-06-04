import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // For scanning String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // For scanning integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // For scanning double input
        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble()
        
        // for boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine(); // Consume the newline character left by nextBoolean()

        //use of if else statement 

        
        System.out.println("\n=== Student Details ===");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Is Student: " + isStudent);
          if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }
        scanner.close();
    }
}