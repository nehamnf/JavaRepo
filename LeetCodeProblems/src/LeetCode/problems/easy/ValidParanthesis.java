package LeetCode.problems.easy;

import java.util.Arrays;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("({}){[]}"));
    }

    public static boolean isValid(String s) {
        char[] c= new char[s.toCharArray().length];
        int j=-1;
        System.out.println(Arrays.toString(s.toCharArray()));
        for (char value : s.toCharArray()) {
            System.out.println(value);
            switch (value) {
                case '(', '{', '[': {
                    c[++j] = value;
                    System.out.println("--"+Arrays.toString(c)+" j "+j);
                    break;
                }
                case ')': {
                    if(j == -1  || c[j--] != '('){
                        return false;
                    }
                    break;
                }
                case ']':
                {
                    if(j == -1  || c[j--] != '['){
                        return false;
                    }
                    break;
                }
                case '}': {
                    if(j == -1  || c[j--] != '{'){
                        return false;
                    }
                }
                break;
            }
        }

        System.out.println(Arrays.toString(c)+" === "+j);
        return j == -1;
    }
}
