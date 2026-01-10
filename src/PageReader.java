public class PageReader {
    
    // Students will work with index for page navigation
    
    private String bookTitle;
    private String[] pages;
    private int currentPage;
    private int bookmark;
    
    public PageReader(String bookTitle, String[] pages) {
        this.bookTitle = bookTitle;
        this.pages = pages;
        this.currentPage = 0;
        this.bookmark = -1;  // -1 means no bookmark
    }
    
    // Getters
    public String getBookTitle() {
        return this.bookTitle;
    }
    
    public String[] getPages() {
        return this.pages;
    }
    
    public int getCurrentPage() {
        return this.currentPage;
    }
    
    public int getBookmark() {
        return this.bookmark;
    }
    
    public int getTotalPages() {
        return this.pages.length;
    }
    
    // Setters
    public void setCurrentPage(int page) {
        if (page >= 0 && page < pages.length) {
            this.currentPage = page;
        }
    }
    
    public void setBookmark(int page) {
        if (page >= 0 && page < pages.length) {
            this.bookmark = page;
        }
    }
    
    // Navigation methods
    public String getCurrentPageContent() {
        if (currentPage >= 0 && currentPage < pages.length) {
            return pages[currentPage];
        }
        return null;
    }
    
    public String getPageAt(int pageNumber) {
        if (pageNumber >= 0 && pageNumber < pages.length) {
            return pages[pageNumber];
        }
        return null;
    }
    
    public void nextPage() {
        if (currentPage < pages.length - 1) {
            currentPage++;
        }
    }
    
    public void previousPage() {
        if (currentPage > 0) {
            currentPage--;
        }
    }
    
    public void goToPage(int pageNumber) {
        if (pageNumber >= 0 && pageNumber < pages.length) {
            currentPage = pageNumber;
        }
    }
    
    public void addBookmark() {
        this.bookmark = currentPage;
    }
    
    public void goToBookmark() {
        if (bookmark >= 0 && bookmark < pages.length) {
            currentPage = bookmark;
        }
    }
    
    public void clearBookmark() {
        this.bookmark = -1;
    }
    
    public boolean hasBookmark() {
        return bookmark != -1;
    }
    
    public boolean isFirstPage() {
        return currentPage == 0;
    }
    
    public boolean isLastPage() {
        return currentPage == pages.length - 1;
    }
    
    public void displayInfo() {
        System.out.println("Book: " + bookTitle);
        System.out.println("Total pages: " + pages.length);
        System.out.println("Current page: " + (currentPage + 1) + "/" + pages.length);
        if (hasBookmark()) {
            System.out.println("Bookmark at page: " + (bookmark + 1));
        } else {
            System.out.println("No bookmark");
        }
    }
}
