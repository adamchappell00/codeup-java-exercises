package shapes;

public class Square extends Quadrilateral{

    public double getPerimeter() {
        return width * 4;
    }

    public double getArea() {
        return width * width;
    }
    public void setLength(double newLength) {
        length = newLength;
        width = newLength;
    }
    public void setWidth(double newWidth) {
        length = newWidth;
        width = newWidth;
    }
}
/*
-------Previous Version Below from initial Rectangle-Shapes Inheritance Exercise-----

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }
    public double getArea(){
        return width * width;
    }
    public double getPerimeter(){
        return width * 4;
    }

}
*/