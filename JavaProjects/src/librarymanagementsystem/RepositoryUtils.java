package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class RepositoryUtils {
    // Method to combine multiple repositories into a list of LibraryItems


    public static List<LibraryItem> combineRepositories(Repository<? extends LibraryItem>[] repos) {
        List<LibraryItem> combined = new ArrayList<>();
        for (Repository<? extends LibraryItem> repo : repos) {
            combined.addAll(repo.getAllItems());
        }
        return combined;
    }
}
