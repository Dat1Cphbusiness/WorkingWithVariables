public class FormValidator {
    
    // Students will work with validation flags
    
    private String formName;
    private boolean hasErrors;
    private boolean isValid;
    private boolean isSubmitted;
    private boolean isComplete;
    
    public FormValidator(String formName) {
        this.formName = formName;
        this.hasErrors = false;
        this.isValid = false;
        this.isSubmitted = false;
        this.isComplete = false;
    }
    
    // Getters
    public String getFormName() {
        return this.formName;
    }
    
    public boolean hasErrors() {
        return this.hasErrors;
    }
    
    public boolean isValid() {
        return this.isValid;
    }
    
    public boolean isSubmitted() {
        return this.isSubmitted;
    }
    
    public boolean isComplete() {
        return this.isComplete;
    }
    
    // Setters
    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }
    
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }
    
    public void setSubmitted(boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }
    
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    
    // Helper methods
    public void validate() {
        if (isComplete && !hasErrors) {
            this.isValid = true;
        } else {
            this.isValid = false;
        }
    }
    
    public void submit() {
        if (isValid && !hasErrors) {
            this.isSubmitted = true;
        }
    }
    
    public void reset() {
        this.hasErrors = false;
        this.isValid = false;
        this.isSubmitted = false;
        this.isComplete = false;
    }
    
    public void displayInfo() {
        System.out.println("Form: " + formName);
        System.out.println("Complete: " + isComplete);
        System.out.println("Has Errors: " + hasErrors);
        System.out.println("Valid: " + isValid);
        System.out.println("Submitted: " + isSubmitted);
    }
}
