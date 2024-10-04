package problems.MediumLevel;

import java.util.ArrayList;

public class IndexesSubArraySum {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,4,5,6,7,8,9,10},10,11));
        System.out.println(subarraySum(new int[]{1,2,3,7,5},10,56));
    }

    public static ArrayList<Integer>  subarraySum(int[] arr, int n, int s) {
        // code here

        ArrayList<Integer> al = new ArrayList<>();
        int sum =0;
        int j=0;

        for (int i=0;i < arr.length;i++){
            sum = sum  + arr[i];
            System.out.println("sum :"+sum+" i :"+i+" j :"+j);
            if( sum > s){
                while (s < sum && j < i) {
                    sum = sum - arr[j];
                    j++;
                }
            }
            if (sum == s){
                System.out.println("sum is found: "+sum+" at Index :"+i+" from index: "+j);
                al.add(j+1);
                al.add(i+1);
                return al;
            }
        }

        if (al.isEmpty()){
            al.add(-1);
        }
        return al;
    }
}
