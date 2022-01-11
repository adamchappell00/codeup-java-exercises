package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String newName){
        name = newName;
        grades = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        System.out.println(name + " has an average grade of: ");
        return sum / grades.size();
    }
/* Completed Students Methods and Tested, commented out for GradesApplication Main Method use in Exercise Part 2
    public static void main(String[] args) {
        Student christoff = new Student("Christoff");
        christoff.addGrade(75);
        System.out.println(christoff.getGradeAverage());
        christoff.addGrade(95);
        christoff.addGrade(85);
        christoff.addGrade(145);
        System.out.println(christoff.getGradeAverage());
        Student sven = new Student("Sven");
        sven.addGrade(100);
        sven.addGrade(95);
        sven.addGrade(100);
        System.out.println(sven.getGradeAverage());
        Student elsa = new Student("Elsa");
        elsa.addGrade(100);
        elsa.addGrade(80);
        elsa.addGrade(20);
        elsa.addGrade(100);
        System.out.println(elsa.getGradeAverage());
        Student anna = new Student("Anna");
        anna.addGrade(100);
        anna.addGrade(80);
        anna.addGrade(120);
        anna.addGrade(180);
        System.out.println(anna.getGradeAverage());
        Student olaf = new Student("Olaf");
        olaf.addGrade(99);
        System.out.println(olaf.getGradeAverage());

    }*/
}
