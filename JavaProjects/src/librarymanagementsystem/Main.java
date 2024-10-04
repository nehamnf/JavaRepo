package librarymanagementsystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create repositories for different item types
        Repository<Book> bookRepo = new Repository<>();
        Repository<Magazine> magazineRepo = new Repository<>();
        Repository<DVD> dvdRepo = new Repository<>();

        // Add items to repositories
        bookRepo.addItem(new Book("B001", "Java Programming", "Alice Smith", 500));
        bookRepo.addItem(new Book("B002", "Effective Java", "Joshua Bloch", 416));
        bookRepo.addItem(new Book("B003", "Clean Code", "Robert C. Martin", 464));

        magazineRepo.addItem(new Magazine("M001", "Tech Today", 45));
        magazineRepo.addItem(new Magazine("M002", "Science Weekly", 12));

        dvdRepo.addItem(new DVD("D001", "Inception", "Christopher Nolan", 148));
        dvdRepo.addItem(new DVD("D002", "The Matrix", "The Wachowskis", 136));

        // Display all items
        System.out.println("Books in Repository:");
        bookRepo.displayAllItems();

        System.out.println("\nMagazines in Repository:");
        magazineRepo.displayAllItems();

        System.out.println("\nDVDs in Repository:");
        dvdRepo.displayAllItems();

        // Use generic utility methods
        List<Book> books = bookRepo.getAllItems();
        Book foundBook = LibraryUtils.findItem(books, "B002");
        System.out.println("\nFound Book:");
        if (foundBook != null) {
            foundBook.displayInfo();
        }

        // Convert array to list using generic method
        String[] titles = {"Java Programming", "Effective Java", "Clean Code"};
        List<String> titleList = LibraryUtils.arrayToList(titles);
        System.out.println("\nList of Titles:");
        for (String title : titleList) {
            System.out.println(title);
        }

        // Use Comparator with bounded type parameters
        BookPageComparator comparator = new BookPageComparator();
        Book book1 = bookRepo.getItemById("B001");
        Book book2 = bookRepo.getItemById("B003");
        if (book1 != null && book2 != null) {
            int comparison = comparator.compare(book1, book2);
            if (comparison > 0) {
                System.out.println("\n\"" + book1.getTitle() + "\" has more pages than \"" + book2.getTitle() + "\".");
            } else if (comparison < 0) {
                System.out.println("\n\"" + book2.getTitle() + "\" has more pages than \"" + book1.getTitle() + "\".");
            } else {
                System.out.println("\nBoth books have the same number of pages.");
            }
        }

        // Use wildcard utilities
        System.out.println("\nPrinting all library items using wildcard:");

        Repository<? extends LibraryItem>[] repos= new Repository[]{bookRepo, magazineRepo, dvdRepo};
        List<LibraryItem> allItems = RepositoryUtils.combineRepositories(repos);
        WildcardUtils.printItems(allItems);

        // Calculate total pages of books
        double totalPages = WildcardUtils.calculateTotalPages(books);
        System.out.println("\nTotal number of pages in all books: " + totalPages);

        // Add a new book using lower bounded wildcard
        List<? super Book> updatedBooks=WildcardUtils.addNewBook(bookRepo.getAllItems());
        System.out.println("\nBooks after adding a new one:");
        bookRepo.displayAllItems();

        // Optionally displaying the updated list from updatedBooks
        System.out.println("\nUpdated Books List (from updatedBooks):");
        for (Object item : updatedBooks) {
            System.out.println(item);  // Casting Object back to LibraryItem
        }

    }
}
