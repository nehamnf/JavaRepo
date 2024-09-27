package problems;

import java.util.ArrayList;

public class MaxOfAllSubArraysK {
    public static void main(String[] args) {
        System.out.println(max_of_subarrays(2,new int[]{1,2,13, 1, 9,5 ,2, 3, 6, 28, 1, 9 ,33, 6}));
    }
    public static ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        int maxSoFar=arr[0];
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<k;i++){
            if(arr[i] > maxSoFar){
                maxSoFar = arr[i];
            }
        }
        al.add(maxSoFar);
        System.out.println(maxSoFar);
        for(int i=1;i <= arr.length -k;i++){
            System.out.println("==arr[i-1]="+arr[i-1]);
            System.out.println("==arr[i+k-1]="+arr[i+k-1]);
            if (arr[i-1] > arr[i+k-1] && arr[i-1] == maxSoFar){
                maxSoFar=0;
                for(int j=i;j< (i+k-1);j++){
                    if(arr[j] > maxSoFar){
                        maxSoFar = arr[j];
                    }
                }
                System.out.println("---"+i);
            }
            maxSoFar=Math.max(maxSoFar,arr[i+k-1]);
            al.add(maxSoFar);
            System.out.println("maxSoFar: "+maxSoFar +" i: "+i);
        }
        return al;
    }
}
