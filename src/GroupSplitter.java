public class GroupSplitter {
    
    // Students will work with division and modulo for splitting/sharing
    
    private String groupName;
    private int numberOfPeople;
    
    public GroupSplitter(String groupName, int numberOfPeople) {
        this.groupName = groupName;
        this.numberOfPeople = numberOfPeople;
    }
    
    // Getters
    public String getGroupName() {
        return this.groupName;
    }
    
    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }
    
    // Setters
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    
    // Splitting methods
    public double splitBill(double totalBill) {
        return totalBill / numberOfPeople;
    }
    
    public int splitItems(int totalItems) {
        return totalItems / numberOfPeople;
    }
    
    public int getLeftovers(int totalItems) {
        return totalItems % numberOfPeople;
    }
    
    public int getRounds(int totalItems) {
        // How many complete rounds can we do?
        return totalItems / numberOfPeople;
    }
    
    public void displayInfo() {
        System.out.println("Group: " + groupName);
        System.out.println("People: " + numberOfPeople);
    }
}
