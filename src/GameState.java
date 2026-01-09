public class GameState {
    
    // Students will work with flag variables to track game state
    
    private String gameName;
    private boolean isPaused;
    private boolean isGameOver;
    private boolean hasStarted;
    private boolean isMuted;
    
    public GameState(String gameName) {
        this.gameName = gameName;
        this.isPaused = false;
        this.isGameOver = false;
        this.hasStarted = false;
        this.isMuted = false;
    }
    
    // Getters
    public String getGameName() {
        return this.gameName;
    }
    
    public boolean isPaused() {
        return this.isPaused;
    }
    
    public boolean isGameOver() {
        return this.isGameOver;
    }
    
    public boolean hasStarted() {
        return this.hasStarted;
    }
    
    public boolean isMuted() {
        return this.isMuted;
    }
    
    // Setters
    public void setPaused(boolean isPaused) {
        this.isPaused = isPaused;
    }
    
    public void setGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }
    
    public void setStarted(boolean hasStarted) {
        this.hasStarted = hasStarted;
    }
    
    public void setMuted(boolean isMuted) {
        this.isMuted = isMuted;
    }
    
    // Helper methods
    public void start() {
        this.hasStarted = true;
        this.isPaused = false;
        this.isGameOver = false;
    }
    
    public void pause() {
        if (hasStarted && !isGameOver) {
            this.isPaused = true;
        }
    }
    
    public void resume() {
        if (hasStarted && !isGameOver) {
            this.isPaused = false;
        }
    }
    
    public void endGame() {
        this.isGameOver = true;
        this.isPaused = false;
    }
    
    public void reset() {
        this.isPaused = false;
        this.isGameOver = false;
        this.hasStarted = false;
    }
    
    public void displayInfo() {
        System.out.println("Game: " + gameName);
        System.out.println("Started: " + hasStarted);
        System.out.println("Paused: " + isPaused);
        System.out.println("Game Over: " + isGameOver);
        System.out.println("Muted: " + isMuted);
    }
}
