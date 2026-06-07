import java.util.Scanner;

public class madlibs {

    public static void main(String[] args) {
       
    //MAD LIBS GAME

Scanner scanner =new Scanner(System.in);

    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;
     
    System.out.println("Welcome to the Mad Libs Game!");
    System.out.println("enter an adjective(descriptive): ");
    adjective1 = scanner.nextLine();
    System.out.println("enter a noun (person, place, or thing): ");
    noun1 = scanner.nextLine();
    System.out.println("enter an adjective(descriptive): ");
    adjective2 = scanner.nextLine();
    System.out.println("enter a verb(action with -ing): ");
    verb1 = scanner.nextLine();
    System.out.println("enter an adjective(descriptive): ");
    adjective3 = scanner.nextLine();

     System.out.println("Today i want to a "+ adjective1+ "ZOO.");
     System.out.println("In an exhibit, I saw a "+ noun1+ ". ");
     System.out.println(noun1+ " was "+ adjective2+ " and "+ verb1+ "ing around. ");
     System.out.println("I was " + adjective3 + "!" );
     scanner.close();
}
}
