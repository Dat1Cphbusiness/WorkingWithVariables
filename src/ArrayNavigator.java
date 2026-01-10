public class ArrayNavigator {
    
    // Students will work with index variables for array navigation
    
    private String[] items;
    private int currentIndex;
    
    public ArrayNavigator(String[] items) {
        this.items = items;
        this.currentIndex = 0;
    }
    
    // Getters
    public String[] getItems() {
        return this.items;
    }
    
    public int getCurrentIndex() {
        return this.currentIndex;
    }
    
    public int getLength() {
        return this.items.length;
    }
    
    // Setters
    public void setCurrentIndex(int index) {
        if (index >= 0 && index < items.length) {
            this.currentIndex = index;
        }
    }
    
    // Navigation methods
    public String getCurrent() {
        if (currentIndex >= 0 && currentIndex < items.length) {
            return items[currentIndex];
        }
        return null;
    }
    
    public String getAt(int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        return null;
    }
    
    public void next() {
        if (currentIndex < items.length - 1) {
            currentIndex++;
        }
    }
    
    public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
        }
    }
    
    public void reset() {
        currentIndex = 0;
    }
    
    public boolean hasNext() {
        return currentIndex < items.length - 1;
    }
    
    public boolean hasPrevious() {
        return currentIndex > 0;
    }
    
    public void displayInfo() {
        System.out.println("Total items: " + items.length);
        System.out.println("Current index: " + currentIndex);
        System.out.println("Current item: " + getCurrent());
    }
}
