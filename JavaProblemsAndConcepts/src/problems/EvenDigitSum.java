package problems;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum =0;
        int len = String.valueOf(number).length();
        for (int i =1; i <= len;i++){
            int rem = number % 10;
            number = number / 10;
            if ( rem  % 2 ==0){
                sum = sum + rem;
            }
        }
        return sum;
    }
}
