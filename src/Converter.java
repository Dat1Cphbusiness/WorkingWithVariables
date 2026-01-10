public class Converter {
    
    // Students will work with temporary variables for multi-step conversions
    
    private String converterName;
    
    public Converter(String converterName) {
        this.converterName = converterName;
    }
    
    // Getters
    public String getConverterName() {
        return this.converterName;
    }
    
    // Temperature conversions (use temp variables for steps)
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    // Distance conversions
    public double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
    
    public double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
    
    // Currency conversions (example rates)
    public double usdToEur(double usd) {
        return usd * 0.85;
    }
    
    public double eurToUsd(double eur) {
        return eur / 0.85;
    }
    
    public void displayInfo() {
        System.out.println("Converter: " + converterName);
    }
}
