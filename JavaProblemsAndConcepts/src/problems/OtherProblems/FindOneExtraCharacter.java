package problems.OtherProblems;

public class FindOneExtraCharacter {
    public static void main(String[] args) {
        System.out.println(extraChar("abc","asbc"));
        System.out.println(extraCharUsingXOR("abc","ajbc"));
    }

    public static char extraChar(String s1, String s2){
        boolean isSame=true;
        char c='#';
        for (int i=0;i < s2.length()-1;i++){
            if  (s1.indexOf(s2.charAt(i)) == -1){
                System.out.println(s2.charAt(i));
                isSame=false;
                c=s2.charAt(i);
            }
        }

        if (isSame){
            return s2.charAt(s2.length()-1);
        }
        return c;
    }

    public static char extraCharUsingXOR(String s1, String s2){

        int res=0;

        for (int i=0;i<s1.length();i++){
            res =res ^ s1.charAt(i) ^ s2.charAt(i);
        }
        res =res  ^ s2.charAt(s2.length()-1);
        return (char)res;
    }
}
