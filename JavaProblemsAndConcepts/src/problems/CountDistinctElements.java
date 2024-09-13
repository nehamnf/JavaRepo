package problems;

public class CountDistinctElements {
    public static void main(String[] args) {
            distinctEle(new int[]{5});
    }

    public  static void distinctEle(int[] arr){
        boolean isDistinct;

        // Count of distinct elements
        int count = 0;

        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            isDistinct = true; // Assume the current element is distinct
            // Check if the current element has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false; // Element has appeared before
                    break;
                }
            }
            // If the element is distinct, increase the count
            if (isDistinct) {
                count++;
            }
        }
        System.out.println(count);
    }
}
