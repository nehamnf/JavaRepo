package problems.OtherProblems;

public class secondLargest {
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{10,10,13,2,3,54}));
    }
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int largest=arr[0];
        int secondLargest=-1;

        for (int i=1;i< arr.length;i++){
            if (arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
         }
        return secondLargest;
    }
}
