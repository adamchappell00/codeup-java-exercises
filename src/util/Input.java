package util;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString() {
        System.out.println("Give me a String");
        String inputString = scanner.nextLine();
        return inputString;
    }

    boolean yesNo() {
        System.out.println("Give me a Boolean");
        String inputString = scanner.nextLine();
        if (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max) {
        System.out.printf("Give me an Integer between %s and %s:\n", min, max);
        // write validation of min/max
        int inputInt = scanner.nextInt();
        return inputInt;
    }
    int getInt(){
        System.out.println("Give me an Integer:");
        int inputInt = scanner.nextInt();
        return inputInt;
    }
    //double getDouble(double min, double max)
    double getDouble(){
        System.out.printf("Give me a double:\n");
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }
}
