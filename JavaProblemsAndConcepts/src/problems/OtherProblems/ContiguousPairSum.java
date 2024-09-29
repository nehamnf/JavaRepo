package problems.OtherProblems;

public class ContiguousPairSum {
    public static void main(String[] args) {
        pairSum(new int[]{7,2,7,8,10},5);
    }

    public static void pairSum(int[] arr,int n){
        int sum=0;
        int pair1=0;
        int pair2=0;
        for(int i=0;i < n-1;i++){
            System.out.println("a[i]: " + arr[i]);
            System.out.println("a[i+1]: " + arr[i+1]);
            if((arr[i]+arr[i+1]) > sum) {
                sum=arr[i]+arr[i+1];
                pair1=arr[i];
                pair2=arr[i+1];
            }
        }

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
