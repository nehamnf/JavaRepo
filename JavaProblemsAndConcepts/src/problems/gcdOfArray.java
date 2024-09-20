package problems;

public class gcdOfArray {
    public static void main(String[] args) {
        System.out.println(getVal(3,new int[]{1,3,7}));
    }
    static Long getVal(int N, int[] A) {
        // code here

        if(N == 1){
            return (long)A[0];
        }
        int val=gcd(A[0],A[1]);
        long mul =A[0]*A[1];

        for(int i=2;i<N;i++){
            System.out.println(A[i]);
            System.out.println(gcd(val,A[i]));
            val=gcd(val,A[i]);
            mul= (long) (mul*A[i] % (Math.pow(10,9)+7));
        }
        return (long)(Math.pow(mul,val) % (Math.pow(10,9)+7));
    }

    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
