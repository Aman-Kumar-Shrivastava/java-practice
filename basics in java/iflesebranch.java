import java.util.Scanner;
public class iflesebranch {
    public static void main (String[] args){

        //checking the age group of the given age

        Scanner scanner = new Scanner(System.in);

        int age;
        //name store
        String name;
 
        System.out.println("Enter your name: ");
        name = scanner.nextLine(); // Read the actual name input
 
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
        } else {    
            System.out.println("Hello, " + name + "!");
        }

          if(age<18){
            System.out.println("You are a minor.");
            }
          else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
          }
          else {
            System.out.println("You are a senior citizen.");
          }

scanner.close();

    }
    
}
