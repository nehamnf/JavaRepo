package problems;

public class PatterSearching {
    public static void main(String[] args) {
        patterSearch("abcd pgcdcd","cd");
        System.out.println(findPattern("hello","llop"));
    }

    public static void patterSearch(String str,String find){
        int pos=str.indexOf(find);
        while ( pos >= 0) {
            System.out.println(pos);
            pos = str.indexOf(find,pos+1);
        }

    }

    public static int findPattern(String s, String p){
        // code here
//        String ss=null;
//        String b=null;
//        System.out.println(ss.contains(b));
       return s.indexOf(p);

    }
}
