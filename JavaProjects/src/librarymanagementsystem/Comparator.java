package librarymanagementsystem;

//this is just to learn not a best practise
public interface Comparator<T extends LibraryItem> {
    int compare(T o1, T o2);
}
