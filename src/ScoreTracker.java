public class ScoreTracker {
    
    // Students will work with counter and accumulator variables
    // in Main.java using these methods
    
    private String playerName;
    private int totalScore;
    private int gamesPlayed;
    
    public ScoreTracker(String playerName) {
        this.playerName = playerName;
        this.totalScore = 0;
        this.gamesPlayed = 0;
    }
    
    // Getters
    public String getPlayerName() {
        return this.playerName;
    }
    
    public int getTotalScore() {
        return this.totalScore;
    }
    
    public int getGamesPlayed() {
        return this.gamesPlayed;
    }
    
    // Methods for adding scores
    public void addScore(int score) {
        this.totalScore += score;
        this.gamesPlayed++;
    }
    
    public double getAverageScore() {
        if (gamesPlayed == 0) {
            return 0.0;
        }
        return (double) totalScore / gamesPlayed;
    }
    
    public void reset() {
        this.totalScore = 0;
        this.gamesPlayed = 0;
    }
    
    public void displayInfo() {
        System.out.println("Player: " + playerName);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Average: " + getAverageScore());
    }
}
