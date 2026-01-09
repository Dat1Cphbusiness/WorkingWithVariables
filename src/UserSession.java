public class UserSession {
    
    // Students will work with state tracking flags
    
    private String username;
    private boolean isLoggedIn;
    private boolean isAdmin;
    private boolean hasNotifications;
    private boolean isVerified;
    private boolean isActive;
    
    public UserSession(String username) {
        this.username = username;
        this.isLoggedIn = false;
        this.isAdmin = false;
        this.hasNotifications = false;
        this.isVerified = false;
        this.isActive = true;
    }
    
    // Getters
    public String getUsername() {
        return this.username;
    }
    
    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }
    
    public boolean isAdmin() {
        return this.isAdmin;
    }
    
    public boolean hasNotifications() {
        return this.hasNotifications;
    }
    
    public boolean isVerified() {
        return this.isVerified;
    }
    
    public boolean isActive() {
        return this.isActive;
    }
    
    // Setters
    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public void setHasNotifications(boolean hasNotifications) {
        this.hasNotifications = hasNotifications;
    }
    
    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }
    
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    // Helper methods
    public void login() {
        if (isActive) {
            this.isLoggedIn = true;
        }
    }
    
    public void logout() {
        this.isLoggedIn = false;
        this.hasNotifications = false;
    }
    
    public void deactivate() {
        this.isActive = false;
        this.isLoggedIn = false;
    }
    
    public void activate() {
        this.isActive = true;
    }
    
    public void addNotification() {
        if (isLoggedIn) {
            this.hasNotifications = true;
        }
    }
    
    public void clearNotifications() {
        this.hasNotifications = false;
    }
    
    public void displayInfo() {
        System.out.println("User: " + username);
        System.out.println("Active: " + isActive);
        System.out.println("Logged In: " + isLoggedIn);
        System.out.println("Admin: " + isAdmin);
        System.out.println("Verified: " + isVerified);
        System.out.println("Has Notifications: " + hasNotifications);
    }
}
