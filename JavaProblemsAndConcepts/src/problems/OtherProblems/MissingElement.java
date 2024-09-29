package problems.OtherProblems;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        System.out.println(missingNumber(3,new int[]{1,3}));
    }

    public static int missingNumber(int n, int arr[]) {

        if ( n == arr.length){
            return n;
        }
        boolean[] b= new boolean[n+1];
        for (int j : arr) {
            if (!b[j]) {
                b[j] = true;
            }
        }
        for (int i=1;i<b.length;i++){
            if (!b[i]) {
                return i;
            }
        }
        return n;
    }
}
