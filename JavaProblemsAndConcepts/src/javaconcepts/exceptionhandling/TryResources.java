package javaconcepts.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryResources {
    static FileInputStream fi;
    static Scanner sc;

    static void divide() throws Exception{
        fi = new FileInputStream("src/javaconcepts/exceptionhandling/demo");
        sc = new Scanner(fi);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);

        fi.close();
        sc.close();
    }
    static void divideWithTryFinally() throws Exception{
        fi = new FileInputStream("src/javaconcepts/exceptionhandling/demo");

        //with finally
        try{
            sc = new Scanner(fi);
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }finally {
            fi.close();
            sc.close();
        }
    }

    static void divideWithTryResource() throws Exception{

        //with Resource
        try(FileInputStream f = new FileInputStream("src/javaconcepts/exceptionhandling/demo");
            Scanner sc = new Scanner(f)){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }

    public static void main(String[] args) throws Exception {
        //without closing any resource
        try {
            divide();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        int x= sc.nextInt();
        System.out.println(x);

        //with try finally
        try {
            divideWithTryFinally();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        //uncomment to check finally demo
//        x= sc.nextInt();
//        System.out.println(x);


        //with try resource
        try {
            divideWithTryResource();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        x= sc.nextInt();
        System.out.println(x);
    }
}
