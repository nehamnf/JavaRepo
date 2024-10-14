package LeetCode.problems.easy;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }

    public static String mergeAlternately(String word1, String word2) {

        int i=0,j=0;
        StringBuilder s= new StringBuilder();
        int minLength=Math.min(word1.length(),word2.length());
        String str=(word1.length() > word2.length()? word1:word2);
        System.out.println(str);

        while (i < minLength){

            word1.charAt(i);
            System.out.println(word1.charAt(i));
            s.append(word1.charAt(i));
            s.append(word2.charAt(j));
            System.out.println(s);
            i++;
            j++;
        }
        while (j < str.length()){
            s.append(str.charAt(j));
            j++;
        }
        System.out.println(s);
        return s.toString();
    }
}
