public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"big","electric","dark","awesome","wonderful","colorful","great","square","round","bright"};
        String[] nouns = {"taco","table","atom","neutron","book","bottle","car","star","bus","laser"};
        System.out.println("Your Server Name is: " + getRandom(adjectives) + "-" + getRandom(nouns));
    }
    public static String getRandom(String[] array){
        int random = (int) (Math.random() * array.length) + 1;
        return array[random];
    }
}
