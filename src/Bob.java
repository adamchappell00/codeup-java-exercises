import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*Bob appears*");
        String userInput = scanner.nextLine();

        if(userInput.endsWith("?")){
            System.out.println("Sure");
        }else if(userInput.endsWith("!")){
            System.out.println("Woah, Chill out!");
        }else if(userInput.equals("")){
            System.out.println("Fine. be that way!");
        }else{
            System.out.println("Whatever");
        }
    }
}
