package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(){}
    public Rectangle(double length, double width){
        super(length,width);
    }
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

}
/*
-------Previous Version Below from initial Rectangle-Shapes Inheritance Exercise-----
public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(){}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
*/