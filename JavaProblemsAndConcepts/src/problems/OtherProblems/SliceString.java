package problems.OtherProblems;

public class SliceString {
    public static void main(String[] args) {
        System.out.println(sliceString("neh"));

    }
    public static String sliceString(String s){
        System.out.println(String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1).toLowerCase());
        System.out.println(s.toUpperCase());
        if(s.length() >2) {
            return (s.substring(1, s.length() - 1));
        }
        return "";
    }
}
