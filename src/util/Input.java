package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter your response:");
        return scanner.next();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.next();
    }
    public boolean yesNo() {
        System.out.println("Enter Response (Y/Yes/true for Affirmative):");
        String inputString = scanner.next();
        return  (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String inputString = scanner.next();
        return  (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes"));
    }
    public int getInt(int min, int max){
        System.out.printf("Enter an Integer between %s and %s:\n", min, max);
        String input = getString();

        int inputInt = Integer.valueOf(input);
        if ( inputInt > max || inputInt < min) {
            return getInt(min, max);
        }
        return inputInt;
    }
    public int getInt(){
        String input = getString("Enter an Integer:");
        int inputInt;
        try{
            inputInt =  Integer.valueOf(input);
        } catch (NumberFormatException e){
            System.out.println("input conversion for getInt() was not possible, expected a whole number, entered value was \""+input+"\"");
            inputInt = getInt();
        }
        return inputInt;
    }
    public int getInt(String prompt){
        String input = getString(prompt);
        int inputInt = Integer.valueOf(input);
        return inputInt;
    }
    public double getDouble(){
        String input = getString("Enter in a number(double):");
        double inputDbl;
        try{
            inputDbl =  Double.valueOf(input);
        } catch (NumberFormatException e){
            System.out.println("input conversion for getDouble() was not possible, expected a number, entered value was \""+input+"\"");
            inputDbl = getDouble();
        }
        return inputDbl;
    }
    public double getDouble(double min, double max){
        System.out.printf("Enter a number(double) between %s and %s:\n", min, max);
        String input = getString();
        double inputDouble = Double.valueOf(input);
        if(inputDouble > max || inputDouble < min){
            return getDouble(min, max);
        }
        return inputDouble;
    }

}
