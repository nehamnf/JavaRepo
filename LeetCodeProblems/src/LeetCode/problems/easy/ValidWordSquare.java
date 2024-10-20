package LeetCode.problems.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidWordSquare {
    public static void main(String[] args) {
        String[] str= new String[]{"abcd","bnrt","crm","dt"};
        System.out.println(validWordSquare(Arrays.asList(str)));
    }

    public static boolean validWordSquare(List<String> words) {

        for(int i=0;i < words.size();i++){
            String str= words.get(i);
            StringBuilder sbr=new StringBuilder();
            for (int j=0;j < words.size() ;j++){
                if (i < words.get(j).length()) {
                    sbr.append(words.get(j).charAt(i));
                }
            }
            if(!str.contentEquals(sbr)){
                return false;
            }
        }
        return true;
    }
}
