public class Temperature {
    
    // Students will work with these variables
    // NO methods to implement - just variable work in Main.java
    
    private int celsius;
    private double fahrenheit;
    private double kelvin;
    private String location;
    
    public Temperature(String location) {
        this.location = location;
        this.celsius = 0;
        this.fahrenheit = 32.0;
        this.kelvin = 273.15;
    }
    
    // Getters
    public int getCelsius() {
        return this.celsius;
    }
    
    public double getFahrenheit() {
        return this.fahrenheit;
    }
    
    public double getKelvin() {
        return this.kelvin;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    // Setters
    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }
    
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void displayInfo() {
        System.out.println("Location: " + location);
        System.out.println("Celsius: " + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Kelvin: " + kelvin + "K");
    }
}
