package problems.MediumLevel;

import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) {
        System.out.println(find3Numbers(new int[]{1,4,45,6,10,8},6,13));

    }
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here

        //add code here.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left=0,right=n-1,value=0,sum=0;

        for (int i=0;i< n;i++){
            value=arr[i];
            left=i+1;
            right=n-1;
            while (left < right){
                sum =value+arr[left]+arr[right];
//                System.out.println("sum: "+sum);
//                System.out.println("value: "+value+" left: "+arr[left]+" right: "+arr[right]);
                if (sum ==x){
                    System.out.println("Sum is present");
                    return true;
                }else if (sum < x){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return false;
    }
}
