package problems.OtherProblems;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] a= {10,20,30,50};
        arrayTraversal(a);
        System.out.println();
        arrayTraversalReverse(a);
        System.out.println();
        System.out.println(Arrays.toString(decrementArrayElements(a)));
        System.out.println(Arrays.toString(a));
        int[] b={54,8,43,2,1,5};
        System.out.println("Less the : "+Arrays.toString(lessThan(b,26)));
    }
    public static void arrayTraversal(int[] numbers){
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void arrayTraversalReverse(int[] numbers){
        for (int i =numbers.length-1;i >= 0;i--){
            System.out.print(numbers[i]+" ");
        }
    }

    public static int[] decrementArrayElements(int[] numbers){
        int temp;
        for (int i =0;i < numbers.length;i++){
            temp = numbers[i];
            numbers[i]= temp-1;
        }
        return numbers;
    }

    public static int[] lessThan(int[] numbers,int k){
        int[] b= new int[numbers.length];
        for (int i =0;i < numbers.length;i++){
            if (numbers[i] < k){
                b[i]= numbers[i];
            }
        }
        return removeZeros(b);
    }

    public static int[] removeZeros(int[] c){
        int count=0;
        for (int j : c) {
            if (j != 0) {
                count = count + 1;
            }
        }

        int[] d= new int[count];
        int  j=0;
        for (int k : c) {
            if (k != 0) {
                d[j++] = k;
            }
        }

        return d;
    }

}
