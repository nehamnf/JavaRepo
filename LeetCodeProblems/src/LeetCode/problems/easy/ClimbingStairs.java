package LeetCode.problems.easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("Result: "+climbStairs(5));
    }

    public static int climbStairs(int n) {

        int stair1=0;
        int stair2=1;
        int nStairs=0;

        if(n  ==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        for(int i=1; i <=n;i++ ){
            nStairs = (stair1+stair2);
            System.out.println(nStairs);
            stair1=stair2;
            stair2=nStairs;
        }
        return nStairs;
    }
}
