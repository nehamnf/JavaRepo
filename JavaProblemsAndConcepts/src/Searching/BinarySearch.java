package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarysearch(new int[]{1,3},3));
        System.out.println(binarysearch(new int[]{-14,-5,-4,1,2,4,10,11,20},-6));
    }

    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int left=0,right=arr.length-1,mid=0,second=0;

        while(left <= right){
            mid=(left+right)/2;
            if(arr[mid] == k){
                return mid;
            }

            if(k > arr[mid]){
                left= mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static int binarysearchRecursion(int[] arr, int k,int l,int r) {
        // Code Here
        int mid=0;
        mid=l+r/2;
        if(arr[mid] == k){
            return mid;
        }
        if (k > arr[mid]) {
            return binarysearchRecursion(arr, k, mid + 1, r);
        }else {
           return binarysearchRecursion(arr, k, l, mid - 1);
        }
    }
}
