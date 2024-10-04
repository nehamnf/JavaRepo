package javaconcepts.exceptionhandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


class customException extends  Exception{

    @Override
    public String toString() {
        return "Custom exception";
    }
}
public class CheckedUncheckedException {
    public static void main(String[] args) throws FileNotFoundException {

       try {
           fun3();
       } catch (customException e) {
            System.out.println(e);
        }
    }

    static void fun3() throws FileNotFoundException,customException {

        fun2();
        if (true) {
            throw new customException();
        }
        //checked Exception
        FileInputStream fIO = new FileInputStream("x.txt");


    }

    static void fun2(){
        fun1();
    }

    static void fun1() {
        //unchecked exception
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Division by Zero");
        }

    }
}
