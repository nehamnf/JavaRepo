package problems;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(100,30));
        System.out.println(gcdEuclidean(100,30));
    }

    public static int getGreatestCommonDivisor(int num1,int num2){
        int minNumber = Math.min(num1,num2);
        int gcd =0;

        if ( num1 < 10 || num2 < 10){
            return -1;
        }

        for (int i =1 ;i <= minNumber;i++){
            if ( (num1 % i == 0) && (num2 % i ==0) ){
                gcd =i;
            }
        }
        return gcd;
    }

    public static int gcdEuclidean(int num1,int num2){
        if ( num1 == num2 ){
            return num1;
        }
        if ( num1 > num2)
            return gcdEuclidean(num1 - num2,num2);

        return gcdEuclidean(num1,num2-num1);
    }

    public static int gcdEuclideanBetter(int num1,int num2){
        if ( num2 == 0 ){
            return num1;
        }

        return gcdEuclideanBetter(num2 , num1 % num2);

    }
}
