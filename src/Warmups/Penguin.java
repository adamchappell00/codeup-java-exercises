package Warmups;

public class Penguin {
    private String name;
    private double weight;
    private String species;
    private char sex;

    public Penguin(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public static Boolean canFly(){
        return false;
    }
    public static Boolean areEvil(){
        return true;
    }
    public static Boolean areEvil(String name){
        if(name.equalsIgnoreCase("Steve")  || name.equalsIgnoreCase("Bob")){
            return false;
        } else {
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public String getSpecies(){
        return species;
    }
    public char getSex(){
        return sex;
    }
    /* January 6 Warmup - new class
        DONE- Create a class named “Warmups.Penguin”
        DONE- Give your class the following private fields
                Name, Weight,Species,Sex
        Give your class the following public methods
            DONE- getName, getWeight, getSpecies, getSex,
            DONE- setName, setWeight, setSpecies, setSex
        DONE- Give your class a constructor method
        DONE- Give your class the following public static methods
            DONE- canFly (returns false)
            DONE- areEvil (returns true) [Source]
        */
}
