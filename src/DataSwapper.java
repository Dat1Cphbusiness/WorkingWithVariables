public class DataSwapper {
    
    // Students will work with swap operations
    
    private String name;
    private int valueA;
    private int valueB;
    
    public DataSwapper(String name, int valueA, int valueB) {
        this.name = name;
        this.valueA = valueA;
        this.valueB = valueB;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public int getValueA() {
        return this.valueA;
    }
    
    public int getValueB() {
        return this.valueB;
    }
    
    // Setters
    public void setValueA(int valueA) {
        this.valueA = valueA;
    }
    
    public void setValueB(int valueB) {
        this.valueB = valueB;
    }
    
    // Swap method
    public void swap() {
        int temp = this.valueA;
        this.valueA = this.valueB;
        this.valueB = temp;
    }
    
    public void reset(int a, int b) {
        this.valueA = a;
        this.valueB = b;
    }
    
    public void displayInfo() {
        System.out.println("Swapper: " + name);
        System.out.println("Value A: " + valueA);
        System.out.println("Value B: " + valueB);
    }
    
    public void displaySwapResult() {
        System.out.println("A=" + valueA + ", B=" + valueB);
    }
}
