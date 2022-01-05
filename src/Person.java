public class Person {
    private String name;
    public String getName(){
        return name;
//TODO: Complete
// return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODO: Complete
// change the name field to the passed value
    }
    public void sayHello(){
        System.out.printf("Hello %s!", name);
//TODO: Complete
// print a message to the console using the person's name
    }
}
