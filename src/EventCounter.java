public class EventCounter {
    
    // Students will work with multiple counter variables
    
    private String eventName;
    private int attendees;
    private int vipGuests;
    private int regularGuests;
    
    public EventCounter(String eventName) {
        this.eventName = eventName;
        this.attendees = 0;
        this.vipGuests = 0;
        this.regularGuests = 0;
    }
    
    // Getters
    public String getEventName() {
        return this.eventName;
    }
    
    public int getAttendees() {
        return this.attendees;
    }
    
    public int getVipGuests() {
        return this.vipGuests;
    }
    
    public int getRegularGuests() {
        return this.regularGuests;
    }
    
    // Methods for counting
    public void addAttendee() {
        this.attendees++;
    }
    
    public void addVipGuest() {
        this.vipGuests++;
        this.attendees++;
    }
    
    public void addRegularGuest() {
        this.regularGuests++;
        this.attendees++;
    }
    
    public void addMultipleAttendees(int count) {
        this.attendees += count;
    }
    
    public void reset() {
        this.attendees = 0;
        this.vipGuests = 0;
        this.regularGuests = 0;
    }
    
    public void displayInfo() {
        System.out.println("Event: " + eventName);
        System.out.println("Total Attendees: " + attendees);
        System.out.println("VIP Guests: " + vipGuests);
        System.out.println("Regular Guests: " + regularGuests);
    }
}
