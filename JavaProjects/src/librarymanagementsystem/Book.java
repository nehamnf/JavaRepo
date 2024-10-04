package librarymanagementsystem;

public class Book extends LibraryItem{
    private String author;
    private int numOfPages;

    public Book(String id, String title, String author, int numOfPages) {
        super(id, title);
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }
    public int getNumOfPages() {
        return numOfPages;
    }

    public void displayInfo() {
        System.out.println("Book [ID=" + getId() + ", Title=" + getTitle() +
                ", Author=" + author + ", Pages=" + numOfPages + "]");
    }

    @Override
    public String toString() {
        return "Book [ID=" + getId() + ", Title=" + getTitle() +
                ", Author=" + author + ", Pages=" + numOfPages + "]";
    }
}

