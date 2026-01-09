public class Product {
    
    // Students will work with these variables
    // NO methods to implement - just variable work in Main.java
    
    private String name;
    private double price;
    private int quantity;
    private boolean inStock;
    private char category;  // 'E' = Electronics, 'F' = Food, 'C' = Clothing
    
    public Product(String name) {
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
        this.inStock = false;
        this.category = 'U';  // U = Unknown
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public boolean isInStock() {
        return this.inStock;
    }
    
    public char getCategory() {
        return this.category;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
    public void setCategory(char category) {
        this.category = category;
    }
    
    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price + " kr");
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + inStock);
        System.out.println("Category: " + category);
    }
}
