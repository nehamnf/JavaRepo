package LeetCode.problems.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,7})));
    }
    public static int[] plusOne(int[] digits) {

        int count =0;
        int i=digits.length-1;
        while(i > -1){
            if (digits[i] ==9){
                digits[i] =0;
                count=count+1;
            }else {
                break;
            }
            i--;
        }

        System.out.println(count);

        if (count == digits.length){
            int[] arr= new int[digits.length+1];
            arr[0]=1;
            System.out.println(Arrays.toString(arr));
            return arr;
        }

        if( count ==0){
            int num=digits[digits.length-1];
            digits[digits.length-1]=num+1;
            return digits;
        }

        if(count < digits.length){
            int num=digits[digits.length-count-1];
            digits[(digits.length-count)-1]=num+1;
            return digits;
        }

        return new int[1];
    }

    public int[] plusOneBetter(int[] digits) {
        int n = digits.length;

        //Move along the input array starting from the end
        for (int idx = n - 1; idx >= 0; --idx) {
            //Set all the nines at the end of the array to zeros
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            //Here we have the rightmost not-nine
            else {
                // Increase this rightmost not-nine by 1
                digits[idx]++;

                // and the job is done
                return digits;
            }
        }

        // We're here because all the digits are nines
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
