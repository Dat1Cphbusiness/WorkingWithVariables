public class Calculator {
    
    // Students will work with temporary variables for intermediate calculations
    
    private String calculatorName;
    private double lastResult;
    
    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
        this.lastResult = 0.0;
    }
    
    // Getters
    public String getCalculatorName() {
        return this.calculatorName;
    }
    
    public double getLastResult() {
        return this.lastResult;
    }
    
    // Setters
    public void setLastResult(double result) {
        this.lastResult = result;
    }
    
    // Simple operations
    public double add(double a, double b) {
        double result = a + b;
        this.lastResult = result;
        return result;
    }
    
    public double subtract(double a, double b) {
        double result = a - b;
        this.lastResult = result;
        return result;
    }
    
    public double multiply(double a, double b) {
        double result = a * b;
        this.lastResult = result;
        return result;
    }
    
    public double divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            this.lastResult = result;
            return result;
        }
        return 0.0;
    }
    
    public void reset() {
        this.lastResult = 0.0;
    }
    
    public void displayInfo() {
        System.out.println("Calculator: " + calculatorName);
        System.out.println("Last Result: " + lastResult);
    }
}
