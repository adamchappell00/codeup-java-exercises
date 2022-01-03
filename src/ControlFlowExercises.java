import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Exercise 1.a  ~~~~~~~~~~~~~ WHILE LOOP : COMPLETE
        /*
        int i = 5;
        while(i <= 15){
            System.out.println(i++);
        }
         */
        // Exercise 1.b ~~~~~~~~~~~~~~ DO-WHILE : COMPLETE
        /* int x = 0;
        do {
            System.out.println(x);
            x += 2;
        }while(x  <= 100);
        */
        /*
        int y = 100;
        do {
            System.out.println(y);
            y -= 10;
        }while (y >= -10);
         */
        /*
        int z = 2;
        do {
            System.out.println(z);
            z = (int) Math.pow(z, 2);
        }while (z <= 1000000);
         */
        // Exercise 1c ~~~~~~~~~~~~~ REFACTOR with FOR Loops : COMPLETE
        /*
        for(int i = 5; i <= 15; i++) {
            System.out.println(i);
        }
        for(int x = 0; x <= 100; x += 2){
            System.out.println(x);
        }
        for(int y = 100; y >= -10; y -=10){
            System.out.println(y);
        }
        for(int z = 2; z <= 1000000; z = (int) Math.pow(z, 2)){
            System.out.println(z);
        }
        */
        // Exercise 2 ~~~~~~~~~~~~~ FizzBuzz: Java Edition: COMPLETE
        /*
        for(int c = 0; c <= 100; c++){
            if( (c % 5 == 0) && (c % 3 == 0)){
                System.out.println("FizzBuzz");
            } else if(c % 5 == 0){
                System.out.println("Buzz");
            } else if (c % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(c);
            }
        }
         */
        // Exercise 3 ~~~~~~~~~~~~~ Exponent Table: COMPLETE
        /*
        boolean userWantsToContinue;
        do{
            System.out.print("Enter an Integer: ");
            int userInput = scanner.nextInt();
            System.out.println("number \t | squared \t | cubed \n ----- \t | -----\t | ----- ");
            for(int j = 1; j <= userInput; j++){
                System.out.printf("%s \t \t | %s \t \t | %s \n", j, ((int )Math.pow(j, 2)), ((int)Math.pow(j, 3)));
            }
            System.out.println("If you would like to continue, press y");
            String userContinue = scanner.next();
            userWantsToContinue = userContinue.equalsIgnoreCase("y");
        }while(userWantsToContinue);
        */
        boolean userWantsToContinue;
        do{
            System.out.print("Enter in your grade (from 1 to 100): ");
            int userGrade = scanner.nextInt();
            if(userGrade >= 88 && userGrade <= 100){
                System.out.println("You got an A!");
            }else if (userGrade < 88 && userGrade >= 80){
                System.out.println("You got a B.");
            }else if (userGrade < 80 && userGrade >= 67){
                System.out.println("You got a C.");
            }else if(userGrade < 67 && userGrade >= 60){
                System.out.println("You got a D.");
            }else if(userGrade < 60){
                System.out.println("You got an F.");
            }else {
                System.out.println("Something isn't right");
            }
            System.out.println("If you would like to continue, enter y");
            String userContinue = scanner.next();
            userWantsToContinue = userContinue.equalsIgnoreCase("y");
        }while(userWantsToContinue);

    }
}
