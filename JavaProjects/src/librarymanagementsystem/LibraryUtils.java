package librarymanagementsystem;

import java.util.Arrays;
import java.util.List;

public class LibraryUtils {
    public static <T extends LibraryItem> T findItem(List<T> items, String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
