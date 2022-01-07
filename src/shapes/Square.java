package shapes;

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
