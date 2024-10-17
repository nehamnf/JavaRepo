package LeetCode.problems.easy;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abcde","abcde"));
    }

    public static boolean isSubsequence(String s, String t) {

        int i=0,j=0;
        while( i < t.length() && j < s.length()){
            if( t.charAt(i) == s.charAt(j)){
                System.out.println(t.charAt(i) +" - "+s.charAt(j));
                i++;j++;
            }else{
                i++;
            }
        }

        System.out.println(j);
        return j == s.length();
    }
}
