package grades;
import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        // Creating input instance
        Input in = new Input();

        // Creating Hashmap of Students, then
        // Creating 5 Students, and Adding github username, and Adding Current Grades for Each student.
        // the key is set as the string of the github username, the value paired with it is the student object
        HashMap<String, Student> students = new HashMap<>();
        Student christoff = new Student("Christoff");
        christoff.setGithub("christoff06");
        students.put(christoff.getGithub(), christoff);
        students.get("christoff06").addGrade(75);
        students.get("christoff06").addGrade(85);
        students.get("christoff06").addGrade(105);
        Student sven = new Student("Sven");
        sven.setGithub("ilovecarrots87");
        students.put(sven.getGithub(), sven);
        students.get("ilovecarrots87").addGrade(100);
        students.get("ilovecarrots87").addGrade(95);
        students.get("ilovecarrots87").addGrade(100);
        Student elsa = new Student("Elsa");
        elsa.setGithub("letitgo90");
        students.put(elsa.getGithub(), elsa);
        students.get("letitgo90").addGrade(80);
        students.get("letitgo90").addGrade(80);
        students.get("letitgo90").addGrade(100);
        Student anna = new Student("Anna");
        anna.setGithub("punchface92");
        students.put(anna.getGithub(), anna);
        students.get("punchface92").addGrade(95);
        students.get("punchface92").addGrade(84);
        students.get("punchface92").addGrade(81);
        students.get("punchface92").addGrade(99);
        // End Student Creation


        // Setting up a do-while for the text interface utilizing the Input class to select options.
        System.out.println("Welcome to Regulus-Grade-App* !  *tm\nHere are our current Students:\n");
        do{
            for (Map.Entry<String, Student> entry : students.entrySet()) {
                String name = entry.getKey();
                System.out.printf("\t|%s|", name);
            }
            System.out.println("\nWhich student would you like to display?");
            String displayUser = in.getString();
            if(students.containsKey(displayUser)){
                System.out.printf("The Average for %s is %s", students.get(displayUser).getName(), students.get(displayUser).getGradeAverage());
            }else{
                System.out.printf("No username of %s currently exists.", displayUser);
            };
            System.out.println("\nWould you like to continue?");
        }while (in.yesNo());
        System.out.println("Goodbye!");
    }
}
