package librarymanagementsystem;

public class DVD extends LibraryItem{
    private String director;
    private int duration; // in minutes

    public DVD(String id, String title, String director, int duration) {
        super(id, title);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() { return director; }
    public int getDuration() { return duration; }

    @Override
    public void displayInfo() {
        System.out.println("DVD [ID=" + getId() + ", Title=" + getTitle() +
                ", Director=" + director + ", Duration=" + duration + " mins]");
    }
}
