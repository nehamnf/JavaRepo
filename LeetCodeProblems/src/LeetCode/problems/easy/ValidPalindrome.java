package LeetCode.problems.easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0p"));
        System.out.println(isPalindromeApproach2("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeApproach2("0p"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        // Step 1: Filter the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Check for palindrome
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeApproach2(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int j=sb.length()-1;
        for (int i=0;i< sb.length();i++){
            if (sb.charAt(i) != sb.charAt(j--)){
                return false;
            }
        }

        return true;
    }
}

