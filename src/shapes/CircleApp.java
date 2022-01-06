package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        do {
            System.out.println("Let's Create a Circle! Please enter the radius of the new circle:");
            Circle newCircle = new Circle(Input.getDouble());
            System.out.printf("\nYou Entered %s, the circumference of the circle is %s and the area is $s", newCircle.radius, newCircle.getCircumference(), newCircle.getArea());
        }while(Input.yesNo());
    }
}