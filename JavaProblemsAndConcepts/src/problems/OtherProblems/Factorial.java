package problems.OtherProblems;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialUsingLoop(6));
        System.out.println(factorialUsingRecursion(120));
    }

    public  static  long factorialUsingLoop(int N) {
        // Your code here
        long res=1;
        for (int i=1;i <= N;i++){
            res = res * i;
        }
        return res;
    }

    public  static  long factorialUsingRecursion(int N) {
        // Your code here
        if ( N == 1){
            return 1;
        }
        return N * factorialUsingRecursion(N-1);
    }
}
