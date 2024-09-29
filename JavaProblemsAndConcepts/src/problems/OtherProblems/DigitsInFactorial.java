package problems.OtherProblems;

public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorialFunc(120));
    }

    public static int digitsInFactorialFunc(int N){
        // code here
        double count =0;

        if (N < 0){
            return 0;
        }

        if ( N == 0 || N ==1){
            return 1;
        }

        for (int i =2; i <= N ; i++){
            System.out.println(i);
            count = count + Math.log10(i);
            System.out.println("count:- "+count);
        }

//        System.out.println(count);
        return (int) (Math.floor(count))+1;
    }

}

