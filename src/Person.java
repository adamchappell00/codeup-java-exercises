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
    public Person(String name) {
        this.name = name;
        System.out.println("A Person has been created with the name: "+ name);
    }
    public static void main(String[] args) {
        // TEST 1- Works
        /*
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        */
        // TEST 2, Works
        /*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
        */
        // TEST 3, Shocking, Both renamed to 'Jane'!
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
