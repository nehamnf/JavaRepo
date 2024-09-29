package problems.OtherProblems;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
            inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum=0;
        int count =0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        while( true){
            if (sc.hasNextInt()){
                sum = sc.nextInt() + sum;
                count = count + 1;
            }else{
                System.out.println("SUM = "+(sum)+" AVG = "+Math.round((double) sum /count));
                System.out.println(count);
                break;
            }
        }
    }
}
