package GeeksForGeeks.easy;

public class StableSortPosition {
    public static void main(String[] args) {
        System.out.println(getIndexInSortedArray(new int[]{3, 4, 3, 5, 5, 3, 4, 3, 1, 5},4));
    }

    public static int getIndexInSortedArray(int[] arr, int k) {
        // Write Code Here
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] < arr[k]){
                count++;
            }else if(arr[i] == arr[k] && i < k){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
