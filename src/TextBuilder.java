public class TextBuilder {
    
    // Students will work with string concatenation
    
    private String currentText;
    
    public TextBuilder() {
        this.currentText = "";
    }
    
    public TextBuilder(String initialText) {
        this.currentText = initialText;
    }
    
    // Getters
    public String getCurrentText() {
        return this.currentText;
    }
    
    // Setters
    public void setCurrentText(String text) {
        this.currentText = text;
    }
    
    // Text building methods
    public void append(String text) {
        this.currentText = this.currentText + text;
    }
    
    public void appendLine(String text) {
        this.currentText = this.currentText + text + "\n";
    }
    
    public void prepend(String text) {
        this.currentText = text + this.currentText;
    }
    
    public String combine(String text1, String text2) {
        return text1 + text2;
    }
    
    public String combineWithSpace(String text1, String text2) {
        return text1 + " " + text2;
    }
    
    public void clear() {
        this.currentText = "";
    }
    
    public int getLength() {
        return this.currentText.length();
    }
    
    public void displayInfo() {
        System.out.println("Current Text: " + currentText);
        System.out.println("Length: " + getLength());
    }
}
