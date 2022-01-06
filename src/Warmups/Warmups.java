package Warmups;

import java.util.Scanner;

public class Warmups {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //January 6 Warmup - new class Warmups.Penguin.java created
        //    PSVM Insert for Warmups.Warmups.java below:
        Penguin steve = new Penguin("Steve" , "Emperor");
        Penguin david = new Penguin("David", "King");
        Penguin demi = new Penguin("Demi", "Galapagos");
        Penguin gaga = new Penguin("Gaga", "Adelle");
        steve.setSex('m');
        steve.setWeight(42.5);
        david.setSex('m');
        david.setWeight(31.2);
        demi.setSex('n');
        demi.setWeight(15.3);
        gaga.setSex('f');
        gaga.setWeight(16.7);
        Penguin.areEvil();
        System.out.println("Penguins are Evil according to David?");
        System.out.println(Penguin.areEvil());
        System.out.println("Penguins are a flying Pokemon:");
        System.out.println(Penguin.canFly());
        System.out.println("Is David an evil penguin?");
        System.out.println(Penguin.areEvil(david.getName()));
        System.out.println("Is Steve an evil penguin?");
        System.out.println(Penguin.areEvil(steve.getName()));


        // Warmup 4 January
        // System.out.println(startDay());

        // Warmup 16 December
        /*
        System.out.println("What did you eat for breakfast today?");
        String userBreakfast = scanner.nextLine();
        System.out.printf("%s sounds great!", userBreakfast);
        */

        // First Warmup: 15 December
        //System.out.println("Java is statically typed, while Javascript is dynamically typed.");


    }
    // Warmup 4 January
    public static String startDay(){

        return "Brain Loading...Done!";
    }
}
