package GeeksForGeeks.easy;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
//        countSort("edsab");
        System.out.println(countSort("eedsab"));
    }

    public static String countSort(String arr)
    {
        // code here
        final String  ALPHABET_ORDER="abcdefghijklmnopqrstuvwxyz";
        char[] c= new char[26];
        int[] count= new int[26];
        for(int i=0;i< arr.length();i++){
            count[ALPHABET_ORDER.indexOf(arr.charAt(i))]++;
        }

        System.out.println(Arrays.toString(count));
        StringBuilder s= new StringBuilder();

        for (int i=0;i< count.length;i++){

            if (count[i] ==1){
                s.append(ALPHABET_ORDER.charAt(i));
            }else if( count[i] > 1){
                int index=count[i];
                while (index > 0){
                    s.append(ALPHABET_ORDER.charAt(i));
                    index--;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        return s.toString();
    }
}
