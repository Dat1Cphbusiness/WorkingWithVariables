public class PriceCalculator {
    
    // Students will work with arithmetic operators in relatable contexts
    
    private String storeName;
    private double totalSales;
    
    public PriceCalculator(String storeName) {
        this.storeName = storeName;
        this.totalSales = 0.0;
    }
    
    // Getters
    public String getStoreName() {
        return this.storeName;
    }
    
    public double getTotalSales() {
        return this.totalSales;
    }
    
    // Setters
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    // Price calculation methods
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
    
    public double applyDiscount(double price, double discountPercent) {
        double discountAmount = price * (discountPercent / 100.0);
        return price - discountAmount;
    }
    
    public double addTax(double price, double taxPercent) {
        double taxAmount = price * (taxPercent / 100.0);
        return price + taxAmount;
    }
    
    public double calculateChange(double paid, double cost) {
        return paid - cost;
    }
    
    public void addSale(double amount) {
        this.totalSales += amount;
    }
    
    public void displayInfo() {
        System.out.println("Store: " + storeName);
        System.out.println("Total Sales: " + totalSales + " kr");
    }
}
