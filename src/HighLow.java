import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double RandNum = (Math.random() * 100) + 1;
        int RandInt = (int) RandNum;
        Boolean guessed = false;
        do {
            System.out.println("Guess my number between 1 and 100.");
            int userNum = scanner.nextInt();
            if(userNum == RandInt){
                System.out.println("GOOD GUESS!");
                guessed = true;
            } else if(userNum > RandInt){
                System.out.println("LOWER");
            } else if(userNum < RandInt){
                System.out.println("HIGHER");
            } else {
                System.out.println("Whoops...");
            }

        }while(!guessed);
    }
}
