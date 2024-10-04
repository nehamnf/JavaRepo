package problems.MediumLevel;

import java.awt.geom.Area;

/* companies:
Flipkart,Amazon,Google
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxAreaNaiveApproach(new int[]{6,2,5,3},4));
        System.out.println("---"+maxArea(new int[]{8,2,7,4,1},5));
    }

    public static long maxAreaNaiveApproach(int A[], int len){
        // Code Here
        int min=Integer.MIN_VALUE,maxAreasoFar=Integer.MIN_VALUE;
        for (int i=0;i< len;i++){
            for (int j=i+1;j< len;j++){
                min=Math.min(A[j],A[i]);
                maxAreasoFar= Math.max(maxAreasoFar,(min * (j-i)));
            }
        }
        return maxAreasoFar;
    }

    //using Two Pointers approach
    public static long maxArea(int A[], int len){
        // Code Here

        if(len <= 1){
            return 0;
        }

        long maxAreaSoFar=0;
        int left=0;int right=len-1;

        while (left < right){
            maxAreaSoFar=Math.max(maxAreaSoFar,(Math.min(A[left],A[right])*(right-left)));
            System.out.println("maxSofar: "+maxAreaSoFar);

            if (A[left] < A[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAreaSoFar;
    }

}
