package javaconcepts.exceptionhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack s= new Stack(5);
        Scanner sc= new Scanner(System.in);
        try {
            while (true) {
                int a = sc.nextInt();
                s.push(a);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            while (true) {
                System.out.println(s.pop());
            }
        }catch (StackUnderFlow e){
            System.out.println(e);
        }

    }
}
