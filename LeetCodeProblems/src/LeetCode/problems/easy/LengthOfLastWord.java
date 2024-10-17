package LeetCode.problems.easy;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello   how r u "));
    }

    public static int lengthOfLastWord(String s) {
        System.out.println(Arrays.toString(s.split("\\s+")));
        String[] str= s.split("\\s+");
        return str[str.length-1].length();
    }
}
