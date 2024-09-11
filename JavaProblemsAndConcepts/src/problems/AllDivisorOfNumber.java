package problems;

public class AllDivisorOfNumber {
    public static void main(String[] args) {
        divisor(100);
    }

    public static void divisor(int n){

        for (int i=1;i <= n;i++){
            if (n %i == 0){
                System.out.print(i+" ");
            }
        }

    }
}
