package problems;

public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZerosInFact(100));
    }

    public static int trailingZerosInFact(int N){

        int res=0;
        for (int i =5 ;i <= N;i *=5){
            res = res + (N / i);
        }
        return res;
    }
}
