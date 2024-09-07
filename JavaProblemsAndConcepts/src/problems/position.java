package problems;

import java.util.Scanner;

public class position {
    public static String ALPHABET_ORDER = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
//        String s= "discipline";
        System.out.println("Enter the string to find the value of string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String s = "abcdefghijklmnopqrstuvwxyz";
        int index;
        int sum =0;

//        System.out.println(ALPHABET_ORDER.indexOf("n"));

        for (int i=0; i < str.length();i++){
            index = ALPHABET_ORDER.indexOf(str.charAt(i));
            index = index + 1;
            sum = sum + index;
            System.out.println("index---"+index);
        }
        System.out.println("sum-----: "+sum);
    }
}
