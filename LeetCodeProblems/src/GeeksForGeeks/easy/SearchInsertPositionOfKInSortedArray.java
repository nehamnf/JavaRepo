package GeeksForGeeks.easy;

public class SearchInsertPositionOfKInSortedArray {
    public static void main(String[] args) {
        System.out.println(searchInsertK(new int[]{-14,-5,-4,1,2,4,10,11,20},9,-6));
    }

    static int searchInsertK(int arr[], int N, int k)
    {
        // code here
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
            if (k > 0){
                return right+1;
            }else {
                return left;
            }
    }
}
