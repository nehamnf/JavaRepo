package problems.OtherProblems;

public class PrimeFactorization {
    public static void main(String[] args) {
        printPrimeFactorization(5);
    }

    public static void printPrimeFactorization(int n){
        int x =0;
        for (int i=2;i <= n;i++){
            if (isPrimeBetterApr(i)){
                x=i;
                while(n % x ==0){
                    System.out.println(i);
                    x = x *i;
                }
            }
        }

    }

    public static boolean isPrimeBetterApr(int n)
    {
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
