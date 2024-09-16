package problems;

public class PatterSearching {
    public static void main(String[] args) {
        patterSearch("abcd pgcdcd","cd");
    }

    public static void patterSearch(String str,String find){
        int pos=str.indexOf(find);
        while ( pos >= 0) {
            System.out.println(pos);
            pos = str.indexOf(find,pos+1);
        }
    }
}
