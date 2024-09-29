package problems.OtherProblems;

import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] n = new int[]{4, 3, 2, 5, 14, 17, 18, 19};
        System.out.println(Arrays.toString(evenOdd(n)));
        System.out.println(Arrays.toString(separateEvenOdd(n)));
    }

    public static int[] evenOdd(int[] numbers){
        int[] a= new int[numbers.length];
        int j=0;
        for(int i :numbers){
            if ( i % 2 ==0){
                a[j++]=i;
            }
        }
        for(int i:numbers){
            if (i % 2 !=0){
                a[j++]=i;
            }
        }
        return a;
    }

    //left right pointer methods
    public static int[] separateEvenOdd(int[] n){
        int left=0;
        int right= n.length -1;

        while (left < right){

            while (left < right && (n[left] % 2 ==0)){
                left ++;
            }

            while (left < right && (n[right] % 2 !=0)){
                right--;
            }

            if (left < right){
                int temp=n[left];
                n[left]= n[right];
                n[right]=temp;
                left ++;
                right --;
            }
        }

        return n;
    }
}
