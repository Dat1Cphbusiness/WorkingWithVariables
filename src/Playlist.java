public class Playlist {
    
    // Students will work with index for tracking current song
    
    private String playlistName;
    private String[] songs;
    private int currentSongIndex;
    private boolean isPlaying;
    
    public Playlist(String playlistName, String[] songs) {
        this.playlistName = playlistName;
        this.songs = songs;
        this.currentSongIndex = 0;
        this.isPlaying = false;
    }
    
    // Getters
    public String getPlaylistName() {
        return this.playlistName;
    }
    
    public String[] getSongs() {
        return this.songs;
    }
    
    public int getCurrentSongIndex() {
        return this.currentSongIndex;
    }
    
    public boolean isPlaying() {
        return this.isPlaying;
    }
    
    public int getNumberOfSongs() {
        return this.songs.length;
    }
    
    // Setters
    public void setCurrentSongIndex(int index) {
        if (index >= 0 && index < songs.length) {
            this.currentSongIndex = index;
        }
    }
    
    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
    
    // Navigation methods
    public String getCurrentSong() {
        if (currentSongIndex >= 0 && currentSongIndex < songs.length) {
            return songs[currentSongIndex];
        }
        return null;
    }
    
    public String getSongAt(int index) {
        if (index >= 0 && index < songs.length) {
            return songs[index];
        }
        return null;
    }
    
    public void nextSong() {
        if (currentSongIndex < songs.length - 1) {
            currentSongIndex++;
        } else {
            currentSongIndex = 0;  // Loop back to start
        }
    }
    
    public void previousSong() {
        if (currentSongIndex > 0) {
            currentSongIndex--;
        } else {
            currentSongIndex = songs.length - 1;  // Loop to end
        }
    }
    
    public void skipToIndex(int index) {
        if (index >= 0 && index < songs.length) {
            currentSongIndex = index;
        }
    }
    
    public void displayInfo() {
        System.out.println("Playlist: " + playlistName);
        System.out.println("Total songs: " + songs.length);
        System.out.println("Current song: " + getCurrentSong());
        System.out.println("Track number: " + (currentSongIndex + 1) + "/" + songs.length);
        System.out.println("Playing: " + isPlaying);
    }
}
