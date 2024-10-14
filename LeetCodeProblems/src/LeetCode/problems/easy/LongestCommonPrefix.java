package LeetCode.problems.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String small = strs[0];
        String large = strs[strs.length - 1];
        System.out.println(small);
        System.out.println(large);
        StringBuilder subString = new StringBuilder();
        for (int i = 0; i <= small.length() - 1; i++) {
            if (small.charAt(i) != large.charAt(i)) {
                break;
            } else {
                subString.append(small.charAt(i));
            }
        }
        System.out.println(subString);
        return subString.toString();
    }
}
