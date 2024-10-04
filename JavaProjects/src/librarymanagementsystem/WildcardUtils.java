package librarymanagementsystem;

import java.util.Arrays;
import java.util.List;

public class WildcardUtils {
    public static void printItems(List<? extends LibraryItem> items) {
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    public static double calculateTotalPages(List<Book> books) {
        double total = 0;
        for (Book book : books) {
            total += book.getNumOfPages();
        }
        return total;
    }

    public static List<? super Book> addNewBook(List<? super Book> books) {
        books.add(new Book("B004", "Generics in Action", "John Doe", 350));
        return books;
    }
}
