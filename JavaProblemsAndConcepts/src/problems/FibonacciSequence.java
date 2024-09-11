package problems;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(6));
        System.out.println(fibonacciWithoutRecursion(6));
    }


    public static int fibonacciRecursive(int n){

        if (n == 0){
            return 0;
        }
        if (n ==1  ){
            return 1;
        }
        return (fibonacciRecursive(n-1) + fibonacciRecursive(n-2));

    }

    public static int fibonacciWithoutRecursion(int n){
        int f0=0,f1=1,c=0;
        if ( n ==0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        for (int i=2;i <= n;i++){
            c= f0 + f1;
            System.out.println(c);
            f0 =f1;
            f1=c;
        }

        return c;
    }
}
