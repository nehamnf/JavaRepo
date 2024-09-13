package problems;

public class CountTotalWords {
    public static void main(String[] args) {
        System.out.println(countWords("hello neha how r u"));
    }
    public static int countWords(String str)
    {
        return str.split(" ").length;
    }
}
