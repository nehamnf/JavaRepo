package problems.OtherProblems;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binary_to_decimal("10001000"));

    }

    public static int binary_to_decimal(String str) {
        int digit=0;
        int k=1;
        for (int i=str.length()-1;i >=0 ;i--){
            digit= digit + (str.charAt(i)-'0') * k;
            k= k*2;
            System.out.println(digit);
        }
        return digit;
    }
}
