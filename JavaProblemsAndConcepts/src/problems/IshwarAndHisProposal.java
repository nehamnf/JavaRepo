package problems;

import java.util.ArrayList;
import java.util.Collections;

public class IshwarAndHisProposal {
    public static void main(String[] args) {
        System.out.println(acceptedProposals(new int[]{1,2,3,4},4));
    }

    public static ArrayList<Integer> acceptedProposals (int arr[], int n)
    {
        ArrayList<Integer> al= new ArrayList<>();
        int largest1=Integer.MIN_VALUE;
        int largest2=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i] > largest1) {
                largest2=largest1;
                largest1=arr[i];
                System.out.println("--"+largest1);
            }else if(arr[i] > largest2) {
                largest2=arr[i];
            }

            if(arr[i] < min1) {
                min2=min1;
                min1=arr[i];
            }else if(arr[i] < min2) {
                min2=arr[i];
            }
        }
        System.out.println(largest1);
        System.out.println(largest2);
        System.out.println(min1);
        System.out.println(min2);
        al.add(largest2);
        al.add(min2);
        return al;
    }
}
