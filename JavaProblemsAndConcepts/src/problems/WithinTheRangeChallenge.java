package problems;

public class WithinTheRangeChallenge {
    public static void main(String[] args) {
        System.out.println(withinTheRange(7));
        System.out.println(withinTheRangeEasy(9));
    }

    public static String withinTheRange(int n){
        int i=10;
        int count=1;

        if ( n < 10){
            if ( (n >= -3) && (n <= 3)){
                return "True";
            }
        }
        while( i >= 10){
            count = count +1;
            if((n  <= (i+3)) && (n >= (i-3))){
                    return "True";
            }else if (( n > (i+3) && (n < (10*count)-3))) {
                return "False";
            }
            i= count*10;
        }
        return "False";
    }

    public static String withinTheRangeEasy(int n){
        // Compute the remainder when dividing by 10
        int remainder = n % 10;

        // Check if the remainder is within 3 units of any multiple of 10
        if(Math.abs(remainder) <= 3 || Math.abs(remainder - 10) <= 3){
            return "True";
        }
        return "False";
    }
}
