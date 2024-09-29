package problems.OtherProblems;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-10));
        System.out.println(stringPalindrome("TenEt"));
    }

    public static boolean isPalindrome(int number){
        int reverse =0;
        int lastDigit;
        int num = number;
        for (int i=0; num > 0;i++){
            lastDigit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + lastDigit;
        }
        System.out.println(reverse);
        System.out.println(number);
        return (reverse == number);
    }

    public static boolean stringPalindrome(String s){

        StringBuilder sb= new StringBuilder(s.toLowerCase());
        String newStr=sb.reverse().toString();
        System.out.println(sb);
        System.out.println(newStr);
        return s.toLowerCase().equals(newStr);
    }
}
