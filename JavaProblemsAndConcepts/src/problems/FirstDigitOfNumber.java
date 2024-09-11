package problems;

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        System.out.println(firstDigit(789111123));
    }
    public static int firstDigit(int n){
        for (int i=1; n > 0;i++){
            if(n/10 == 0){
                return n;
            }else{
                n = n/10;
            }
        }
        return n;
    }
}
