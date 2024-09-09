package problems;

public class CountDigits {
    public static void main(String[] args) {
       countDigits(1);
    }

    public static void countDigits(int n){
        int i;
        for (i=1;n > 0;i++){
            n= n /10;
        }
        System.out.println(i-1);

    }
}
