package problems.OtherProblems;

import java.util.Arrays;

public class MakeStringAnagram {
    public static void main(String[] args) {
        System.out.println(canMakeAnagrams("dcvasnjmhiklouyt","dash"));
    }

    public static String canMakeAnagrams(String s1, String s2){
        for(int i=0; i<s2.length(); i++)
        {
         if (s1.indexOf(s2.charAt(i)) == -1){
             return "False";
         }
        }
        return "True";
    }
}
