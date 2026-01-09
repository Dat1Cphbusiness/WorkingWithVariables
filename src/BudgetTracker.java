public class BudgetTracker {
    
    // Students will work with accumulator variables (income and expenses)
    
    private String name;
    private double income;
    private double expenses;
    
    public BudgetTracker(String name) {
        this.name = name;
        this.income = 0.0;
        this.expenses = 0.0;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public double getIncome() {
        return this.income;
    }
    
    public double getExpenses() {
        return this.expenses;
    }
    
    public double getBalance() {
        return income - expenses;
    }
    
    // Methods for adding income and expenses
    public void addIncome(double amount) {
        this.income += amount;
    }
    
    public void addExpense(double amount) {
        this.expenses += amount;
    }
    
    public void reset() {
        this.income = 0.0;
        this.expenses = 0.0;
    }
    
    public void displayInfo() {
        System.out.println("Budget for: " + name);
        System.out.println("Income: " + income + " kr");
        System.out.println("Expenses: " + expenses + " kr");
        System.out.println("Balance: " + getBalance() + " kr");
    }
}
