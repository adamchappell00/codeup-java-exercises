package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        Movie[] list = MoviesArray.findAll();
        System.out.println("Movie List Loaded.");
        do {
            System.out.println("What would you like to do?\n0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category ");
            int selection = in.getInt();
            switch (selection) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    for (Movie film : list) {
                        System.out.println(film.getName());
                    }
                    break;
                case 2:
                    for (Movie film : list) {
                        if (film.getCategory() == "animated") {
                            System.out.println(film.getName());
                        }
                    }
                    break;
                case 3:
                    for (Movie film : list) {
                        if (film.getCategory() == "drama") {
                            System.out.println(film.getName());
                        }
                    }
                    break;
                case 4:
                    for (Movie film : list) {
                        if (film.getCategory() == "horror") {
                            System.out.println(film.getName());
                        }
                    }
                    break;
                case 5:
                    for (Movie film : list) {
                        if (film.getCategory() == "scifi") {
                            System.out.println(film.getName());
                        }
                    }
                    break;
                default:
                    System.out.println("other");
            }
            System.out.println("Would you like to continue?");
        } while(in.yesNo());


    }
}
