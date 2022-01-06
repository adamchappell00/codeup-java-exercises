import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = {new Person("Bob"), new Person("Steve"), new Person("John"), new Person("James")};
        Person demi = new Person("Demi");
        Person[] morePeople = addPerson(people,demi);
        Person stan = new Person("Stan");
        Person[] mostPeople = addPerson(morePeople, stan);
        for(Person person : mostPeople){
            System.out.println(person.getName());
        }

    }
    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] newPeopleArray = Arrays.copyOf(people, (people.length+1));
        newPeopleArray[newPeopleArray.length - 1] = newPerson;
        return newPeopleArray;
    }
}