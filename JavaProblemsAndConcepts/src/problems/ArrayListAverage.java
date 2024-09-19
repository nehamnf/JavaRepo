package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAverage {
    public static void main(String[] args) {
        System.out.println(posAverage(new ArrayList<Integer>(Arrays.asList(92,2,74,55,0, 10, -60, 24, 91, -67, 11))));
        System.out.println(fillArrayList(new int[]{11,2,13,4,5},5));
    }

    public static double posAverage(ArrayList<Integer> numbers){
        double sum=0;
        double count=0;
        for (Integer i:numbers){
            if(i >= 0){
                sum=sum+i;
                count = count+1;
                System.out.println("sum: "+sum);
                System.out.println("Count: "+count);
            }
        }
        return (double) (sum/count);
    }

    public static ArrayList<Integer> fillArrayList(int arr[], int n)
    {
        //Your code here
        ArrayList<Integer> arrList= new ArrayList<>();
        for(int i=0;i <n;i++){

            arrList.add(arr[i]);
        }
        Collections.sort(arrList);
        Collections.reverse(arrList);
        arrList.size();
        return arrList;
    }


}
