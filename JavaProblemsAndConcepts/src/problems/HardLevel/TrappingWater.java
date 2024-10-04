package problems.HardLevel;

public class TrappingWater {
    public static void main(String[] args) {
        System.out.println(trappingWaterNaiveApproach(new int[]{3,0,4}));
        System.out.println(trappingWaterTwoPointer(new int[]{3,0,1,0,4,0,2}));
    }

    public static long trappingWaterNaiveApproach(int arr[]) {
        // Your code here

        int left=0;
        int right=0;
        int res=0;
        for (int i=0;i < arr.length;i++){
            left=arr[i];
            for (int j=0;j <= i;j++){
                left=Math.max(left,arr[j]);
            }

            right=arr[i];
            for (int j=i+1;j < arr.length;j++){
                right=Math.max(right,arr[j]);
            }
            res = res+ Math.min(left,right) - arr[i];
        }
        return res;
    }


    public static long trappingWaterTwoPointer(int arr[]) {
        // Your code here
        int left=0;
        int right=arr.length-1;
        int watertrapped=0;
        int leftMax=arr[left];
        int rightMax=arr[right];

        while (left < right){

            if (arr[left] < arr[right]){

                if (arr[left] >= leftMax){
                    leftMax = arr[left];
                }else{
                    watertrapped= watertrapped+leftMax-arr[left];
                }
                left++;
            }else {
                if (arr[right] >= rightMax){
                    rightMax = arr[right];
                }else{
                    watertrapped= watertrapped+rightMax-arr[right];
                }
                right--;
            }
        }
        return watertrapped;
    }
}
