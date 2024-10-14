package GeeksForGeeks.easy;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {
        System.out.println(leaders(5,new int[]{10,4,2,4,1}));
    }

    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here

        ArrayList<Integer> al= new ArrayList<>();
        int large=arr[n-1];
        al.add(arr[n-1]);
        for (int i=n-2;i >=0 ;i--){
            if(arr[i] >= large) {
                large=arr[i];
                al.add(large);
                System.out.println(arr[i]);
            }
        }

        Collections.reverse(al);
        return al;
    }
}
