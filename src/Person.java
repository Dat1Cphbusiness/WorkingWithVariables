public class Person {
    
    // Students will work with these variables
    // NO methods to implement - just variable work in Main.java
    
    private String firstName;
    private String lastName;
    private int age;
    private double height;  // in meters
    private boolean isStudent;
    private char bloodType;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.height = 0.0;
        this.isStudent = false;
        this.bloodType = 'O';
    }
    
    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public boolean isStudent() {
        return this.isStudent;
    }
    
    public char getBloodType() {
        return this.bloodType;
    }
    
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }
    
    public void setBloodType(char bloodType) {
        this.bloodType = bloodType;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Student: " + isStudent);
        System.out.println("Blood Type: " + bloodType);
    }
}
