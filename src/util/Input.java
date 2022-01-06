package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Give me a String");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Give me a Boolean");
        String inputString = scanner.nextLine();
        return  (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        System.out.printf("Give me an Integer between %s and %s:\n", min, max);
        int inputInt = scanner.nextInt();
        if ( inputInt > max || inputInt < min) {
            return getInt(min, max);
        }
        return inputInt;
    }
    public int getInt(){
        System.out.println("Give me an Integer:");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        System.out.printf("Give me a double between %s and %s:\n", min, max);
        double inputDouble = scanner.nextDouble();
        if(inputDouble > max || inputDouble < min){
            return getDouble(min, max);
        }
        return inputDouble;
    }
    public double getDouble(){
        System.out.println("Give me a double:\n");
        return scanner.nextDouble();
    }
}
