package problems.OtherProblems;

import java.util.ArrayList;
import java.util.List;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(10);
        arr.add(20);
        System.out.println(arraySortedOrNot(arr));

    }

    public static boolean arraySortedOrNot(List<Integer> arr) {
        boolean isSorted=false;

        if(arr.size() == 1){
            isSorted = true;
            return isSorted;
        }

        for (int i=1; i < arr.size();i++){
            if( arr.get(i) >= arr.get(i - 1)){
                isSorted=true;
            }else {
                return false;
            }
        }
        return isSorted;
    }
}
