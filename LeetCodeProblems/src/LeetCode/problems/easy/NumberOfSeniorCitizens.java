package LeetCode.problems.easy;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        System.out.println(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }
    public static int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            System.out.println(s.substring(11,13));
            int i=Integer.parseInt(s.substring(11,13));
            if(i > 60){
                count=count+1;
            }
        }
        return count;
    }
}
