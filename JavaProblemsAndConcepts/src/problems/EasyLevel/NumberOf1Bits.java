package problems.EasyLevel;

public class NumberOf1Bits {
    public static void main(String[] args) {

        System.out.println((1^2));
        System.out.println((1^2^7));
        System.out.println((1^2^7^2));
        System.out.println((1^2^7^2^1));
        System.out.println(setBits(7));
        System.out.println(setBitsBriansAlgorithm(7));
    }

    static int setBits(int n) {
        // code here
        int count=0;
        while (n!=0){
            count= count+(n&1);
            n= n>>1;
        }
        return count;
    }

    static int setBitsBriansAlgorithm(int n) {
        // code here
        int count=0;
        while (n!=0){
           n= n&(n-1);
           count=count+1;
        }
        return count;
    }


}
