import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(add(2,5));
        System.out.println(subtract(2,5));
        System.out.println(multiply(2,5));
        System.out.println(divide(5,2));
        System.out.println(modulus(5,2));
        System.out.println(getInteger(1, 10));
        getFactorial();
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2){
        return num1/num2;
    }
    public static int modulus(int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter an Integer between %s and %s:", min, max);
        int userNum = sc.nextInt();
        if ( userNum > max || userNum < min) {
            getInteger(min, max);
        }
        return userNum;
    }
    public static void getFactorial(){
        Scanner sc = new Scanner(System.in);
        Boolean keepGoing;
        do {
            int userNum = getInteger(1, 10);
            long factorial = 1;
            for(int i = 1; i < userNum; i++){
                factorial *= i + 1;
            }
            System.out.println(factorial);
            System.out.println("Would you like to continue?");
            keepGoing = sc.nextBoolean();
        } while (keepGoing);
    }
}
