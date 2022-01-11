package groceries;
import grades.Student;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListApp {
    public static void main(String[] args) {
        Input in = new Input();
        // Setting the initial categories for Groceries
        ArrayList<String> categories = new ArrayList<>();;
        categories.add("Bakery");
        categories.add("Dairy");
        categories.add("Produce");
        categories.add("Meat");
        categories.add("Frozen");
        categories.add("Dry+Baking");
        categories.add("Canned Goods");
        HashMap<String, Grocery> groceries = new HashMap<>();
        System.out.println("Welcome to Adam's Grocery List!\nWould you like to create a list?");

        if(in.yesNo()){
            System.out.println("Let's start!");

            do{
                if (groceries.isEmpty()) {
                    System.out.println("Nothing is currently on your list");
                } else {
                    System.out.println("Here is your current list:");
                    for (Map.Entry<String, Grocery> entry : groceries.entrySet()) {
                        String name = entry.getKey();
                        Grocery value = entry.getValue();
                        System.out.println("-" + name + "\tQty: " + value.getQuantity() + "\tCategory: "+ value.getCategory());
                    }
                }
                if(in.yesNo("Would you like to add an item?")){
                    for(String category : categories){
                        System.out.printf("\t|%s|", category);
                    }
                    String addCategory = in.getString("\nEnter a category:");
                    String addItem = in.getString("Enter the Item Name:");

                    int addQty = in.getInt("How many " + addItem + " would you like to add?");
                    System.out.printf("You entered: %s %s in the %s section,",addQty,addItem,addCategory);
                    if(in.yesNo("\nAdd this item?")){
                        groceries.put(addItem, new Grocery(addItem, addQty, addCategory));
                    }
                };
            }while(in.yesNo("Would you like to continue?"));

        }
        System.out.println("Goodbye");
        System.out.println("Here is your Final list:");
        for (Map.Entry<String, Grocery> entry : groceries.entrySet()) {
            String name = entry.getKey();
            Grocery value = entry.getValue();
            System.out.println("-" + name + "\tQty: " + value.getQuantity() + "\tCategory: "+ value.getCategory());
        }
        System.out.println("Goodbye.");
        groceries.clear();
    }
}
