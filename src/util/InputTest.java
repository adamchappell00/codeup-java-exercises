package util;

public class InputTest {
    public static void main(String[] args) {
        Input myTest = new Input();
        //System.out.println(myTest.getString()); //tested
        System.out.println(myTest.getInt());
        System.out.println(myTest.getInt(10,20));
        System.out.println(myTest.getDouble());
    }
}
