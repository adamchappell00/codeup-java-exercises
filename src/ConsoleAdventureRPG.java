import java.util.Scanner;

public class ConsoleAdventureRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PlayerHealth = 100;
        int EnemyHealth = 100;
        System.out.println("Enter your name to start:");
        String PlayerName = scanner.next();
        System.out.printf("Welcome to the game, %s", PlayerName);

        System.out.println("Enter 1 to attack, 2 to drink potion, or 3 to run away.");
        int action = scanner.nextInt();
        // switch me
        if(action == 1){
            System.out.printf("%s attacks enemy", PlayerName);
        }
    }

}
