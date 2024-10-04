package problems.MediumLevel;

import java.util.Arrays;

/*
Amazon,Google,Facebook
 */
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(findTriplets(new int[]{0,-1,-3,1,2},5));
        System.out.println(findTriplets(new int[]{1,2,3},3));
        System.out.println(findTriplets(new int[]{97,-27,2,-34,61 ,-39},6));
    }

    public static boolean findTriplets(int arr[] , int n)
    {
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
                if (sum ==0){
                    System.out.println("Sum is zero");
                    return true;
                }else if (sum < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return false;
    }
}
