package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumPrefixsumRange {
    public static void main(String[] args) {
        System.out.println(maxPrefixes(new ArrayList<>(Arrays.asList(1, -2, 3, 4, -5)),
                new ArrayList<>(Arrays.asList(0, 2, 1)),
                new ArrayList<>(Arrays.asList(4, 3, 3))));
        System.out.println(maxPrefixesBetterApproach(new ArrayList<>(Arrays.asList(1, -2, 3, 4, -5)),
                new ArrayList<>(Arrays.asList(0, 2, 1)),
                new ArrayList<>(Arrays.asList(4, 3, 3))));
    }
    public static List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
        // code here.

        int l=0;
        int r=0;
        int sum=0;
        int maxSoFar=0;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<leftIndex.size();i++){
            l=leftIndex.get(i);
            r=rightIndex.get(i);
            maxSoFar=arr.get(l);
            sum=0;
            for (int j=l;j<= r;j++){
                sum=sum+arr.get(j);
                maxSoFar=Math.max(maxSoFar,sum);
                System.out.println("sum: "+sum);
                System.out.println("maxSoFar: "+maxSoFar);
            }

            al.add(maxSoFar);
        }
        return al;
    }

    public static List<Integer> maxPrefixesBetterApproach(List<Integer> arr, List<Integer> leftIndex, List<Integer> rightIndex) {
        int n = arr.size();
        List<Integer> result = new ArrayList<>();

        int[] prefixSum = new int[n];
        prefixSum[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr.get(i);
        }

        for (int i = 0; i < leftIndex.size(); i++) {
            int l = leftIndex.get(i);
            int r = rightIndex.get(i);

            int maxSoFar = Integer.MIN_VALUE;
            for (int j = l; j <= r; j++) {
                int sum;
                if (l == 0) {
                    sum = prefixSum[j];
                } else {
                    sum = prefixSum[j] - prefixSum[l - 1];
                }
                maxSoFar = Math.max(maxSoFar, sum);
            }
            result.add(maxSoFar);
        }
        return result;
    }

}
