package groceries;

public class Grocery {
    private int quantity;
    private String name;
    private String category;
    private String unit;
    public Grocery(String name, int qty, String category, String unit){
        this.name = name;
        this.quantity = qty;
        this.category = category;
        this.unit = unit;
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
    public String getUnit() {
        return unit;
    }
}
