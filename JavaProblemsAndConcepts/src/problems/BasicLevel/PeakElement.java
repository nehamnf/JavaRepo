package problems.BasicLevel;
/*
Accolite,Amazon,Visa,Adobe,Google
 */
public class PeakElement {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{1,2,1,3,5,6,4},7));
    }

    public static int peakElement(int[] arr,int n)
    {
        //add code here.

        for (int i=0;i < n;i++){
            if (i ==0){
                if (arr[i] >= arr[i+1]){
                    System.out.println("i value: "+i+" First element: "+arr[i]);
                    return i;
                }
            }else if (i == n-1){
                if (arr[i] >= arr[i-1]){
                    System.out.println("i value: "+i+" last element: "+arr[i]);
                    return i;
                }
            }else{
                if (arr[i-1] <= arr[i] && arr[i] >= arr[i+1]){
                    System.out.println("i value:  "+i+" Mid element: "+arr[i]);
                    return i;
                }
            }
        }
        return 0;
    }
}
