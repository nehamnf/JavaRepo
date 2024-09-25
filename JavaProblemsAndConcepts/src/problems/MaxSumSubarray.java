package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSumSubarray {
    public static void main(String[] args) {
        System.out.println(maximumSumSubarray(1,new ArrayList<>(Arrays.asList(100,700,200,100,900)),5));
    }

    //sliding window pattern
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here
        int currentsum=0;
        int maxsum=0;
        int previous=0;
        int next=0;
        for(int i=0;i < K;i++){
                currentsum=currentsum+Arr.get(i);
        }

        maxsum=currentsum;
        for (int i=1;i <= N-K ;i++) {
            previous=Arr.get(i-1);
            next=Arr.get(i+(K-1));
            currentsum= currentsum - previous + next;
            maxsum= Math.max(currentsum,maxsum);
        }

        System.out.println("maxsum: "+maxsum);
        return  maxsum;

    }
}
