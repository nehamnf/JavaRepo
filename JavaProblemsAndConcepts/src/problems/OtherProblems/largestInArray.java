package problems.OtherProblems;

public class largestInArray {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{1,4,78,46}));
    }

    public static int largest(int[] arr) {
        int largest=arr[0];
        for(int i =0;i< arr.length;i++){
            if (arr[i] > largest) {
                largest= arr[i];
            }
        }
        return largest;
    }
}
