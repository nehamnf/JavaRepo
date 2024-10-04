package javaconcepts.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value: ");
        a= sc.nextInt();
        System.out.println("Enter b value: ");
        b= sc.nextInt();
        try {
            int[] arr= new int[]{1,2,3,4};
            c = a / b;
            System.out.println("c :" + c);
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("Division by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception");
        }
        System.out.println("BYE");

        try {
            int[] arr= new int[]{1,2,3,4};
            try {
                c = a / b;
                System.out.println("c :" + c);
            }catch (ArithmeticException e){
                System.out.println("Division by zero");
            }
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception");
        }
    }
}
