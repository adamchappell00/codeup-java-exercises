package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString() {
        System.out.println("Give me a String");
        return scanner.nextLine();
    }

    boolean yesNo() {
        System.out.println("Give me a Boolean");
        String inputString = scanner.nextLine();
        return  (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes"));
    }

    int getInt(int min, int max){
        System.out.printf("Give me an Integer between %s and %s:\n", min, max);
        int inputInt = scanner.nextInt();
        if ( inputInt > max || inputInt < min) {
            return getInt(min, max);
        }
        return inputInt;
    }
    int getInt(){
        System.out.println("Give me an Integer:");
        return scanner.nextInt();
    }
    double getDouble(double min, double max){
        System.out.printf("Give me a double between %s and %s:\n", min, max);
        double inputDouble = scanner.nextDouble();
        if(inputDouble > max || inputDouble < min){
            return getDouble(min, max);
        }
        return inputDouble;
    }
    double getDouble(){
        System.out.println("Give me a double:\n");
        return scanner.nextDouble();
    }
}
