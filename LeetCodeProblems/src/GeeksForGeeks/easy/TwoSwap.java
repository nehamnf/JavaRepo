package GeeksForGeeks.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSwap {

    public static void main(String[] args) {
        checkSorted(new ArrayList<>(Arrays.asList(1,2,4,3,6,5)));
    }

    public static boolean checkSorted(List<Integer> arr) {
        // code here

        Collections.sort(arr);

        System.out.println(arr);

        int j=0;
//        for(int i=0;i < arr.size();i++){
//            if (arr.get(i))
//        }
        return false;
    }
}
