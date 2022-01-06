package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Boolean goOn = false;
        do {
            System.out.println("Let's Create a Circle! Please enter the radius of the new circle:");
            Circle newCircle;
            newCircle = new Circle(input.getDouble());
            System.out.printf("\nYou Entered %s, the circumference of the circle is %s and the area is %s\n", newCircle.radius, newCircle.getCircumference(), newCircle.getArea());
            System.out.println("Would you like to continue? ");
            goOn = input.yesNo();
            System.out.println("Thank You");
        }while(goOn);
    }
}