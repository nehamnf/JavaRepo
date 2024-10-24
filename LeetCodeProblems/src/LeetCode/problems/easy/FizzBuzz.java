package LeetCode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String >  str= new ArrayList<>();
        for(int i=1;i <= n ;i++) {
            System.out.println(i);
            if (((i % 5) == 0) && ((i % 3) == 0)) {
                str.add("FizzBuzz");
            } else if ((i % 3) == 0) {
                str.add("Fizz");
            } else if((i % 5) == 0) {
                str.add("Buzz");
            } else {
                str.add(String.valueOf(i));
            }
        }
        return str;
    }
}
