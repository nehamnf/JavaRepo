package problems;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number){
        int reverse =0;
        int lastDigit;
        int num = Math.abs(number);
        String s = String.valueOf(num);
        System.out.println(s.length());
        for (int i=1; i <= s.length();i++){
            lastDigit = num % 10;
            num = num / 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            System.out.println(reverse);
        }
        return (reverse == Math.abs(number));
    }
}
