package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Square box = new Square(5);
        Rectangle rectangle = new Rectangle(4,5);
        myShape = box;
        System.out.println("Area of Square is " + myShape.getArea());
        System.out.println("Perimeter of Square is " + myShape.getPerimeter());
        myShape = rectangle;
        System.out.println("Area of Rectangle is " + myShape.getArea());
        System.out.println("Perimeter of Rectangle is " + myShape.getArea());
    }
}
/*
-------Previous Version Below from initial Rectangle-Shapes Inheritance Exercise-----
public class ShapesTest {
    public static void main(String[] args) {
        // Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class
        // with a width of 4 and a length of 5 verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        Rectangle myRect = new Rectangle(4,5);
        System.out.println("Area is: " + myRect.getArea());
        System.out.println("Perimeter is: " + myRect.getPerimeter());

       // Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that
       // has a side value of 5. verify that the getPerimeter and getArea methods return 20 and 25, respectively.
         Rectangle mySquare = new Square(5);
        System.out.println("Area is: " + mySquare.getArea());
        System.out.println("Perimeter is: " + mySquare.getPerimeter());
    }
}

 */
