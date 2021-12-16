import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        // Console Exercise
        // P1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.\n", pi);

        // Scanner Exercise
        // P1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();
        System.out.printf("You entered: \"%s\"\n", userInput);
        // P2
        System.out.println("Enter in three words: ");
        String userStringFirst = scanner.next();
        String userStringSecond = scanner.next();
        String userStringThird = scanner.next();
        System.out.printf("You entered: \n \"%s\",\n \"%s\", \n & \"%s\".\n", userStringFirst, userStringSecond, userStringThird);
        // P3
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userSentence = scan.nextLine();
        System.out.printf("You entered: \"%s\".\n", userSentence);

        // Calculate Area
        // P1
        System.out.println("Enter the width of your room: ");
        String widthInput = scan.nextLine();
        System.out.println("Enter the length of your room: ");
        String lengthInput = scan.nextLine();
        int area = Integer.valueOf(widthInput) * (Integer.valueOf(lengthInput));
        int perimeter =  (Integer.valueOf(widthInput) * 2) + (Integer.valueOf(lengthInput) * 2);
        System.out.printf("The width entered was %s, the length entered was %s.", widthInput, lengthInput);
        System.out.printf("\nThe area of the room is %s, the perimeter is %s.", area, perimeter);
    }
}
