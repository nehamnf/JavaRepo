package problems.OtherProblems;

public class LcmOfNumber {
    public static void main(String[] args) {
        System.out.println(LCM(6,9));

    }
    public static int LCM(int a, int b){
        return ((a * b)/gcdEuclideanBetter(a,b));
    }

    public static int gcdEuclideanBetter(int num1,int num2){
        if ( num2 == 0 ){
            return num1;
        }
        return gcdEuclideanBetter(num2 , num1 % num2);
    }
}
