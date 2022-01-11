package groceries;

public class Grocery {
    private int quantity;
    private String name;
    private String category;
    public Grocery(String name, int qty, String category){
        this.name = name;
        this.quantity = qty;
        this.category = category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public String getCategory(){
        return category;
    }
    public int getQuantity() {
        return quantity;
    }
}
