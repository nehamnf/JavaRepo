package problems.OtherProblems;

public class AllTheAlphabets {
    public static void main(String[] args) {
        System.out.println(completeString("neha"));
    }

    public static String completeString(String s){

        final String ALPHABETS="abcdefghijklmnopqrstuvwxyz";
        boolean[] arr=new boolean[26];
        for (int i=0;i< s.length();i++){
            arr[ALPHABETS.indexOf(s.charAt(i))]=true;
        }

        for(boolean b:arr){
            if (!b){
                return "False";
            }
        }

        return "True";
    }
}
