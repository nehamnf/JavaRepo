package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CheckIfArrayListSorted {
    public static void main(String[] args) {
//        System.out.println(isSorted(new ArrayList<>(Arrays.asList(-1,4,4,4,4))));
        System.out.println(isSorted(new ArrayList<>(Arrays.asList(9, 8,7,3,5))));
    }

    public static boolean isSorted(ArrayList<Integer> numbers){
        ArrayList<Integer> temp= new ArrayList<>(numbers);
        Collections.sort(temp);
        System.out.println("---numbers--"+numbers);
        System.out.println("---temp---"+temp);
        boolean isAscendingSorted=true;
        boolean isDescendingSorted=true;
        int size=numbers.size();

        if (numbers.size() == 1 || numbers.size() == 2){
            return true;
        }

            for (int i = 0; i < numbers.size(); i++) {
                if (!(numbers.get(i).equals(temp.get(i)))) {
                    isAscendingSorted = false;
                }
            }
            int j=numbers.size();
                for (int i = 0; i < numbers.size(); i++) {
                    j = j - 1;
                    if (!(numbers.get(j) == temp.get(i))) {
                        isDescendingSorted= false;
                        System.out.println("---" + numbers.get(j));
                        System.out.println("==" + temp.get(i));
                }
            }
        if(isAscendingSorted){
            return isAscendingSorted;
        }else if(isDescendingSorted){
            return isDescendingSorted;
        }
        return false;
    }

}
