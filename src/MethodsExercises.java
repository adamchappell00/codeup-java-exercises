import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int added = add(2,5);
        System.out.println(added);

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

    }
}
