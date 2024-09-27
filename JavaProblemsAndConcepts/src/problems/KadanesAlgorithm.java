package problems;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        naiveApproach(new int[]{-2,3,-1,2,3});
        System.out.println(kadanesApproach(new int[]{-2,3,-1,2,3}));
    }

    public static void naiveApproach(int[] arr){

        if (arr.length < 1){
            System.out.println("Length less than 1");
        }

        int currentSum=0;
        int maxSoFar=arr[0];

        for (int i=0;i < arr.length;i++){
            currentSum=0;
            for(int j=i;j< arr.length;j++){
                currentSum=currentSum+arr[j];
                maxSoFar=Math.max(maxSoFar,currentSum);
            }
            System.out.println("maxSoFar :"+maxSoFar);
        }

        System.out.println("Final max sum of contagious sub array :"+maxSoFar);
    }

    public static int kadanesApproach(int[] arr){

        int me=0;
        int ms=arr[0];

        for (int i=1;i< arr.length;i++){
            me=me+arr[i];

            System.out.println(me);
            if (me > ms){
                ms= me;
            }

            if (me <= 0){
                me=0;
            }
        }

        return ms;
    }
}
