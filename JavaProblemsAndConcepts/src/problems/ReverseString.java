package problems;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }

    public static String reverseWords(String str) {
        // code here

        String[] s= str.split("\\.");
        String[] reverse=new String[s.length];
        int j=-1;
        for(int i=s.length-1;i >=0;i--){
            reverse[++j]=s[i];
            System.out.println(reverse[j]);

        }
        return (String.join(".",reverse));
    }
}
