package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDistinctElements {
    public static void main(String[] args) {
        distinctEle(new int[]{5});
        countDistinct(new ArrayList<Integer>(Arrays.asList(5,217,5,2,3, 10, 10,6,8)));
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5,217,5,2,3, 10, 10,6,8);

        countDistinctBetterApproach(numbers);
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
//        System.out.println(count);
    }

    public static void countDistinct(ArrayList<Integer> numbers){
        int count=0;
        boolean isDistinct=true;
        Collections.sort(numbers);
        for(int i=numbers.size()-1;i >=0 ;i--){
            isDistinct = true;
            System.out.println("get(i) :"+numbers.get(i));
            for (int j=numbers.size()-1;j > i;j--){
                System.out.println("get(j) :"+numbers.get(j));
                if(numbers.get(i).equals(numbers.get(j))) {
                        isDistinct=false;
                        break;
                }
            }
            System.out.println(isDistinct);
            if(isDistinct){
                count=count+1;

            }
        }
        System.out.println("count : "+count);
    }

    public static void countDistinctBetterApproach(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        ArrayList<Integer> distinctNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0 || !numbers.get(i).equals(numbers.get(i - 1))) {
                distinctNumbers.add(numbers.get(i));
            }
        }

        System.out.println("Distinct numbers:");
        for (int num : distinctNumbers) {
            System.out.println(num);
        }

        System.out.println("Count of distinct elements: " + distinctNumbers.size());
    }
}
