import java.util.Random;
public class Dicethrough {
    public static void main(String[] args) {
        Random random = new Random();
    int num = random.nextInt(1,7) ;  // Generates a random number between 1 and 6
    System.out.println("You rolled a " + num);
}
}
